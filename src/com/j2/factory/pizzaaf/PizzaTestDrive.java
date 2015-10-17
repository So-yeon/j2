package com.j2.factory.pizzaaf;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore soyeonStore = new SoyeonPizzaStore();
 
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
 
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");
        
        pizza = soyeonStore.orderPizza("potato");
        System.out.println("Soyeon ordered a " + pizza + "\n");
 }
}
