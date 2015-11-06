package com.j2.command.commandnewcase;

public class MelonMusicPlayerOffCommand implements Command {
 MelonMusicPlayer melonMusicPlayer;
 
 public MelonMusicPlayerOffCommand(MelonMusicPlayer melonMusicPlayer) {
  this.melonMusicPlayer = melonMusicPlayer;
 }
 
 public void execute() {
  melonMusicPlayer.off();
 }
 
 public void undo() {
  melonMusicPlayer.on();
 }
}