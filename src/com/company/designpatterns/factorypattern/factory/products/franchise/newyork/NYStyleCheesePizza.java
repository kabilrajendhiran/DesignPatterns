package com.company.designpatterns.factorypattern.factory.products.franchise.newyork;

import com.company.designpatterns.factorypattern.factory.products.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        toppings.add("Grated Reggiano Cheese");
    }
}
