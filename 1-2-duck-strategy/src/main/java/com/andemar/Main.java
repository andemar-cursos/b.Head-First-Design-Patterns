package com.andemar;

import com.andemar.domain.Duck;
import com.andemar.domain.behavior.FlyBehavior;
import com.andemar.domain.behavior.QuackBehavior;
import com.andemar.domain.behavior.impl.FlyWithWings;
import com.andemar.domain.behavior.impl.Quack;
import com.andemar.domain.impl.MallardDuck;

public class Main {

  public static void main(String[] args) {
    FlyBehavior flyBehavior = new FlyWithWings();
    QuackBehavior quackBehavior = new Quack();
    Duck duck = new MallardDuck(flyBehavior, quackBehavior);
    duck.display();
    duck.performFly();
    duck.performQuack();
  }
}