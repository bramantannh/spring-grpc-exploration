package com.glx.exploration.client.model.rest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompoundInterestInput {

  private float initialBalance;
  private float interestRate;
  private int yearElapsed;

}
