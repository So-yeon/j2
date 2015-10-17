package com.j2.factory;

abstract public class Pizza{
  String name;
  
  public String getName(){
    return name;
  }
  public void prepare(){
    System.out.println("Preparing...");
  }
  public void bake(){
    System.out.println("Baking...");
  }
  public void cut(){
    System.out.println("Cutting...");
  }
  public void box(){
    System.out.println("Boxing...");
  }
}