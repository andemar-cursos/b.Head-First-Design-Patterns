package com.andemar.models.light;

import com.andemar.models.Command;

public class LightOffCommand implements Command {
  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public String toString() {
    return "LightOffCommand{" +
        "light=" + light +
        '}';
  }
}
