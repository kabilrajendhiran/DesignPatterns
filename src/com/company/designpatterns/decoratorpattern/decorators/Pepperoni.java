package com.company.designpatterns.decoratorpattern.decorators;

import com.company.designpatterns.decoratorpattern.Pizza;

public class Pepperoni extends PizzaDecorator {

    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Pepperoni";
    }

    @Override
    public double cost() {
        return pizza.cost() + 10.5;
    }
}
