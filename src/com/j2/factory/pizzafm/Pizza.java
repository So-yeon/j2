package com.j2.factory.pizzafm;

public abstract class Pizza{
   String name;
   void prepare(){
    System.out.println("prepareing...");
  }
  void bake(){
    System.out.println("Baking...");
  }
   void box(){
    System.out.println("Boxing...");
  }
  void cut() {
    System.out.println("Cutting...");
  }
  public String getName() {
  return name;
  }
public String toString() {
  System.out.println("---" + name + "---");
  return name;
  }
  
}