package com.j2.factory.pizzafm;

public class PizzaTestDrive{
  public static void main (String[] args) {  
    //simplePizzaFactory fac = new SimplePizzaFactory();
    
    PizzaStore nystore = new NYPizzaStore();
    PizzaStore smstore = new SMPizzaStore();
    
    Pizza pizza = nystore.orderPizza("cheese");
    System.out.println("We ordered a " + pizza.getName() + "\n");
   
    pizza = smstore.orderPizza("potato");
    System.out.println("We ordered a " + pizza.getName() + "\n");
  }
}