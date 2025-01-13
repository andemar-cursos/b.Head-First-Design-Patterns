package com.andemar.service.impl;

public class WeatherData {
  private final CurrentConditionsDisplay currentConditionsDisplay;
  private final StatisticsDisplay statisticsDisplay;
  private final ForecastDisplay forecastDisplay;

  public WeatherData() {
    currentConditionsDisplay = new CurrentConditionsDisplay();
    statisticsDisplay = new StatisticsDisplay();
    forecastDisplay = new ForecastDisplay();
  }

  public void measurementsChanged() {
    float temperature = WeatherStation.getTemperature();
    float humidity = WeatherStation.getHumidity();
    float pressure = WeatherStation.getPressure();

    currentConditionsDisplay.update(temperature, humidity, pressure);
    statisticsDisplay.update(temperature, humidity, pressure);
    forecastDisplay.update(temperature, humidity, pressure);
  }
}
