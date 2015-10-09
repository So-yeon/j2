package com.j2.decorator_boygroup;

public class Dancer extends Position{

  public Dancer(BoyGroup boygroup) {
   this.boygroup = boygroup;
  }

  public String getDescription() {
   return boygroup.getDescription() + "Dancer, ";
  }

  public int memberNum() {
   return 1 + boygroup.memberNum();
  }
}