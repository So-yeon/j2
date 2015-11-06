package com.j2.command.commandnewcase;

public class InternetExploreOnCommand implements Command {
 InternetExplore internetExplore;
 
 public InternetExploreOnCommand(InternetExplore internetExplore) {
  this.internetExplore = internetExplore;
 }
 
 public void execute() {
  internetExplore.on();
 }
 
 public void undo() {
  internetExplore.off();
 }
}