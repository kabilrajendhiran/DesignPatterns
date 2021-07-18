package com.company.designpatterns.factorypattern.factory.products.franchise.newyork;

import com.company.designpatterns.factorypattern.factory.products.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NewYork Style Veggie Pizza";
        toppings.add("Cheese");
        toppings.add("Cabbage");
        toppings.add("Onions");
    }
}
