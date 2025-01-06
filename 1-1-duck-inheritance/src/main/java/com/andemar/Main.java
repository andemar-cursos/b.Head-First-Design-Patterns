package com.andemar;

import com.andemar.domain.Duck;
import com.andemar.domain.Flyable;
import com.andemar.domain.Quackable;
import com.andemar.domain.inheritance.DecoyDuck;
import com.andemar.domain.inheritance.MallardDuck;
import com.andemar.domain.inheritance.RedheadDuck;
import com.andemar.domain.inheritance.RubberDuck;

public class Main {

  public static void main(String[] args) {
    //Create Ducks
    DecoyDuck decoyDuck = new DecoyDuck();
    MallardDuck mallardDuck = new MallardDuck();
    RedheadDuck redheadDuck = new RedheadDuck();
    RubberDuck rubberDuck = new RubberDuck();

    //Display Ducks
    displayDucks(decoyDuck, mallardDuck, redheadDuck, rubberDuck);
    flyDucks(mallardDuck, redheadDuck);
    quarkDucks(mallardDuck, redheadDuck, rubberDuck);
  }

  private static void displayDucks(Duck... ducks) {
    System.out.println("Displaying ducks...");
    for (Duck duck : ducks) {
      duck.display();
    }
  }

  private static void flyDucks(Flyable... ducks) {
    System.out.println("Flying ducks...");
    for (Flyable duck : ducks) {
      duck.fly();
    }
  }

  private static void quarkDucks(Quackable... ducks) {
    System.out.println("Quacking ducks...");
    for (Quackable duck : ducks) {
      duck.quack();
    }
  }
}