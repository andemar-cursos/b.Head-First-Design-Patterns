package com.andemar.models.stereo;

public class Stereo {
  private final String location;

  public Stereo(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("Stereo is on - " + location);
  }

  public void off() {
    System.out.println("Stereo is off - " + location);
  }

  public void setCD() {
    System.out.println("Stereo is set for CD input - " + location);
  }

  public void setDVD() {
    System.out.println("Stereo is set for DVD input - " + location);
  }

  public void setRadio() {
    System.out.println("Stereo is set for Radio - " + location);
  }

  public void setVolume(int volume) {
    System.out.println("Stereo volume set to " + volume + " - " + location);
  }
}
