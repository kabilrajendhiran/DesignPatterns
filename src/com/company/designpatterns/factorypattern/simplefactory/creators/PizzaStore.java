package com.company.designpatterns.factorypattern.simplefactory.creators;

import com.company.designpatterns.factorypattern.simplefactory.products.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(Enum<PizzaTypes> pizzaType)
    {
        Pizza pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
