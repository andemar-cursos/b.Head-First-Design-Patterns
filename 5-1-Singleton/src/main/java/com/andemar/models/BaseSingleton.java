package com.andemar.models;

public class BaseSingleton {

  private static BaseSingleton baseSingleton;

  private BaseSingleton() {}

  /**
   * This method is used to get the instance of the BaseSingleton class
   * @return BaseSingleton
   */
  public static BaseSingleton getInstance() {
    if (baseSingleton == null) {
      baseSingleton = new BaseSingleton();
    }
    return baseSingleton;
  }

  @Override
  public String toString() {
    return "BaseSingleton{}";
  }
}
