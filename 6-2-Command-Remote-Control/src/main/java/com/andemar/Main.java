package com.andemar;

import com.andemar.models.Command;
import com.andemar.models.fan.CeilingFan;
import com.andemar.models.fan.CeilingFanOffCommand;
import com.andemar.models.fan.CeilingFanOnCommand;
import com.andemar.models.garage.GarageDoor;
import com.andemar.models.garage.GarageDoorDownCommand;
import com.andemar.models.garage.GarageDoorUpCommand;
import com.andemar.models.light.Light;
import com.andemar.models.light.LightOffCommand;
import com.andemar.models.light.LightOnCommand;
import com.andemar.models.remote.RemoteControl;
import com.andemar.models.stereo.Stereo;
import com.andemar.models.stereo.StereoOffWithCDCommand;
import com.andemar.models.stereo.StereoOnWithCDCommand;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private static final List<Object> devices = new ArrayList<>();
  private static final List<Command> commands = new ArrayList<>();
  private static RemoteControl remoteControl;

  public static void main(String[] args) {
    createDevices();
    createCommands();
    remoteControl = new RemoteControl();
    setCommands();
    System.out.println(remoteControl);
    pushAllButtons();
  }

  private static void createDevices() {
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor("Garage");
    Stereo stereo = new Stereo("Living Room");

    devices.add(livingRoomLight);
    devices.add(kitchenLight);
    devices.add(ceilingFan);
    devices.add(garageDoor);
    devices.add(stereo);
  }

  private static void createCommands() {
    //Lights
    LightOnCommand livingRoomLightOn = new LightOnCommand((Light) devices.get(0));
    LightOffCommand livingRoomLightOff = new LightOffCommand((Light) devices.get(0));
    commands.add(livingRoomLightOn);
    commands.add(livingRoomLightOff);

    LightOnCommand kitchenLightOn = new LightOnCommand((Light) devices.get(1));
    LightOffCommand kitchenLightOff = new LightOffCommand((Light) devices.get(1));
    commands.add(kitchenLightOn);
    commands.add(kitchenLightOff);

    //Ceiling Fan
    CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand((CeilingFan) devices.get(2));
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand((CeilingFan) devices.get(2));
    commands.add(ceilingFanOn);
    commands.add(ceilingFanOff);

    //Garage Door
    GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand((GarageDoor) devices.get(3));
    GarageDoorDownCommand garageDoorClose = new GarageDoorDownCommand((GarageDoor) devices.get(3));
    commands.add(garageDoorOpen);
    commands.add(garageDoorClose);

    //Stereo
    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand((Stereo) devices.get(4));
    StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand((Stereo) devices.get(4));
    commands.add(stereoOnWithCD);
    commands.add(stereoOffWithCD);
  }

  private static void setCommands() {
    remoteControl.setCommand(0, commands.get(0), commands.get(1));
    remoteControl.setCommand(1, commands.get(2), commands.get(3));
    remoteControl.setCommand(2, commands.get(4), commands.get(5));
    remoteControl.setCommand(3, commands.get(6), commands.get(7));
    remoteControl.setCommand(4, commands.get(8), commands.get(9));
  }

  private static void pushAllButtons() {
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.undoButtonWasPushed();

    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    remoteControl.undoButtonWasPushed();

    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    remoteControl.undoButtonWasPushed();

    remoteControl.onButtonWasPushed(3);
    remoteControl.offButtonWasPushed(3);
    remoteControl.undoButtonWasPushed();

    remoteControl.onButtonWasPushed(4);
    remoteControl.offButtonWasPushed(4);
    remoteControl.undoButtonWasPushed();

    //No command
    remoteControl.onButtonWasPushed(5);
    remoteControl.offButtonWasPushed(5);
    remoteControl.onButtonWasPushed(6);
    remoteControl.offButtonWasPushed(6);
  }
}