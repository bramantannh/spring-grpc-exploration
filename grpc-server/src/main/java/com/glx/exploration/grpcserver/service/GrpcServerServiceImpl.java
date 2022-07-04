package com.glx.exploration.grpcserver.service;

import com.glx.exploration.grpcinterface.CompoundInterestReply;
import com.glx.exploration.grpcinterface.CompoundInterestRequest;
import com.glx.exploration.grpcinterface.GrpcServerServiceGrpc;
import com.glx.exploration.grpcinterface.TextReply;
import com.glx.exploration.grpcinterface.TextRequest;
import com.glx.exploration.grpcserver.model.Text;
import com.glx.exploration.grpcserver.repository.TextRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class GrpcServerServiceImpl extends GrpcServerServiceGrpc.GrpcServerServiceImplBase {

  @Autowired private TextRepository textRepository;

  @Override
  public void compoundInterest(CompoundInterestRequest request, StreamObserver<CompoundInterestReply> responseObserver) {
    CompoundInterestReply reply = CompoundInterestReply.newBuilder()
        .setResult(calculateCompoundInterest(request))
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  private double calculateCompoundInterest(CompoundInterestRequest input) {
    double compoundInterval = 12.0;

    return input.getInitialBalance()
        * Math.pow(1 + input.getInterestRate() / compoundInterval,
        compoundInterval * input.getYearElapsed());
  }

  @Override
  public void saveText(TextRequest request, StreamObserver<TextReply> responseObserver) {
    Text text = Text.builder()
        .content(request.getContent())
        .build();

    textRepository.saveAndFlush(text);

    TextReply reply = TextReply.newBuilder()
        .setResult(true)
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
