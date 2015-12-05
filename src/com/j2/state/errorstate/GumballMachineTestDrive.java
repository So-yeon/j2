package com.j2.state.errorstate;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    
    gumballMachine.error();
    gumballMachine.insertQuarter();
    System.out.println(gumballMachine);
  }
}
