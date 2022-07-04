package com.glx.exploration.restserver.model.input;

import lombok.Data;

@Data
public class CompoundInterestInput {

  private float initialBalance;
  private float interestRate;
  private int yearElapsed;

}
