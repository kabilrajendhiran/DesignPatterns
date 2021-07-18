package com.company.designpatterns.decoratorpattern;

import com.company.designpatterns.decoratorpattern.decorators.ExtraCheese;
import com.company.designpatterns.decoratorpattern.decorators.Pepperoni;

public class DecoratorPatternExecutor {
    public void execute()
    {
        Pizza pizza = new Pizza();
        Pizza cheesePizza = new ExtraCheese(pizza);
        Pizza pepperCheesePizza = new Pepperoni(cheesePizza);

        System.out.println(pepperCheesePizza.getDescription());
        System.out.println(pepperCheesePizza.cost());

    }
}
