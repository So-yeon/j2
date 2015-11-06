package com.j2.command.commandnewcase;

public class MelonMusicPlayerOnCommand implements Command {
 MelonMusicPlayer melonMusicPlayer;
 
 public MelonMusicPlayerOnCommand(MelonMusicPlayer melonMusicPlayer) {
  this.melonMusicPlayer = melonMusicPlayer;
 }
 
 public void execute() {
  melonMusicPlayer.on();
 }
 
 public void undo() {
  melonMusicPlayer.off();
 }
}