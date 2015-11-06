package com.j2.command.macroparty;

public class TVOffCommand implements Command {
 TV tv;
 int channel;
 public TVOffCommand(TV tv) {
  this.tv = tv;
 }
 
 public void execute() {
  tv.off();
 }
 
 public void undo() {
  tv.on();
 }
}