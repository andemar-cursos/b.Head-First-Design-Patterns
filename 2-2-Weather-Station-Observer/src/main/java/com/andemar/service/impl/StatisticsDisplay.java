package com.andemar.service.impl;

import com.andemar.model.Weather;
import com.andemar.service.DisplayElement;
import com.andemar.service.Observer;
import com.andemar.service.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

  private float humidity;
  private final Subject subject;

  public StatisticsDisplay(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void update(Weather weather) {
    this.humidity = weather.getHumidity();
    display();
  }

  @Override
  public void display() {
    System.out.println("Statistics conditions: " + humidity + "% humidity");
  }
}
