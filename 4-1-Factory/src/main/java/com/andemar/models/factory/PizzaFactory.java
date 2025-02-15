package com.andemar.models.factory;

import com.andemar.models.Pizza;
import com.andemar.models.impl.CheesePizza;
import com.andemar.models.impl.ClamPizza;
import com.andemar.models.impl.PepperoniPizza;
import com.andemar.models.impl.VeggiePizza;
import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {

  private static final Map<String, Class<? extends Pizza>> PIZZAS = new HashMap<>();

  static {
    PIZZAS.put("cheese", CheesePizza.class);
    PIZZAS.put("clam", ClamPizza.class);
    PIZZAS.put("pepperoni", PepperoniPizza.class);
    PIZZAS.put("veggie", VeggiePizza.class);
  }

  public Pizza createPizza(String type) {
    Class<? extends Pizza> pizzaClass = PIZZAS.get(type.toLowerCase());
    if(pizzaClass != null){
      try {
        return pizzaClass.getDeclaredConstructor().newInstance();
      } catch (Exception e) {
        return null;
      }
    }
    return null;
  }
}
