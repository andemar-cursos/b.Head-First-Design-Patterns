package com.andemar.domain.behavior.impl;

import com.andemar.domain.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }

}
