package com.andemar.model.caffes;

import com.andemar.model.abstracts.Beverage;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return .99;
  }
}
