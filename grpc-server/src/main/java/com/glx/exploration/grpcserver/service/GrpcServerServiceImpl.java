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

/**
 * MyServiceImpl Copyright (c) 2022 GLAIR. All rights reserved.
 *
 * @author bramanta.n.n.haq
 * @since Jun 28, 2022.
 **/
@GrpcService
public class GrpcServerServiceImpl extends GrpcServerServiceGrpc.GrpcServerServiceImplBase {

  @Autowired private TextRepository textRepository;

  @Override
  public void compoundInterest(CompoundInterestRequest req, StreamObserver<CompoundInterestReply> responseObserver) {
    CompoundInterestReply reply = CompoundInterestReply.newBuilder()
        .setResult(calculateCompoundInterest(req))
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  private float calculateCompoundInterest(CompoundInterestRequest input) {
    int compoundInterval = 12;

    return (float) (input.getInitialBalance()
            * Math.pow(1 + input.getInterestRate()/ compoundInterval,
            compoundInterval * input.getYearElapsed()));
  }

  @Override
  public void saveText(TextRequest req, StreamObserver<TextReply> responseObserver) {
    Text text = Text.builder()
        .content(req.getContent())
        .build();

    textRepository.saveAndFlush(text);

    TextReply reply = TextReply.newBuilder()
        .setResult(true)
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
