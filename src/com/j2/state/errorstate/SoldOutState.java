package com.j2.state.errorstate;
public class SoldOutState implements State {
  GumballMachine gumballMachine;
  
  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the machine is sold out");
  }
  
  public void ejectQuarter() {
    System.out.println("You can't eject, you haven't inserted a quarter yet");
  }
  
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }
  
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  public void error(){
    System.out.println("Gumball Machine have some error.");
  }
  
  public String toString() {
    return "sold out";
  }
}
