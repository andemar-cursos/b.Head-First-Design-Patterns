package com.andemar.domain.behavior.impl;

import com.andemar.domain.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying!!");
  }

}
