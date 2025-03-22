package com.andemar.models;

import com.andemar.models.templates.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Dripping coffee through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  public boolean customerWantsCondiments() {
    return true;
  }
}
