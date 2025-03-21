package com.andemar.models.adapters;

import com.andemar.models.Duck;
import com.andemar.models.Turkey;

public class DuckAdapter implements Turkey {

  private final Duck duck;

  public DuckAdapter(Duck duck) {
    this.duck = duck;
  }

  @Override
  public void gobble() {
    duck.quack();
  }

  @Override
  public void fly() {
    duck.fly();
  }
}
