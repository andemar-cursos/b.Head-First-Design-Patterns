package com.andemar;

import com.andemar.service.impl.WeatherStation;

public class Main {

  public static void main(String[] args) {
    //Create Weather Station
    WeatherStation station = new WeatherStation();
    station.start();
  }
}