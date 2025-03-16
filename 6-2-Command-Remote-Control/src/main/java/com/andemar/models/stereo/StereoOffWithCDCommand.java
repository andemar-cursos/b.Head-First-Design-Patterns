package com.andemar.models.stereo;

import com.andemar.models.Command;

public class StereoOffWithCDCommand implements Command {
  private final Stereo stereo;

  public StereoOffWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public String toString() {
    return "StereoOffWithCDCommand{" +
        "stereo=" + stereo +
        '}';
  }
}
