package com.andemar.models.adapters;

import com.andemar.models.Duck;
import com.andemar.models.Turkey;

public class TurkeyAdapter implements Duck {
  private final Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}
