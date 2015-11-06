package com.j2.command.macroparty;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light light = new Light("My Sweet Home ");
    TV tv = new TV("My Sweet Home ");
    Stereo stereo = new Stereo("My Sweet Home ");
    Hottub hottub = new Hottub("My Toilet ");
 
    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);
    
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);

    Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
    Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On---");
    remoteControl.onButtonWasPushed(0);
    
    System.out.println("--- Pushing Macro Off---");
    remoteControl.offButtonWasPushed(0);
  }
}

