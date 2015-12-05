package com.j2.state.errorstate;

public class ErrorState implements State {
    GumballMachine gumballMachine;
 
    public ErrorState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
     public void error(){
       System.out.println("Gumball Machine have some error.");
     }
     
     public void insertQuarter() {
       System.out.println("You inserted a new quarter");
       gumballMachine.setState(gumballMachine.getHasQuarterState());
     }
 
     public void ejectQuarter() {
       System.out.println("You haven't inserted a quarter");
     }
     
     public void turnCrank() {
       System.out.println("You turned, but there's no quarter");
     }
 
     public void dispense() {
       System.out.println("You need to pay first");
     }
 
     public String toString() {
       return "Gumball Machine Error";
     }
}
