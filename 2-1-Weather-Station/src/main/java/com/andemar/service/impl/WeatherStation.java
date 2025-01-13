package com.andemar.service.impl;

public class WeatherStation {

  public static float getTemperature() {
    return (float) (Math.random() * 100);
  }

  public static float getHumidity() {
    return (float) (Math.random() * 100);
  }

  public static float getPressure() {
    return (float) (Math.random() * 100);
  }
}
