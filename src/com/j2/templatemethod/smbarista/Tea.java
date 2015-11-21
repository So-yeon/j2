package com.j2.templatemethod.smbarista;

public class Tea extends CaffeineBeverage {
 public void brew() {
  System.out.println("Steeping the tea");
 }
 public void addCondiments() {
  System.out.println("Adding Lemon");
 }
}