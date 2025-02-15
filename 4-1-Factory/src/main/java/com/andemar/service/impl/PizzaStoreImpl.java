package com.andemar.service.impl;

import com.andemar.models.Pizza;
import com.andemar.models.factory.PizzaFactory;
import com.andemar.service.PizzaStore;

public class PizzaStoreImpl implements PizzaStore {

  private final PizzaFactory pizzaFactory;

  public PizzaStoreImpl(PizzaFactory pizzaFactory) {
    this.pizzaFactory = pizzaFactory;
  }

  @Override
  public Pizza orderPizza(String type) {
    Pizza pizza = pizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
