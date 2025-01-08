package com.andemar.domain;

import com.andemar.domain.behavior.FlyBehavior;
import com.andemar.domain.behavior.QuackBehavior;

public class Duck {
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public void swim() {
    System.out.println("Swimming");
  }

  public void display() {
    System.out.println("Displaying");
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
