package com.andemar.models;

public class Amplifier {

  public void on() {
    System.out.println("Amplifier on");
  }

  public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
    System.out.println("Setting streaming player to " + streamingPlayer);
  }

  public void setSurroundSound() {
    System.out.println("Setting surround sound");
  }

  public void setVolume(int volume) {
    System.out.println("Setting volume to " + volume);
  }

  public void off() {
    System.out.println("Amplifier off");
  }
}
