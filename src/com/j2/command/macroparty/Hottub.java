package com.j2.command.macroparty;
//¿åÁ¶
public class Hottub {
  String location;
  boolean on;
  int temp;
  
  public Hottub(String location) {
    this.location = location;
  }
  public void on() {
    on = true;
    System.out.println(location + "Hottub is on");
  }
  
  public void off() {
    on = false;
    System.out.println(location + "Hottub is off");
  }
  
public void setTemperature(int temp) { 
  if (temp > this.temp) { 
    System.out.println(location + "Hottub is heating to a steaming " + temp + " degrees"); 
   } 
   else { 
    System.out.println(location + "Hottub is cooling to " + temp + " degrees"); 
   } 
   this.temp = temp; 
  } 

}
