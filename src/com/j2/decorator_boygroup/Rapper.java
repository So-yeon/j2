package com.j2.decorator_boygroup;

public class Rapper extends Position{
 public Rapper(BoyGroup boygroup) {
  this.boygroup = boygroup;
 }

 public String getDescription() {
  return boygroup.getDescription() + "Rapper, ";
 }

 public int memberNum() {
  return 1 + boygroup.memberNum();
 }
}
