package com.andemar.models.remote;

import com.andemar.models.Command;

public class LightOnCommand implements Command {
  private final Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.lightOn();
  }
}
