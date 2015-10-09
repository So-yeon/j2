package com.j2.decorator;

public class JavaChip extends CondimentDecorator {
  
 public JavaChip(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", JavaChip";
 }
 
 public double cost() {
  return .52 + beverage.cost();
 }
}