package com.andemar.service;

import com.andemar.models.Pizza;

public interface PizzaStore {

  Pizza orderPizza(String type);
}
