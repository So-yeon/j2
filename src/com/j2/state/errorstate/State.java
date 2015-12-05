package com.j2.state.errorstate;

public interface State {
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
  public void error(); //고장상태
}