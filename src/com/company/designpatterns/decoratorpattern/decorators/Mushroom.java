package com.company.designpatterns.decoratorpattern.decorators;

import com.company.designpatterns.decoratorpattern.Pizza;

public class Mushroom extends PizzaDecorator {
    Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Mushroom";
    }

    @Override
    public double cost() {
        return pizza.cost() + 25.0;
    }
}
