package com.andemar.models.light;

public class Light {
  private final String location;

  public Light(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("Light is on - " + location);
  }

  public void off() {
    System.out.println("Light is off - " + location);
  }
}
