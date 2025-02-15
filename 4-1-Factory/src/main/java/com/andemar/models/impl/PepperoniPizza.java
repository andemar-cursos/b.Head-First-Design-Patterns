package com.andemar.models.impl;

import com.andemar.models.Pizza;
import com.andemar.models.enums.PizzaEnum;

public class PepperoniPizza implements Pizza {

  @Override
  public String getType() {
    return PizzaEnum.PEPPERONI.getName();
  }
}
