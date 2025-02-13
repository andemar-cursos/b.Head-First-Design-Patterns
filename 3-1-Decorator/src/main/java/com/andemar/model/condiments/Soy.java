package com.andemar.model.condiments;

import com.andemar.model.abstracts.Beverage;
import com.andemar.model.abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return String.format("%s, %s", beverage.getDescription(), "Soy");
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.15;
  }
}
