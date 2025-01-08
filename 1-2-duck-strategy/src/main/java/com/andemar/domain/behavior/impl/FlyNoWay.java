package com.andemar.domain.behavior.impl;

import com.andemar.domain.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't fly");
  }

}
