package com.andemar.models.garage;

import com.andemar.models.Command;

public class GarageDoorOpenCommand implements Command {
  private final GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }
}
