package com.andemar.models.remote;

import com.andemar.models.Command;
import com.andemar.models.NoCommand;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;

  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();

    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\n----- Remote Control -----\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuilder.append("[slot ").append(i).append("] ")
          .append(onCommands[i].getClass().getName()).append("   ")
          .append(offCommands[i].getClass().getName()).append("\n");
    }
    return stringBuilder.toString();
  }

}
