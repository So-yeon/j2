package com.j2.command.commandnewcase;

public class MelonMusicPlayer {
  String path;
  
  public MelonMusicPlayer(String path) {
    this.path = path;
  }
  
  public void on() {
    System.out.println("* " + path + "MelonMusicPlayer is on");
    System.out.println("Play your music list ^.^");
  }
  
  public void off() {
    System.out.println(path + "MelonMusicPlayer is off");
  }
}