package com.j2.iterator.dinermerger.before;

public class MenuItem {
  String name;
  String description;
  boolean vegetarian;  //채식주의자일때.
  double price;
  
  public MenuItem(String n, String d, boolean v, double p) { //getter
    this.name = n;
    this.description = d;
    this.vegetarian = v;
    this.price = p;
  }
  
  public String getName() {return name;}
  public String getDescription() {return description;}
  public double getPrice() {return price;}
  public boolean getVegitarian() {return vegetarian;}
  //public String toString() {
    //return (name)
}