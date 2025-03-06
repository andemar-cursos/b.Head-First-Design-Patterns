package com.andemar.models;

public class SynchronizedSingleton {
  private static SynchronizedSingleton synchronizedSingleton;

  private SynchronizedSingleton() {}

  /**
   * This method is synchronized to avoid multiple threads creating multiple instances of the singleton.
   * @return SynchronizedSingleton
   */
  public static synchronized SynchronizedSingleton getInstance() {
    if (synchronizedSingleton == null) {
      synchronizedSingleton = new SynchronizedSingleton();
    }
    return synchronizedSingleton;
  }

  @Override
  public String toString() {
    return "SynchronizedSingleton{}";
  }
}
