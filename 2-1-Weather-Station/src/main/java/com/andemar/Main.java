package com.andemar;

import com.andemar.service.impl.WeatherData;

public class Main {

  public static void main(String[] args) {
    //Create Weather Station
    WeatherData weatherData = new WeatherData();
    weatherData.measurementsChanged();
  }
}