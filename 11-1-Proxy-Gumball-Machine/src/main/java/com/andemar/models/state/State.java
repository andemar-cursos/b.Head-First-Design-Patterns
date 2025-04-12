package com.andemar.models.state;

public interface State {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
  default String print() {
    return this.getClass().getSimpleName();
  }
}
