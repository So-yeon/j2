package com.j2.decorator_boygroup;


public class MainVocal extends Position {
 public MainVocal(BoyGroup boygroup) {
  this.boygroup = boygroup;
 }

 public String getDescription() {
  return boygroup.getDescription() + "MainVocal, ";
 }

 public int memberNum() {
  return 1 + boygroup.memberNum();
 }
}