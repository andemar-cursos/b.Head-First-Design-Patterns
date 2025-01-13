package com.andemar.service.impl;

import com.andemar.model.Weather;
import com.andemar.service.DisplayElement;
import com.andemar.service.Observer;
import com.andemar.service.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

  private float pressure;
  private final Subject subject;

  public ForecastDisplay(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void update(Weather weather) {
    this.pressure = weather.getPressure();
    display();
  }

  @Override
  public void display() {
    System.out.println("Forecast conditions: " + pressure + " pressure");
  }
}
