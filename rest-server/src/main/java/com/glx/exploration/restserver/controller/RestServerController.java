package com.glx.exploration.restserver.controller;

import com.glx.exploration.restserver.model.input.CompoundInterestInput;
import com.glx.exploration.restserver.model.input.TextInput;
import com.glx.exploration.restserver.service.RestServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServerController {

  @Autowired private RestServerService restServerService;

  @PostMapping("/compoundInterest")
  public Double powerOf(@RequestBody CompoundInterestInput input) {
    return restServerService.calculateFinalAmount(input);
  }

  @PostMapping("/saveText")
  public boolean saveText(@RequestBody TextInput input) {
    return restServerService.saveText(input);
  }
}
