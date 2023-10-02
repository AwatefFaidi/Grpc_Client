package com.example.stubs;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Convert",
      requestType = com.example.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.example.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "Convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("Convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrencyStream",
      requestType = com.example.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.example.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod;
    if ((getGetCurrencyStreamMethod = BankServiceGrpc.getGetCurrencyStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetCurrencyStreamMethod = BankServiceGrpc.getGetCurrencyStreamMethod) == null) {
          BankServiceGrpc.getGetCurrencyStreamMethod = getGetCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "GetCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("GetCurrencyStream"))
                  .build();
          }
        }
     }
     return getGetCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getPerformstreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Performstream",
      requestType = com.example.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.example.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getPerformstreamMethod() {
    io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse> getPerformstreamMethod;
    if ((getPerformstreamMethod = BankServiceGrpc.getPerformstreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformstreamMethod = BankServiceGrpc.getPerformstreamMethod) == null) {
          BankServiceGrpc.getPerformstreamMethod = getPerformstreamMethod = 
              io.grpc.MethodDescriptor.<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "Performstream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("Performstream"))
                  .build();
          }
        }
     }
     return getPerformstreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getFullCurrencystreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullCurrencystream",
      requestType = com.example.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.example.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest,
      com.example.stubs.Bank.ConvertCurrencyResponse> getFullCurrencystreamMethod() {
    io.grpc.MethodDescriptor<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse> getFullCurrencystreamMethod;
    if ((getFullCurrencystreamMethod = BankServiceGrpc.getFullCurrencystreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getFullCurrencystreamMethod = BankServiceGrpc.getFullCurrencystreamMethod) == null) {
          BankServiceGrpc.getFullCurrencystreamMethod = getFullCurrencystreamMethod = 
              io.grpc.MethodDescriptor.<com.example.stubs.Bank.ConvertCurrencyRequest, com.example.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "FullCurrencystream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("FullCurrencystream"))
                  .build();
          }
        }
     }
     return getFullCurrencystreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public void convert(com.example.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server  Streaming Model
     * </pre>
     */
    public void getCurrencyStream(com.example.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrencyStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyRequest> performstream(
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformstreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyRequest> fullCurrencystream(
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrencystreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.stubs.Bank.ConvertCurrencyRequest,
                com.example.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrencyStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.stubs.Bank.ConvertCurrencyRequest,
                com.example.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_GET_CURRENCY_STREAM)))
          .addMethod(
            getPerformstreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.stubs.Bank.ConvertCurrencyRequest,
                com.example.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_PERFORMSTREAM)))
          .addMethod(
            getFullCurrencystreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.stubs.Bank.ConvertCurrencyRequest,
                com.example.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_FULL_CURRENCYSTREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public void convert(com.example.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server  Streaming Model
     * </pre>
     */
    public void getCurrencyStream(com.example.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrencyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyRequest> performstream(
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformstreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyRequest> fullCurrencystream(
        io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencystreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public com.example.stubs.Bank.ConvertCurrencyResponse convert(com.example.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server  Streaming Model
     * </pre>
     */
    public java.util.Iterator<com.example.stubs.Bank.ConvertCurrencyResponse> getCurrencyStream(
        com.example.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrencyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.stubs.Bank.ConvertCurrencyResponse> convert(
        com.example.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENCY_STREAM = 1;
  private static final int METHODID_PERFORMSTREAM = 2;
  private static final int METHODID_FULL_CURRENCYSTREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((com.example.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENCY_STREAM:
          serviceImpl.getCurrencyStream((com.example.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORMSTREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performstream(
              (io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_CURRENCYSTREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencystream(
              (io.grpc.stub.StreamObserver<com.example.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrencyStreamMethod())
              .addMethod(getPerformstreamMethod())
              .addMethod(getFullCurrencystreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
