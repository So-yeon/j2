package com.j2.templatemethod.smbarista;

public class CaramelMacchiato extends CaffeineBeverage {
 public void brew() {
  System.out.println("Make Espresso With Cutting mill.");
 }
 public void addCondiments() {
  System.out.println("Adding Vanilla Syrup and Caramel.");
 }
}