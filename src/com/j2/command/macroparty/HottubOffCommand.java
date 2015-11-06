package com.j2.command.macroparty;

public class HottubOffCommand implements Command {
 Hottub hottub;
 int temp;
 
 public HottubOffCommand(Hottub hottub) {
  this.hottub = hottub;
 }
 
 public void execute() {
  hottub.setTemperature(98);
  hottub.off();
 }
 
 public void undo() {
  hottub.on();
 }
}