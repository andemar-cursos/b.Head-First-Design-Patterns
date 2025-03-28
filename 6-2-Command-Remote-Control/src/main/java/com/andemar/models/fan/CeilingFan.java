package com.andemar.models.fan;

public class CeilingFan {
  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;

  private int actualSpeed = OFF;

  private String location;

  public CeilingFan(String location) {
    this.location = location;
  }

  public void high() {
    actualSpeed = HIGH;
    System.out.println("Ceiling Fan is on high " + location);
  }

  public void medium() {
    actualSpeed = MEDIUM;
    System.out.println("Ceiling Fan is on medium " + location);
  }

  public void low() {
    actualSpeed = LOW;
    System.out.println("Ceiling Fan is on low " + location);
  }

  public void off() {
    actualSpeed = OFF;
    System.out.println("Ceiling Fan is off " + location);
  }

  public int getSpeed() {
    return actualSpeed;
  }
}
