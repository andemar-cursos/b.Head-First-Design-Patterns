package com.andemar.models;

import com.andemar.models.templates.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override
  public boolean customerWantsCondiments() {
    return true;
  }
}
