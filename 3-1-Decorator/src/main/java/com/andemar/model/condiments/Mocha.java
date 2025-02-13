package com.andemar.model.condiments;

import com.andemar.model.abstracts.Beverage;
import com.andemar.model.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return String.format("%s, %s", beverage.getDescription(), "Mocha");
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.20;
  }
}
