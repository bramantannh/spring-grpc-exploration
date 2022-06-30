package com.glx.exploration.restserver.model.input;

import lombok.Data;

/**
 * MyServiceModel Copyright (c) 2022 GLAIR. All rights reserved.
 *
 * @author bramanta.n.n.haq
 * @since Jun 28, 2022.
 **/
@Data
public class CompoundInterestModel {

  private float initialBalance;
  private float interestRate;
  private int yearElapsed;

}
