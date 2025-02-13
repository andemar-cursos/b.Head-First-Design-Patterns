package com.andemar;

import com.andemar.model.abstracts.Beverage;
import com.andemar.model.caffes.DarkRoast;
import com.andemar.model.caffes.Espresso;
import com.andemar.model.caffes.HouseBlend;
import com.andemar.model.condiments.Mocha;
import com.andemar.model.condiments.Soy;
import com.andemar.model.condiments.Whip;

public class Main {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    printCaffe(beverage);

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    printCaffe(beverage2);

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    printCaffe(beverage3);
  }


  private static void printCaffe(Beverage beverage) {
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }
}