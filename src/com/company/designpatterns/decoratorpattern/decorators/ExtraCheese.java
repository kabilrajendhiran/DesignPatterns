package com.company.designpatterns.decoratorpattern.decorators;

import com.company.designpatterns.decoratorpattern.Pizza;

public class ExtraCheese extends PizzaDecorator {
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Extra Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 20.5;
    }
}
