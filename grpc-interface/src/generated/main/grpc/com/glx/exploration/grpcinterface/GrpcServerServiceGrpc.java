package com.glx.exploration.grpcinterface;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: exploration.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GrpcServerServiceGrpc {

  private GrpcServerServiceGrpc() {}

  public static final String SERVICE_NAME = "com.glx.exploration.grpcinterface.GrpcServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.glx.exploration.grpcinterface.CompoundInterestRequest,
      com.glx.exploration.grpcinterface.CompoundInterestReply> getCompoundInterestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "compoundInterest",
      requestType = com.glx.exploration.grpcinterface.CompoundInterestRequest.class,
      responseType = com.glx.exploration.grpcinterface.CompoundInterestReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.glx.exploration.grpcinterface.CompoundInterestRequest,
      com.glx.exploration.grpcinterface.CompoundInterestReply> getCompoundInterestMethod() {
    io.grpc.MethodDescriptor<com.glx.exploration.grpcinterface.CompoundInterestRequest, com.glx.exploration.grpcinterface.CompoundInterestReply> getCompoundInterestMethod;
    if ((getCompoundInterestMethod = GrpcServerServiceGrpc.getCompoundInterestMethod) == null) {
      synchronized (GrpcServerServiceGrpc.class) {
        if ((getCompoundInterestMethod = GrpcServerServiceGrpc.getCompoundInterestMethod) == null) {
          GrpcServerServiceGrpc.getCompoundInterestMethod = getCompoundInterestMethod =
              io.grpc.MethodDescriptor.<com.glx.exploration.grpcinterface.CompoundInterestRequest, com.glx.exploration.grpcinterface.CompoundInterestReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "compoundInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.glx.exploration.grpcinterface.CompoundInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.glx.exploration.grpcinterface.CompoundInterestReply.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServerServiceMethodDescriptorSupplier("compoundInterest"))
              .build();
        }
      }
    }
    return getCompoundInterestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.glx.exploration.grpcinterface.TextRequest,
      com.glx.exploration.grpcinterface.TextReply> getSaveTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveText",
      requestType = com.glx.exploration.grpcinterface.TextRequest.class,
      responseType = com.glx.exploration.grpcinterface.TextReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.glx.exploration.grpcinterface.TextRequest,
      com.glx.exploration.grpcinterface.TextReply> getSaveTextMethod() {
    io.grpc.MethodDescriptor<com.glx.exploration.grpcinterface.TextRequest, com.glx.exploration.grpcinterface.TextReply> getSaveTextMethod;
    if ((getSaveTextMethod = GrpcServerServiceGrpc.getSaveTextMethod) == null) {
      synchronized (GrpcServerServiceGrpc.class) {
        if ((getSaveTextMethod = GrpcServerServiceGrpc.getSaveTextMethod) == null) {
          GrpcServerServiceGrpc.getSaveTextMethod = getSaveTextMethod =
              io.grpc.MethodDescriptor.<com.glx.exploration.grpcinterface.TextRequest, com.glx.exploration.grpcinterface.TextReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.glx.exploration.grpcinterface.TextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.glx.exploration.grpcinterface.TextReply.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServerServiceMethodDescriptorSupplier("saveText"))
              .build();
        }
      }
    }
    return getSaveTextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServerServiceStub>() {
        @java.lang.Override
        public GrpcServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServerServiceStub(channel, callOptions);
        }
      };
    return GrpcServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServerServiceBlockingStub>() {
        @java.lang.Override
        public GrpcServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServerServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServerServiceFutureStub>() {
        @java.lang.Override
        public GrpcServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServerServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class GrpcServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a request
     * </pre>
     */
    public void compoundInterest(com.glx.exploration.grpcinterface.CompoundInterestRequest request,
        io.grpc.stub.StreamObserver<com.glx.exploration.grpcinterface.CompoundInterestReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompoundInterestMethod(), responseObserver);
    }

    /**
     */
    public void saveText(com.glx.exploration.grpcinterface.TextRequest request,
        io.grpc.stub.StreamObserver<com.glx.exploration.grpcinterface.TextReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveTextMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCompoundInterestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.glx.exploration.grpcinterface.CompoundInterestRequest,
                com.glx.exploration.grpcinterface.CompoundInterestReply>(
                  this, METHODID_COMPOUND_INTEREST)))
          .addMethod(
            getSaveTextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.glx.exploration.grpcinterface.TextRequest,
                com.glx.exploration.grpcinterface.TextReply>(
                  this, METHODID_SAVE_TEXT)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class GrpcServerServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcServerServiceStub> {
    private GrpcServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a request
     * </pre>
     */
    public void compoundInterest(com.glx.exploration.grpcinterface.CompoundInterestRequest request,
        io.grpc.stub.StreamObserver<com.glx.exploration.grpcinterface.CompoundInterestReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompoundInterestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveText(com.glx.exploration.grpcinterface.TextRequest request,
        io.grpc.stub.StreamObserver<com.glx.exploration.grpcinterface.TextReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveTextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class GrpcServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServerServiceBlockingStub> {
    private GrpcServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a request
     * </pre>
     */
    public com.glx.exploration.grpcinterface.CompoundInterestReply compoundInterest(com.glx.exploration.grpcinterface.CompoundInterestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompoundInterestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.glx.exploration.grpcinterface.TextReply saveText(com.glx.exploration.grpcinterface.TextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveTextMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class GrpcServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServerServiceFutureStub> {
    private GrpcServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.glx.exploration.grpcinterface.CompoundInterestReply> compoundInterest(
        com.glx.exploration.grpcinterface.CompoundInterestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompoundInterestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.glx.exploration.grpcinterface.TextReply> saveText(
        com.glx.exploration.grpcinterface.TextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveTextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPOUND_INTEREST = 0;
  private static final int METHODID_SAVE_TEXT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPOUND_INTEREST:
          serviceImpl.compoundInterest((com.glx.exploration.grpcinterface.CompoundInterestRequest) request,
              (io.grpc.stub.StreamObserver<com.glx.exploration.grpcinterface.CompoundInterestReply>) responseObserver);
          break;
        case METHODID_SAVE_TEXT:
          serviceImpl.saveText((com.glx.exploration.grpcinterface.TextRequest) request,
              (io.grpc.stub.StreamObserver<com.glx.exploration.grpcinterface.TextReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrpcServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.glx.exploration.grpcinterface.Exploration.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcServerService");
    }
  }

  private static final class GrpcServerServiceFileDescriptorSupplier
      extends GrpcServerServiceBaseDescriptorSupplier {
    GrpcServerServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcServerServiceMethodDescriptorSupplier
      extends GrpcServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServerServiceFileDescriptorSupplier())
              .addMethod(getCompoundInterestMethod())
              .addMethod(getSaveTextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
