package com.j2.factory.pizzafm;

public abstract class PizzaStore {
  abstract Pizza createPizza(String item);  //이게 factory method/ 구현하지 않았음.
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}