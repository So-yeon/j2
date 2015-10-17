package com.j2.factory;

public class PizzaTestDrive{
  public static void main (String[] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    
    Pizza pizza = store.orderPizza("Cheese");
    System.out.println("We ordered a " + pizza.getName() + "\n");
    
    pizza = store.orderPizza("Potato");
    System.out.println("We ordered a " + pizza.getName() + "\n");
  }
}