package com.company.designpatterns.factorypattern.factory.products.franchise.newyork;

import com.company.designpatterns.factorypattern.factory.products.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NewYork Style Clam Pizza";
        toppings.add("NewYork Clam");
    }
}
