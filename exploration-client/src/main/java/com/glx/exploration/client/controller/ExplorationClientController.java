package com.glx.exploration.client.controller;

import com.glx.exploration.client.service.ExplorationClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExplorationClientController {

  @Autowired private ExplorationClientService explorationClientService;

  @GetMapping("/rest/compoundInterest")
  public void restCompoundInterest() {
    explorationClientService.restCompoundInterest();
  }

  @GetMapping("/rest/saveText")
  public void restSaveText() {
    explorationClientService.restSaveText();
  }

  @GetMapping("/grpc/compoundInterest")
  public void grpcCompoundInterest() {
    explorationClientService.grpcCompoundInterest();
  }

  @GetMapping("/grpc/saveText")
  public void grpcSaveText() {
    explorationClientService.grpcSaveText();
  }

}
