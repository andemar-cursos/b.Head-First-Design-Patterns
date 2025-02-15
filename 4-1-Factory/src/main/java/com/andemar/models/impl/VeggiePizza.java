package com.andemar.models.impl;

import com.andemar.models.Pizza;
import com.andemar.models.enums.PizzaEnum;

public class VeggiePizza implements Pizza {

  @Override
  public String getType() {
    return PizzaEnum.VEGGIE.getName();
  }
}
