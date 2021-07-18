package com.company.designpatterns.factorypattern.factory.products.franchise.newyork;

import com.company.designpatterns.factorypattern.factory.products.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NewYork Style Pepperoni Pizza";
        toppings.add("NewYork pepper");
    }
}
