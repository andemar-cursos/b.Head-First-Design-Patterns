package com.andemar.models;

import java.util.Arrays;

public class MacroCommand implements Command{
  Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    Arrays.stream(this.commands)
        .forEach(Command::execute);
  }

  @Override
  public void undo() {
    Arrays.stream(this.commands)
        .forEach(Command::undo);
  }
}
