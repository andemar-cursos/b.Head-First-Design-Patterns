package com.andemar.domain.impl;

import com.andemar.domain.Duck;
import com.andemar.domain.behavior.FlyBehavior;
import com.andemar.domain.behavior.QuackBehavior;

public class MallardDuck extends Duck {

  public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

}
