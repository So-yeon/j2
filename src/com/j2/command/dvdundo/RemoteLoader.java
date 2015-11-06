package com.j2.command.dvdundo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
    DVD myHomeDVD = new DVD("My Home");

    DVDOnCommand myHomeDVDOn = new DVDOnCommand(myHomeDVD);
    DVDOffCommand myHomeDVDOff = new DVDOffCommand(myHomeDVD);

    remoteControl.setCommand(0, myHomeDVDOn, myHomeDVDOff);
 
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
  }
}