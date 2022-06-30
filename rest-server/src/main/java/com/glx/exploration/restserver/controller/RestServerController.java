package com.glx.exploration.restserver.controller;

import com.glx.exploration.restserver.model.input.CompoundInterestModel;
import com.glx.exploration.restserver.model.input.TextModel;
import com.glx.exploration.restserver.service.RestServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServerController {

  @Autowired private RestServerService restServerService;

  @GetMapping("/compoundInterest")
  public Double powerOf(@RequestBody CompoundInterestModel input) {
    return restServerService.calculateFinalAmount(input);
  }

  @PostMapping("/saveText")
  public boolean saveText(@RequestBody TextModel input) {
    return restServerService.saveText(input);
  }
}
