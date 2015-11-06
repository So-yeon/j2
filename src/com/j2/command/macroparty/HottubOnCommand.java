package com.j2.command.macroparty;

public class HottubOnCommand implements Command {
 Hottub hottub;
 int temp;
 
 public HottubOnCommand(Hottub hottub) {
  this.hottub = hottub;
 }
 
 public void execute() {
  hottub.setTemperature(104);
  hottub.on();
 }
 
 public void undo() {
  hottub.off();
 }
 
}