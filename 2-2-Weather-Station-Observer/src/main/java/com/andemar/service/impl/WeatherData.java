package com.andemar.service.impl;

import com.andemar.model.Weather;
import com.andemar.service.Observer;
import com.andemar.service.Subject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherData implements Subject {

  private final List<Observer> observers;
  private Weather weather;

  public WeatherData() {
    this.observers = new ArrayList<>();
    weather = new Weather(0,0,0);
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void registerObserver(Observer... observers) {
    Collections.addAll(this.observers, observers);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void setMeasurements(Weather weather) {
    this.weather = weather;
    measurementsChanged();
  }

  private void measurementsChanged() {
    notifyObservers();
  }

  @Override
  public void notifyObservers() {
    for(Observer observer: observers) {
      observer.update(weather);
    }
  }
}
