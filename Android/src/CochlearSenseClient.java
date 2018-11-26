package com.cochlear.ai;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.internal.IoUtils;
import io.grpc.stub.StreamObserver;

import com.cochlear.ai.cochlear_senseGrpc.cochlear_senseBlockingStub;
import com.cochlear.ai.cochlear_senseGrpc.cochlear_senseStub;
import com.google.protobuf.ByteString;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;



import com.cochlear.ai.CochlearSense.input;
import com.cochlear.ai.CochlearSense.output;

public class CochlearSenseClient {
	private static final int blockSize = 2*1024*1024;
	private final ManagedChannel channel;
	private final cochlear_senseStub asyncStub;
	

	
	private String apiKey;

	public static enum ServiceType {
		//Non stream service
		event,
		ageGender,
		musicKey,
		musicTempo,
		musicGenre,
		musicMood,
		musicDetector,
		speechDetector
	}
	
	public CochlearSenseClient(String apiKey) {
		/**
		 * Default connection to sense.cochlear.ai:9000
		 * To get an apikey, contact Cochlear.ai
		 */
		this("sense.cochlear.ai", 9000, apiKey);
	}

	public CochlearSenseClient(String host, int port, String apiKey) {
		/**
		 * You can designate any host and port. Probably should be blocked on release.  
		 */
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
		this.apiKey = apiKey;
	}

	private CochlearSenseClient(ManagedChannelBuilder<?> channelBuilder) {
		/**
		 * GRPC default constructor. Private call only.
		 */
		channel = channelBuilder.build();
		asyncStub = cochlear_senseGrpc.newStub(channel);
	}
	
	public String senseEvent(InputStream is, String subtask, String format) throws Exception{
		/**
		 * InputStream, subtask, format
		 * example : senseEvent(is, "babycry", "wav"); 
		 */
		return sense(ServiceType.event, is, format, subtask);
	}
	
	public String senseMusicKey(InputStream is, String format) throws Exception{
		return sense(ServiceType.musicKey, is, format);
	}
	public String senseMusicTempo(InputStream is, String format) throws Exception{
		return sense(ServiceType.musicTempo, is, format);
	}
	public String senseMusicGenre(InputStream is, String format) throws Exception{
		return sense(ServiceType.musicGenre, is, format);
	}
	public String senseMusicMood(InputStream is, String format) throws Exception{
		return sense(ServiceType.musicMood, is, format);
	}
	public String senseMusicDetector(InputStream is, String format) throws Exception{
		return sense(ServiceType.musicDetector, is, format);
	}
	public String senseSpeechDetector(InputStream is, String format) throws Exception{
		return sense(ServiceType.speechDetector, is, format);
	}
	
	
	private String sense(ServiceType type, InputStream is, String format) throws Exception{
		return sense(type, is, format, "");
	}
	
	private String sense(ServiceType type, InputStream is, String format, String subtask) throws Exception {
		
		final String[] result = new String[1];
		final CountDownLatch finishLatch = new CountDownLatch(1);
		StreamObserver<output> responseObserver = new StreamObserver<output>() {
			
		    @Override
		    public void onNext(output out) {
		    	result[0] = out.getPred();
		    }

		    @Override
		    public void onError(Throwable t) {
		    	Status status = 	Status.fromThrowable(t);
		    	System.err.println(status);
		    	finishLatch.countDown();
		    }

		    @Override
		    public void onCompleted() {
		    	finishLatch.countDown();
		    }
		};
		StreamObserver<input> requestObserver;
		switch(type) {
			case event:
				requestObserver= asyncStub.event(responseObserver);
				break;
			case ageGender:
				requestObserver= asyncStub.ageGender(responseObserver);
				break;
			case musicKey:
				requestObserver= asyncStub.musicKey(responseObserver);
				break;
			case musicTempo:
				requestObserver= asyncStub.musicTempo(responseObserver);
				break;
			case musicGenre:
				requestObserver= asyncStub.musicGenre(responseObserver);
				break;
			case musicMood:
				requestObserver= asyncStub.musicMood(responseObserver);
				break;
			case musicDetector:
				requestObserver= asyncStub.musicDetector(responseObserver);
				break;
			case speechDetector:
				requestObserver= asyncStub.speechDetector(responseObserver);
				break;
			default:			
				throw new Exception("Unknown service type");
		}
		
		try {
			
			byte[] buffer = new byte[blockSize];
			while(is.read(buffer)>0) {
				input _input = input.newBuilder()
						.setData(ByteString.copyFrom(buffer))
						.setSubtask(subtask)
						.setApikey(this.apiKey)
						.setFormat(format)
						.build();
				requestObserver.onNext(_input);
			}
			
		}catch(RuntimeException e) {
			requestObserver.onError(e);
			throw e;
		}
		requestObserver.onCompleted();
		finishLatch.await(1,TimeUnit.MINUTES);
		return result[0];
	}


}