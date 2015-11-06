package com.j2.command.commandnewcase;

public class InternetExploreOffCommand implements Command {
 InternetExplore internetExplore;
 
 public InternetExploreOffCommand(InternetExplore internetExplore) {
  this.internetExplore = internetExplore;
 }
 
 public void execute() {
  internetExplore.off();
 }
 
 public void undo() {
  internetExplore.on();
 }
}