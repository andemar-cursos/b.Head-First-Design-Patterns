package com.andemar.domain.behavior.impl;

import com.andemar.domain.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak");
  }

}
