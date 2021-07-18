package com.company.designpatterns.factorypattern.factory.creators;
import com.company.designpatterns.factorypattern.factory.products.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(Enum<PizzaTypes> pizzaType)
    {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(Enum<PizzaTypes> pizzaType);

}
