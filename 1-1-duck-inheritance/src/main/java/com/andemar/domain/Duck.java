package com.andemar.domain;

public class Duck {
  private String name;

  public void swim() {
    System.out.println(String.format("Swimming %s...", name));
  }

  public void display() {
    System.out.println(String.format("Displaying %s...", name));
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
