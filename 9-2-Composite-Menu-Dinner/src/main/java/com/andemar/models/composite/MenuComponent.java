package com.andemar.models.composite;

public abstract class MenuComponent {
  // Methods that will to use Menu objects
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public MenuComponent getChild(int i) {
    throw new UnsupportedOperationException();
  }

  // Methods that will to use MenuItem objects
  public String getName() {
    throw new UnsupportedOperationException();
  }

  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  // Both objects will use this method
  public void print() {
    throw new UnsupportedOperationException();
  }
}
