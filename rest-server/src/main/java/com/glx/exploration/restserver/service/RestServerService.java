package com.glx.exploration.restserver.service;

import com.glx.exploration.restserver.model.Text;
import com.glx.exploration.restserver.model.input.CompoundInterestInput;
import com.glx.exploration.restserver.model.input.TextInput;
import com.glx.exploration.restserver.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServerService {

  @Autowired private TextRepository textRepository;

  public Double calculateFinalAmount(CompoundInterestInput input) {
    double compoundInterval = 12.0;

    return input.getInitialBalance()
        * Math.pow(1 + input.getInterestRate() / compoundInterval,
        compoundInterval * input.getYearElapsed());
  }

  public boolean saveText(TextInput input) {
    Text text = Text.builder()
        .content(input.getContent())
        .build();

    textRepository.saveAndFlush(text);
    return true;
  }

}
