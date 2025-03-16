package com.andemar.models.garage;

import com.andemar.models.Command;

public class GarageDoorUpCommand implements Command {
  private final GarageDoor door;

  public GarageDoorUpCommand(GarageDoor door) {
    this.door = door;
  }

  @Override
  public void execute() {
    door.up();
  }

  @Override
  public void undo() {
    door.down();
  }

  @Override
  public String toString() {
    return "GarageDoorUpCommand{" +
        "door=" + door +
        '}';
  }
}
