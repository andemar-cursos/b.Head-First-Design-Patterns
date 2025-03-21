package com.andemar.models.impl;

import com.andemar.models.Turkey;

public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    System.out.println("Gobble gobble");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying a short distance");
  }
}
