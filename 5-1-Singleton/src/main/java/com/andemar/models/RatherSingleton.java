package com.andemar.models;

public class RatherSingleton {
  private static RatherSingleton ratherSingleton = new RatherSingleton();

  private RatherSingleton() {}

  /**
   * This method returns the instance of the RatherSingleton class,
   * but its initialization is at the start of the class.
   * @return RatherSingleton
   */
  public static RatherSingleton getInstance() {
    return ratherSingleton;
  }

  @Override
  public String toString() {
    return "RatherSingleton{}";
  }
}
