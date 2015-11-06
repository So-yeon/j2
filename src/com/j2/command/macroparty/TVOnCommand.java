package com.j2.command.macroparty;

public class TVOnCommand implements Command {
 TV tv;
 int channel;
 
 public TVOnCommand(TV tv) {
  this.tv = tv;
 }
 
 public void execute() {
  tv.on();
  //tv.setChannel();
 }
 
 public void undo() {
  tv.off();
 }
}