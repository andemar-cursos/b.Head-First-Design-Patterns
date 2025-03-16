package com.andemar.models.fan;

import com.andemar.models.Command;

public class CeilingFanOnCommand implements Command {
  private final CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.high();
  }

  @Override
  public void undo() {
    ceilingFan.off();
  }

  @Override
  public String toString() {
    return "CeilingFanOnCommand{" +
        "ceilingFan=" + ceilingFan +
        '}';
  }
}
