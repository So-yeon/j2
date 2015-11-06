package com.j2.command.commandnewcase;

public class InternetExplore {
  String path;
  
  public InternetExplore(String path) {
    this.path = path;
  }
  
  public void on() {
    System.out.println("* " + path + " InternetExplore is on");
    System.out.println("Have a nice surf~");
  }
  
  public void off() {
    System.out.println(path + " InternetExplore is off");
  }
}