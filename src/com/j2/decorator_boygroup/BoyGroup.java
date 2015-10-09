package com.j2.decorator_boygroup;

public abstract class BoyGroup{
 String description = "Unknown Idol";
   
 public String getDescription() {
  return description;
 }
 public abstract int memberNum();
}