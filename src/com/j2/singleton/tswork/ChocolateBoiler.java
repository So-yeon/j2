package com.j2.singleton.tswork;
//thread safe로 구현하는 과제.
//Synchronized를 써서 구현하면 thread에서 알아서 순서를 처리해줌.
public class ChocolateBoiler {
 private boolean empty;
 private boolean boiled;
 private static ChocolateBoiler uniqueInstance;
 private static int numCalled = 0; 
  
 private ChocolateBoiler() {
  empty = true;
  boiled = false;
 }
//Synchronized를 써서 thread구현 
 public static synchronized ChocolateBoiler getInstance() {
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new ChocolateBoiler();
  }
  System.out.println("Returning instance of Chocolate Boiler" );
  System.out.println("NumCalled : " + numCalled++ + "\n");
  return uniqueInstance;
 }
 public void fill() {
  if (isEmpty()) {
   empty = false;
   boiled = false;
  }
 }
 
 public void drain() {
  if (!isEmpty() && isBoiled()) {
   empty = true;
  }
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   boiled = true;
  }
 }
  
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isBoiled() {
  return boiled;
 }
}
