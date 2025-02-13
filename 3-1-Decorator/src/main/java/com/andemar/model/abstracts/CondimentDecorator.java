package com.andemar.model.abstracts;

public abstract class CondimentDecorator extends Beverage {
  public Beverage beverage;
  public abstract String getDescription();
}
