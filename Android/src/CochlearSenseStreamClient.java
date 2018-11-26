package com.cochlear.ai;

import android.util.Log;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import com.cochlear.ai.cochlear_senseGrpc.cochlear_senseStub;
import com.google.protobuf.ByteString;
import com.cochlear.ai.cochlear_senseGrpc;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.cochlear.ai.CochlearSense.input;
import com.cochlear.ai.CochlearSense.output;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class CochlearSenseStreamClient {
    private static final long deadline = 10;

    ManagedChannel channel;
    cochlear_senseStub asyncStub;
    CountDownLatch finishLatch;
    StreamObserver<input> requestObserver;

    private CochlearResultListener cochlearResultListener = null;



    private String apiKey;
    private String subtask="";
    private int fs;
    private int bitrate;
    private boolean big_endian = false;
    private boolean signed;





    public static enum ServiceType {
        //Stream service
        eventStream, // 22050 - 0.5sec
        ageGenderStream, // 16000 - 0.5sec
        musicGenreStream, // 22050
        musicMoodStream, //22050 - Not yet implemented
        musicDetectorStream, //22050
        speechDetectorStream, //22050
    }

    private static final Map<ServiceType, Integer> SAMPLE_RATE = Collections.unmodifiableMap(
            new HashMap<ServiceType, Integer>() {{
                put(ServiceType.eventStream, 22050  );
                put(ServiceType.ageGenderStream,  16000);
                put(ServiceType.musicGenreStream,  22050);
                put(ServiceType.musicMoodStream,  22050);
                put(ServiceType.musicDetectorStream,  16000);
                put(ServiceType.speechDetectorStream,  16000);
            }});

    public CochlearSenseStreamClient(String host, int port, String apiKey) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
        this.apiKey = apiKey;
    }

    /** Construct client for accessing RouteGuide server using the existing channel. */
    private CochlearSenseStreamClient(ManagedChannelBuilder<?> channelBuilder) {
        super();
        channel = channelBuilder.build();
        asyncStub = cochlear_senseGrpc.newStub(channel);
    }


    public CochlearSenseStreamClient senseEventStream(String subtask, int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        this.subtask = subtask;
        senseStream(ServiceType.eventStream, fs, bitrate, big_endian, signed);
        return this;
    }
    public CochlearSenseStreamClient senseMusicGenreStream(int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        senseStream(ServiceType.musicGenreStream, fs, bitrate, big_endian, signed);
        return this;
    }
    public CochlearSenseStreamClient senseMusicMoodStream(int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        senseStream(ServiceType.musicMoodStream, fs, bitrate, big_endian, signed);
        return this;
    }

    public CochlearSenseStreamClient senseageGenderStream(int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        senseStream(ServiceType.ageGenderStream, fs, bitrate, big_endian, signed); // 16
        return this;
    }

    public CochlearSenseStreamClient senseSpeechDetectorStream(int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        senseStream(ServiceType.speechDetectorStream, fs, bitrate, big_endian, signed); // 16k
        return this;
    }
    public CochlearSenseStreamClient senseMusicDetectorStream(int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        senseStream(ServiceType.musicDetectorStream, fs, bitrate, big_endian, signed); // 16k
        return this;
    }

    public void end() {

        requestObserver.onCompleted();
    }

    private short[] b2s(byte[] barr) {
        short[] shorts = new short[barr.length / 2];
        if(this.big_endian)
            ByteBuffer.wrap(barr).order(ByteOrder.BIG_ENDIAN).asShortBuffer().get(shorts);
        else
            ByteBuffer.wrap(barr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(shorts);
        return shorts;
    }

    private float[] s2f (short[] sarr) {
        float[] floats = new float[sarr.length];
        for(int i=0; i<sarr.length; i++) {
            float f;
            int r = sarr[i];
            f = ((float) r) / (float) 32768;
            if( f > 1 ) f = 1;
            if( f < -1 ) f = -1;
            floats[i] = f;
        }
        return floats;
    }

    private byte[] f2b (float[] farr) {
        byte[] bytes = new byte[farr.length*4];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().put(farr);
        return bytes;
    }

    private byte[] int16Tofloat32(byte[] bytes){
        return f2b(s2f(b2s(bytes)));
    }

    public void push(byte[] bytes)throws Exception{
        pushFloat32(int16Tofloat32(bytes));
    }


    public void pushFloat32(byte[] bytes) throws Exception{
        if(this.cochlearResultListener==null){
            throw new Exception("Listener not registered.");
        }
        input _input = input.newBuilder()
                .setData(ByteString.copyFrom(bytes))
                .setSubtask(subtask)
                .setApikey(apiKey)
                .setDtype("float32")
                .setSr(this.fs)
                .build();
        requestObserver.onNext(_input);

    }




    private void senseStream(ServiceType type, int fs, int bitrate, boolean big_endian, boolean signed) throws Exception{
        this.fs = fs;
        this.big_endian = big_endian;
        this.signed = signed;
        this.bitrate = bitrate;

        //Verify Sample Rate

        switch(type) {
            case ageGenderStream:
            case musicDetectorStream:
            case speechDetectorStream:
                if(fs!=16000){
                    throw new Exception("Incorrect sample rate - 16,000hz is required for this task to be done");
                }
                break;
            case eventStream:
            case musicGenreStream:
            case musicMoodStream:
                if(fs!=22050){
                    throw new Exception("Incorrect sample rate - 22,050hz is required for this task to be done");
                }
                break;
            default:
                throw new Exception("CochlearSenseStreamClient - Unknown stream service name was given");
        }



        finishLatch= new CountDownLatch(1);

        class BistreamObserver implements StreamObserver<output>{
            @Override
            public void onNext(output out) {
                //CochlearSenseStreamClient.this.yield(out.getPred());
                Log.d("CochlearSenseResult", out.getPred());
                cochlearResultListener.onResult(out.getPred());
                //responses.add(out.getPred());
            }

            @Override
            public void onError(Throwable t) {
                Status status = Status.fromThrowable(t);
                //System.err.println("ERROR " + status);
                cochlearResultListener.onError("ERROR : "+status);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                cochlearResultListener.onComplete();
                finishLatch.countDown();

            }
        }

        switch(type) {
            case eventStream:
                requestObserver = asyncStub
                        .withDeadlineAfter(deadline, TimeUnit.MINUTES)
                        .eventStream(new BistreamObserver());
                break;
            case ageGenderStream:
                requestObserver = asyncStub
                        .withDeadlineAfter(deadline, TimeUnit.MINUTES)
                        .ageGenderStream(new BistreamObserver());
                break;
            case musicGenreStream:
                requestObserver = asyncStub
                        .withDeadlineAfter(deadline, TimeUnit.MINUTES)
                        .musicGenreStream(new BistreamObserver());
                break;
            case musicMoodStream:
                requestObserver = asyncStub
                        .withDeadlineAfter(deadline, TimeUnit.MINUTES)
                        .musicMoodStream(new BistreamObserver());
                break;
            case musicDetectorStream:
                requestObserver = asyncStub
                        .withDeadlineAfter(deadline, TimeUnit.MINUTES)
                        .musicDetectorStream(new BistreamObserver());
                break;
            case speechDetectorStream:
                requestObserver = asyncStub
                        .withDeadlineAfter(deadline, TimeUnit.MINUTES)
                        .speechDetectorStream(new BistreamObserver());
                break;
            default:
                throw new Exception("CochlearSenseStreamClient - Unknown stream service name was given");
        }


    }

    public void setListener(CochlearResultListener listener){
        this.cochlearResultListener = listener;
    }

}
