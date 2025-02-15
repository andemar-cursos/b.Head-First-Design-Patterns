package com.andemar.models;

public interface Pizza {
  default void prepare() {
    System.out.println("Preparing " + getType());
  };
  default void bake() {
    System.out.println("Baking " + getType());
  };
  default void cut() {
    System.out.println("Cutting " + getType());
  };
  default void box() {
    System.out.println("Boxing " + getType());
  };
  String getType();
}
