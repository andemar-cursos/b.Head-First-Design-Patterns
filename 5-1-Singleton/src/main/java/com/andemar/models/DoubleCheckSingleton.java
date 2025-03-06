package com.andemar.models;

public class DoubleCheckSingleton {
  private static volatile DoubleCheckSingleton doubleCheckSingleton;

  private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
      if (doubleCheckSingleton == null) {
        synchronized (DoubleCheckSingleton.class) {
          if (doubleCheckSingleton == null) {
            doubleCheckSingleton = new DoubleCheckSingleton();
          }
        }
      }
      return doubleCheckSingleton;
    }

  @Override
  public String toString() {
    return "DoubleCheckSingleton{}";
  }
}
