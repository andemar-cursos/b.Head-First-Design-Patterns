package com.andemar.service.impl;

import com.andemar.model.Weather;

public class WeatherStation {

  public void start() {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    Weather weather1 = new Weather(1, 1, 1);
    Weather weather2 = new Weather(2, 2, 2);

    weatherData.setMeasurements(weather1);
    weatherData.setMeasurements(weather2);
  }

}
