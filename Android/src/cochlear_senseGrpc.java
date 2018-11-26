package com.cochlear.ai;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: cochlear_sense.proto")
public final class cochlear_senseGrpc {

  private cochlear_senseGrpc() {}

  public static final String SERVICE_NAME = "cochlear.ai.cochlear_sense";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getEventMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getEventMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getEventMethod;
    if ((getEventMethod = cochlear_senseGrpc.getEventMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getEventMethod = cochlear_senseGrpc.getEventMethod) == null) {
          cochlear_senseGrpc.getEventMethod = getEventMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("event"))
                  .build();
          }
        }
     }
     return getEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getAgeGenderMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getAgeGenderMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getAgeGenderMethod;
    if ((getAgeGenderMethod = cochlear_senseGrpc.getAgeGenderMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getAgeGenderMethod = cochlear_senseGrpc.getAgeGenderMethod) == null) {
          cochlear_senseGrpc.getAgeGenderMethod = getAgeGenderMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "age_gender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("age_gender"))
                  .build();
          }
        }
     }
     return getAgeGenderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicKeyMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicKeyMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicKeyMethod;
    if ((getMusicKeyMethod = cochlear_senseGrpc.getMusicKeyMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicKeyMethod = cochlear_senseGrpc.getMusicKeyMethod) == null) {
          cochlear_senseGrpc.getMusicKeyMethod = getMusicKeyMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_key"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_key"))
                  .build();
          }
        }
     }
     return getMusicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicTempoMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicTempoMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicTempoMethod;
    if ((getMusicTempoMethod = cochlear_senseGrpc.getMusicTempoMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicTempoMethod = cochlear_senseGrpc.getMusicTempoMethod) == null) {
          cochlear_senseGrpc.getMusicTempoMethod = getMusicTempoMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_tempo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_tempo"))
                  .build();
          }
        }
     }
     return getMusicTempoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicGenreMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicGenreMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicGenreMethod;
    if ((getMusicGenreMethod = cochlear_senseGrpc.getMusicGenreMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicGenreMethod = cochlear_senseGrpc.getMusicGenreMethod) == null) {
          cochlear_senseGrpc.getMusicGenreMethod = getMusicGenreMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_genre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_genre"))
                  .build();
          }
        }
     }
     return getMusicGenreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicMoodMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicMoodMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicMoodMethod;
    if ((getMusicMoodMethod = cochlear_senseGrpc.getMusicMoodMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicMoodMethod = cochlear_senseGrpc.getMusicMoodMethod) == null) {
          cochlear_senseGrpc.getMusicMoodMethod = getMusicMoodMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_mood"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_mood"))
                  .build();
          }
        }
     }
     return getMusicMoodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicDetectorMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicDetectorMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicDetectorMethod;
    if ((getMusicDetectorMethod = cochlear_senseGrpc.getMusicDetectorMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicDetectorMethod = cochlear_senseGrpc.getMusicDetectorMethod) == null) {
          cochlear_senseGrpc.getMusicDetectorMethod = getMusicDetectorMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_detector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_detector"))
                  .build();
          }
        }
     }
     return getMusicDetectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getSpeechDetectorMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getSpeechDetectorMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getSpeechDetectorMethod;
    if ((getSpeechDetectorMethod = cochlear_senseGrpc.getSpeechDetectorMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getSpeechDetectorMethod = cochlear_senseGrpc.getSpeechDetectorMethod) == null) {
          cochlear_senseGrpc.getSpeechDetectorMethod = getSpeechDetectorMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "speech_detector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("speech_detector"))
                  .build();
          }
        }
     }
     return getSpeechDetectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getEventStreamMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getEventStreamMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getEventStreamMethod;
    if ((getEventStreamMethod = cochlear_senseGrpc.getEventStreamMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getEventStreamMethod = cochlear_senseGrpc.getEventStreamMethod) == null) {
          cochlear_senseGrpc.getEventStreamMethod = getEventStreamMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "event_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("event_stream"))
                  .build();
          }
        }
     }
     return getEventStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getAgeGenderStreamMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getAgeGenderStreamMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getAgeGenderStreamMethod;
    if ((getAgeGenderStreamMethod = cochlear_senseGrpc.getAgeGenderStreamMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getAgeGenderStreamMethod = cochlear_senseGrpc.getAgeGenderStreamMethod) == null) {
          cochlear_senseGrpc.getAgeGenderStreamMethod = getAgeGenderStreamMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "age_gender_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("age_gender_stream"))
                  .build();
          }
        }
     }
     return getAgeGenderStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicGenreStreamMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicGenreStreamMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicGenreStreamMethod;
    if ((getMusicGenreStreamMethod = cochlear_senseGrpc.getMusicGenreStreamMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicGenreStreamMethod = cochlear_senseGrpc.getMusicGenreStreamMethod) == null) {
          cochlear_senseGrpc.getMusicGenreStreamMethod = getMusicGenreStreamMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_genre_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_genre_stream"))
                  .build();
          }
        }
     }
     return getMusicGenreStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicMoodStreamMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicMoodStreamMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicMoodStreamMethod;
    if ((getMusicMoodStreamMethod = cochlear_senseGrpc.getMusicMoodStreamMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicMoodStreamMethod = cochlear_senseGrpc.getMusicMoodStreamMethod) == null) {
          cochlear_senseGrpc.getMusicMoodStreamMethod = getMusicMoodStreamMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_mood_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_mood_stream"))
                  .build();
          }
        }
     }
     return getMusicMoodStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicDetectorStreamMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getMusicDetectorStreamMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getMusicDetectorStreamMethod;
    if ((getMusicDetectorStreamMethod = cochlear_senseGrpc.getMusicDetectorStreamMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getMusicDetectorStreamMethod = cochlear_senseGrpc.getMusicDetectorStreamMethod) == null) {
          cochlear_senseGrpc.getMusicDetectorStreamMethod = getMusicDetectorStreamMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "music_detector_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("music_detector_stream"))
                  .build();
          }
        }
     }
     return getMusicDetectorStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getSpeechDetectorStreamMethod;

  public static io.grpc.MethodDescriptor<CochlearSense.input,
      CochlearSense.output> getSpeechDetectorStreamMethod() {
    io.grpc.MethodDescriptor<CochlearSense.input, CochlearSense.output> getSpeechDetectorStreamMethod;
    if ((getSpeechDetectorStreamMethod = cochlear_senseGrpc.getSpeechDetectorStreamMethod) == null) {
      synchronized (cochlear_senseGrpc.class) {
        if ((getSpeechDetectorStreamMethod = cochlear_senseGrpc.getSpeechDetectorStreamMethod) == null) {
          cochlear_senseGrpc.getSpeechDetectorStreamMethod = getSpeechDetectorStreamMethod = 
              io.grpc.MethodDescriptor.<CochlearSense.input, CochlearSense.output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cochlear.ai.cochlear_sense", "speech_detector_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CochlearSense.output.getDefaultInstance()))
                  .setSchemaDescriptor(new cochlear_senseMethodDescriptorSupplier("speech_detector_stream"))
                  .build();
          }
        }
     }
     return getSpeechDetectorStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cochlear_senseStub newStub(io.grpc.Channel channel) {
    return new cochlear_senseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cochlear_senseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new cochlear_senseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cochlear_senseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new cochlear_senseFutureStub(channel);
  }

  /**
   */
  public static abstract class cochlear_senseImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> event(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getEventMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> ageGender(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getAgeGenderMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicKey(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicKeyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicTempo(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicTempoMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicGenre(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicGenreMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicMood(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicMoodMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicDetector(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicDetectorMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> speechDetector(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getSpeechDetectorMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> eventStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getEventStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> ageGenderStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getAgeGenderStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicGenreStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicGenreStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicMoodStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicMoodStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicDetectorStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusicDetectorStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> speechDetectorStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncUnimplementedStreamingCall(getSpeechDetectorStreamMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEventMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_EVENT)))
          .addMethod(
            getAgeGenderMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_AGE_GENDER)))
          .addMethod(
            getMusicKeyMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_KEY)))
          .addMethod(
            getMusicTempoMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_TEMPO)))
          .addMethod(
            getMusicGenreMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_GENRE)))
          .addMethod(
            getMusicMoodMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_MOOD)))
          .addMethod(
            getMusicDetectorMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_DETECTOR)))
          .addMethod(
            getSpeechDetectorMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_SPEECH_DETECTOR)))
          .addMethod(
            getEventStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_EVENT_STREAM)))
          .addMethod(
            getAgeGenderStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_AGE_GENDER_STREAM)))
          .addMethod(
            getMusicGenreStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_GENRE_STREAM)))
          .addMethod(
            getMusicMoodStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_MOOD_STREAM)))
          .addMethod(
            getMusicDetectorStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_MUSIC_DETECTOR_STREAM)))
          .addMethod(
            getSpeechDetectorStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CochlearSense.input,
                CochlearSense.output>(
                  this, METHODID_SPEECH_DETECTOR_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class cochlear_senseStub extends io.grpc.stub.AbstractStub<cochlear_senseStub> {
    private cochlear_senseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cochlear_senseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected cochlear_senseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cochlear_senseStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> event(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> ageGender(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAgeGenderMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicKey(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMusicKeyMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicTempo(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMusicTempoMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicGenre(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMusicGenreMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicMood(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMusicMoodMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicDetector(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMusicDetectorMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> speechDetector(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSpeechDetectorMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> eventStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getEventStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> ageGenderStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAgeGenderStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicGenreStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMusicGenreStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicMoodStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMusicMoodStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> musicDetectorStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMusicDetectorStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<CochlearSense.input> speechDetectorStream(
        io.grpc.stub.StreamObserver<CochlearSense.output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSpeechDetectorStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class cochlear_senseBlockingStub extends io.grpc.stub.AbstractStub<cochlear_senseBlockingStub> {
    private cochlear_senseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cochlear_senseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected cochlear_senseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cochlear_senseBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class cochlear_senseFutureStub extends io.grpc.stub.AbstractStub<cochlear_senseFutureStub> {
    private cochlear_senseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cochlear_senseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected cochlear_senseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cochlear_senseFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EVENT = 0;
  private static final int METHODID_AGE_GENDER = 1;
  private static final int METHODID_MUSIC_KEY = 2;
  private static final int METHODID_MUSIC_TEMPO = 3;
  private static final int METHODID_MUSIC_GENRE = 4;
  private static final int METHODID_MUSIC_MOOD = 5;
  private static final int METHODID_MUSIC_DETECTOR = 6;
  private static final int METHODID_SPEECH_DETECTOR = 7;
  private static final int METHODID_EVENT_STREAM = 8;
  private static final int METHODID_AGE_GENDER_STREAM = 9;
  private static final int METHODID_MUSIC_GENRE_STREAM = 10;
  private static final int METHODID_MUSIC_MOOD_STREAM = 11;
  private static final int METHODID_MUSIC_DETECTOR_STREAM = 12;
  private static final int METHODID_SPEECH_DETECTOR_STREAM = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final cochlear_senseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(cochlear_senseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.event(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_AGE_GENDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.ageGender(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_KEY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicKey(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_TEMPO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicTempo(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_GENRE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicGenre(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_MOOD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicMood(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_DETECTOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicDetector(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_SPEECH_DETECTOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.speechDetector(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_EVENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.eventStream(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_AGE_GENDER_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.ageGenderStream(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_GENRE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicGenreStream(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_MOOD_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicMoodStream(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_MUSIC_DETECTOR_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musicDetectorStream(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        case METHODID_SPEECH_DETECTOR_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.speechDetectorStream(
              (io.grpc.stub.StreamObserver<CochlearSense.output>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class cochlear_senseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cochlear_senseBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CochlearSense.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cochlear_sense");
    }
  }

  private static final class cochlear_senseFileDescriptorSupplier
      extends cochlear_senseBaseDescriptorSupplier {
    cochlear_senseFileDescriptorSupplier() {}
  }

  private static final class cochlear_senseMethodDescriptorSupplier
      extends cochlear_senseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cochlear_senseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (cochlear_senseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cochlear_senseFileDescriptorSupplier())
              .addMethod(getEventMethod())
              .addMethod(getAgeGenderMethod())
              .addMethod(getMusicKeyMethod())
              .addMethod(getMusicTempoMethod())
              .addMethod(getMusicGenreMethod())
              .addMethod(getMusicMoodMethod())
              .addMethod(getMusicDetectorMethod())
              .addMethod(getSpeechDetectorMethod())
              .addMethod(getEventStreamMethod())
              .addMethod(getAgeGenderStreamMethod())
              .addMethod(getMusicGenreStreamMethod())
              .addMethod(getMusicMoodStreamMethod())
              .addMethod(getMusicDetectorStreamMethod())
              .addMethod(getSpeechDetectorStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
