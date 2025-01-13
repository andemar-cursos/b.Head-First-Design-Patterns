package com.andemar.service.impl;

import com.andemar.model.Weather;
import com.andemar.service.DisplayElement;
import com.andemar.service.Observer;
import com.andemar.service.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private final Subject subject;

  public CurrentConditionsDisplay(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  public void update(Weather weather) {
    this.temperature = weather.getTemperature();
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees");
  }

}
