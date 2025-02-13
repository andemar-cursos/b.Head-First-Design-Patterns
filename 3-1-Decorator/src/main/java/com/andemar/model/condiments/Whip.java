package com.andemar.model.condiments;

import com.andemar.model.abstracts.Beverage;
import com.andemar.model.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return String.format("%s, %s", beverage.getDescription(), "Whip");
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.10;
  }
}
