package com.andemar.models.enums;

public enum PizzaEnum {
  CHEESE("cheese"),
  PEPPERONI("pepperoni"),
  CLAM("clam"),
  VEGGIE("veggie");

  private final String name;

  PizzaEnum(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
