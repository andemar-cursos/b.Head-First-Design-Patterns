package com.andemar.models.fan;

import com.andemar.models.Command;

public class CeilingFanOffCommand implements Command {
  private final CeilingFan ceilingFan;
  private int prevSpeed;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    this.prevSpeed = ceilingFan.getSpeed();
    ceilingFan.off();
  }

  @Override
  public void undo() {
    switch (prevSpeed) {
      case CeilingFan.HIGH:
        ceilingFan.high();
        break;
      case CeilingFan.MEDIUM:
        ceilingFan.medium();
        break;
      case CeilingFan.LOW:
        ceilingFan.low();
        break;
      default:
        ceilingFan.off();
        break;
    }
  }

  @Override
  public String toString() {
    return "CeilingFanOffCommand{" +
        "ceilingFan=" + ceilingFan +
        '}';
  }
}
