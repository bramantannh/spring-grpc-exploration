// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exploration.proto

package com.glx.exploration.grpcinterface;

public final class Exploration {
  private Exploration() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_glx_exploration_grpcinterface_CompoundInterestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_glx_exploration_grpcinterface_CompoundInterestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_glx_exploration_grpcinterface_TextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_glx_exploration_grpcinterface_TextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_glx_exploration_grpcinterface_CompoundInterestReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_glx_exploration_grpcinterface_CompoundInterestReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_glx_exploration_grpcinterface_TextReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_glx_exploration_grpcinterface_TextReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021exploration.proto\022!com.glx.exploration" +
      ".grpcinterface\"\\\n\027CompoundInterestReques" +
      "t\022\026\n\016initialBalance\030\001 \001(\002\022\024\n\014interestRat" +
      "e\030\002 \001(\002\022\023\n\013yearElapsed\030\003 \001(\005\"\036\n\013TextRequ" +
      "est\022\017\n\007content\030\001 \001(\t\"\'\n\025CompoundInterest" +
      "Reply\022\016\n\006result\030\001 \001(\001\"\033\n\tTextReply\022\016\n\006re" +
      "sult\030\001 \001(\0102\214\002\n\021GrpcServerService\022\212\001\n\020com" +
      "poundInterest\022:.com.glx.exploration.grpc" +
      "interface.CompoundInterestRequest\0328.com." +
      "glx.exploration.grpcinterface.CompoundIn" +
      "terestReply\"\000\022j\n\010saveText\022..com.glx.expl" +
      "oration.grpcinterface.TextRequest\032,.com." +
      "glx.exploration.grpcinterface.TextReply\"" +
      "\000B%\n!com.glx.exploration.grpcinterfaceP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_glx_exploration_grpcinterface_CompoundInterestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_glx_exploration_grpcinterface_CompoundInterestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_glx_exploration_grpcinterface_CompoundInterestRequest_descriptor,
        new java.lang.String[] { "InitialBalance", "InterestRate", "YearElapsed", });
    internal_static_com_glx_exploration_grpcinterface_TextRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_glx_exploration_grpcinterface_TextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_glx_exploration_grpcinterface_TextRequest_descriptor,
        new java.lang.String[] { "Content", });
    internal_static_com_glx_exploration_grpcinterface_CompoundInterestReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_glx_exploration_grpcinterface_CompoundInterestReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_glx_exploration_grpcinterface_CompoundInterestReply_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_com_glx_exploration_grpcinterface_TextReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_glx_exploration_grpcinterface_TextReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_glx_exploration_grpcinterface_TextReply_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
