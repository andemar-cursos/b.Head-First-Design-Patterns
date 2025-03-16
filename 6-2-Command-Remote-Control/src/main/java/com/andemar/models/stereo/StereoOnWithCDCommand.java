package com.andemar.models.stereo;

import com.andemar.models.Command;

public class StereoOnWithCDCommand implements Command {
  private final Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
  }

  @Override
  public String toString() {
    return "StereoOnWithCDCommand{" +
        "stereo=" + stereo +
        '}';
  }
}
