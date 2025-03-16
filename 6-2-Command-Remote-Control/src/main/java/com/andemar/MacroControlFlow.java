package com.andemar;

import com.andemar.models.Command;
import com.andemar.models.MacroCommand;
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

public class MacroControlFlow {
  private static final List<Object> devices = new ArrayList<>();
  private static final Command[] onCommands = new Command[5];
  private static final Command[] offCommands = new Command[5];
  private static final RemoteControl remoteControl = new RemoteControl();

  public MacroControlFlow() {
    createDevices();
    createCommands();
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
    onCommands[0] = livingRoomLightOn;
    offCommands[0] = livingRoomLightOff;

    LightOnCommand kitchenLightOn = new LightOnCommand((Light) devices.get(1));
    LightOffCommand kitchenLightOff = new LightOffCommand((Light) devices.get(1));
    onCommands[1] = kitchenLightOn;
    offCommands[1] = kitchenLightOff;

    //Ceiling Fan
    CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand((CeilingFan) devices.get(2));
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand((CeilingFan) devices.get(2));
    onCommands[2] = ceilingFanOn;
    offCommands[2] = ceilingFanOff;

    //Garage Door
    GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand((GarageDoor) devices.get(3));
    GarageDoorDownCommand garageDoorClose = new GarageDoorDownCommand((GarageDoor) devices.get(3));
    onCommands[3] = garageDoorOpen;
    offCommands[3] = garageDoorClose;

    //Stereo
    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand((Stereo) devices.get(4));
    StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand((Stereo) devices.get(4));
    onCommands[4] = stereoOnWithCD;
    offCommands[4] = stereoOffWithCD;

  }

  private static void setCommands() {
    remoteControl.setCommand(0, new MacroCommand(onCommands), new MacroCommand(offCommands));
  }

  private static void pushAllButtons() {
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.undoButtonWasPushed();
  }
}
