package com.glx.exploration.client.service;

import com.glx.exploration.client.constant.ExplorationConstant;
import com.glx.exploration.client.model.rest.CompoundInterestInput;
import com.glx.exploration.client.model.rest.TextInput;
import com.glx.exploration.grpcinterface.CompoundInterestReply;
import com.glx.exploration.grpcinterface.CompoundInterestRequest;
import com.glx.exploration.grpcinterface.GrpcServerServiceGrpc.GrpcServerServiceBlockingStub;
import com.glx.exploration.grpcinterface.TextReply;
import com.glx.exploration.grpcinterface.TextRequest;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class ExplorationClientService {

  @Autowired private WebClient explorationWebCLient;

  @GrpcClient("grpc-server")
  private GrpcServerServiceBlockingStub grpcServerServiceStub;

  public void restCompoundInterest() {
    CompoundInterestInput request = CompoundInterestInput.builder()
        .initialBalance(1000000)
        .interestRate((float) 0.1)
        .yearElapsed(10)
        .build();

    Double result = explorationWebCLient.post()
        .uri("localhost:7073/compoundInterest")
        .contentType(MediaType.APPLICATION_JSON)
        .bodyValue(request)
        .retrieve()
        .bodyToMono(Double.class)
        .block();

    log.info("REST Compound Interest: " + result);
  }

  public void restSaveText() {
    TextInput request = TextInput.builder()
        .content(ExplorationConstant.LOREM_IPSUM_TEN_MB)
        .build();

    Boolean result = explorationWebCLient.post()
        .uri("localhost:7073/saveText")
        .contentType(MediaType.APPLICATION_JSON)
        .bodyValue(request)
        .retrieve()
        .bodyToMono(Boolean.class)
        .block();

    log.info("REST Save Text: " + result);
  }

  public void grpcCompoundInterest() {
    CompoundInterestRequest request = CompoundInterestRequest.newBuilder()
        .setInitialBalance(1000000)
        .setInterestRate((float) 0.1)
        .setYearElapsed(10)
        .build();

    CompoundInterestReply result = grpcServerServiceStub.compoundInterest(request);

    log.info("gRPC Compound Interest: " + result.getResult());
  }

  public void grpcSaveText() {
    TextRequest request = TextRequest.newBuilder()
        .setContent(ExplorationConstant.LOREM_IPSUM_TEN_MB)
        .build();

    TextReply result = grpcServerServiceStub.saveText(request);

    log.info("gRPC Save Text: " + result.getResult());
  }

}
