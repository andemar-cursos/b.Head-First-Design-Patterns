package com.andemar.model.caffes;

import com.andemar.model.abstracts.Beverage;

public class Decaf extends Beverage {

  public Decaf() {
    description = "Decaf Coffee";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}
