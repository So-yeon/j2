package com.j2.factory.pizzaaf;

public class SoyeonPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public SoyeonPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        potato = ingredientFactory.createPotato();
    }
}
