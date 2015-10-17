package com.j2.factory;

public class SimplePizzaFactory {
  public Pizza createPizza(String type){
    Pizza pizza = null;
    
    if (type.equals("Cheese")){
      pizza = new CheesePizza();
    }
    else if (type.equals("Potato")){
      pizza = new PotatoPizza();
    }
    return pizza;   
  }
}