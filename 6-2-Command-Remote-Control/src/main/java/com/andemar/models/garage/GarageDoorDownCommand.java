package com.andemar.models.garage;

import com.andemar.models.Command;

public class GarageDoorDownCommand implements Command {
  private final GarageDoor door;

  public GarageDoorDownCommand(GarageDoor door) {
    this.door = door;
  }

  @Override
  public void execute() {
    door.down();
  }

  @Override
  public String toString() {
    return "GarageDoorDownCommand{" +
        "door=" + door +
        '}';
  }
}
