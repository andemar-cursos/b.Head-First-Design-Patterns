package com.andemar.models.templates;

public abstract class CaffeineBeverage {
  // This is a template method
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments())
      addCondiments();
  }

  private void boilWater() {
    System.out.println("Boiling water");
  }

  public abstract void brew();

  private void pourInCup() {
    System.out.println("Pour in cup");
  }

  public abstract void addCondiments();

  // This is a hook method
  public abstract boolean customerWantsCondiments();
}
