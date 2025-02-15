package com.andemar;

import com.andemar.models.enums.PizzaEnum;
import com.andemar.models.factory.PizzaFactory;
import com.andemar.service.impl.PizzaStoreImpl;

public class Main {

  public static void main(String[] args) {
    PizzaFactory pizzaFactory = new PizzaFactory();
    PizzaStoreImpl pizzaStore = new PizzaStoreImpl(pizzaFactory);

    pizzaStore.orderPizza(PizzaEnum.CHEESE.getName());
  }
}