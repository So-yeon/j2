package com.j2.command.macroparty;

public class TV {
  String location;
  int channel;
  
  public TV(String location) {
    this.location = location;
  }
  
  public void on() {
    System.out.println(location + "TV is turn on");
  }
  
  public void off() {
    System.out.println(location + "TV is turn off");
  }
  
  public void setChannel(int channel) {
    this.channel = 7;
    System.out.println("TV was changed channel to  'CH " + channel + "' %");
  }
}