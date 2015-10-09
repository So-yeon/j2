package com.j2.decorator;

public class HouseBlend extends Beverage {
 
 public HouseBlend() { //디폴트생성자
  description = "House Blend Coffee// Ingredient = ";
 }
 
 public double cost() {
  return .89;
 }
}