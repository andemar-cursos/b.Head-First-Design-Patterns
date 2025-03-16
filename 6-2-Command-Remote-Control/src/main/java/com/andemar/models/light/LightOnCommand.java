package com.andemar.models.light;

import com.andemar.models.Command;

public class LightOnCommand implements Command {
  private final Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }

  @Override
  public String toString() {
    return "LightOnCommand{" +
        "light=" + light +
        '}';
  }
}
