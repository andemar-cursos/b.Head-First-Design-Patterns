package com.andemar.models;

public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("No command");
  }
}
