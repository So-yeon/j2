package com.j2.state.errorstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State errorState;
  
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    errorState = new ErrorState(this);
    
    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    } 
  }
  
  public void insertQuarter() {
    state.insertQuarter();
  }
  
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  
  public void error() {
    state.error();
    state.insertQuarter();
  }
  
  void setState(State state) {
    this.state = state;
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }
  
  int getCount() {
    return count;
  }
  
  void refill(int count) {
    this.count = count;
    state = noQuarterState;
  }
  
  public State getState() {
    return state;
  }
  
  public State getSoldOutState() {
    return soldOutState;
  }
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  
  public State getSoldState() {
    return soldState;
  }
  
  public State getErrorState(){
    return errorState;
  }
  
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is " + state + "\n");
    return result.toString();
  }
}
