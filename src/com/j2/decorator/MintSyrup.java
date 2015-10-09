package com.j2.decorator;

public class MintSyrup extends CondimentDecorator {

 public MintSyrup(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", MintSyrup";
 }

 public double cost() {
  return .70 + beverage.cost();
 }
}