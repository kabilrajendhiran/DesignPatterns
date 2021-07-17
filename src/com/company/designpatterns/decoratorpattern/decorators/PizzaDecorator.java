package com.company.designpatterns.decoratorpattern.decorators;

import com.company.designpatterns.decoratorpattern.Pizza;

public abstract class PizzaDecorator extends Pizza {

    @Override
    public abstract String getDescription();

    @Override
    public abstract double cost();


}
