package com.company.designpatterns.factorypattern.factory.products.franchise.chicago;

import com.company.designpatterns.factorypattern.factory.products.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        toppings.add("Carrot");
        toppings.add("Corn");
    }
}
