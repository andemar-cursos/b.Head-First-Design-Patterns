package com.andemar;

import com.andemar.models.Command;
import com.andemar.models.garage.GarageDoor;
import com.andemar.models.garage.GarageDoorOpenCommand;
import com.andemar.models.remote.Light;
import com.andemar.models.remote.LightOnCommand;
import com.andemar.models.SimpleRemoteControl;

public class Main {

  public static void main(String[] args) {
    SimpleRemoteControl rc = new SimpleRemoteControl();

    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);

    setAndExecuteCommandToRc(rc, lightOnCommand);

    GarageDoor garageDoor = new GarageDoor();
    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

    setAndExecuteCommandToRc(rc, garageDoorOpenCommand);
  }

  private static void setAndExecuteCommandToRc(SimpleRemoteControl rc, Command command) {
    rc.setCommand(command);
    rc.buttonWasPressed();
  }
}