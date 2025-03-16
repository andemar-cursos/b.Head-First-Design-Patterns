package com.andemar.models.garage;

public class GarageDoor {

  private final String location;

  public GarageDoor(String location) {
    this.location = location;
  }

  public void up() {
    System.out.println("Garage door is open " + location);
  }

  public void down() {
    System.out.println("Garage door is closed " + location);
  }

  public void stop() {
    System.out.println("Garage door is stopped " + location);
  }

  public void lightOn() {
    System.out.println("Garage Light On " + location);
  }

  public void lightOff() {
    System.out.println("Garage Light Off " + location);
  }
}
