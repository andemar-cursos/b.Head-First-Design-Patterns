package com.andemar.domain.impl;

import com.andemar.domain.Duck;
import com.andemar.domain.behavior.FlyBehavior;
import com.andemar.domain.behavior.QuackBehavior;

public class RubberDuck extends Duck {

  public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("I'm a rubber duck");
  }

}
