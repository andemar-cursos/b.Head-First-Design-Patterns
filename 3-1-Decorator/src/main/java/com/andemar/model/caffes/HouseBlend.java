package com.andemar.model.caffes;

import com.andemar.model.abstracts.Beverage;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return .89;
  }
}
