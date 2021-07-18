package com.company.designpatterns.factorypattern.factory.products.franchise.chicago;

import com.company.designpatterns.factorypattern.factory.products.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        toppings.add("Chicago Pepper");
    }
}
