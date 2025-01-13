package com.andemar.service.impl;

import com.andemar.service.Display;
import com.andemar.service.Update;

public class CurrentConditionsDisplay implements Display, Update {

  private float temperature;
  private float humidity;
  private float pressure;

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display("CurrentConditions");
  }

  @Override
  public void display(String display) {
    System.out.println(display + " conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
  }
}
