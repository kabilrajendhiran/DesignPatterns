package com.company.designpatterns.factorypattern.simplefactory.creators;

import com.company.designpatterns.factorypattern.simplefactory.products.*;

public class SimplePizzaFactory {
    public Pizza createPizza(Enum<PizzaTypes> pizzaType)
    {
        Pizza pizza = null;
        if (pizzaType == PizzaTypes.CHEESE)
        {
            pizza = new CheesePizza();
        }
        else if(pizzaType == PizzaTypes.PEPPERONI)
        {
            pizza = new PepperoniPizza();
        }
        else if(pizzaType == PizzaTypes.CLAM)
        {
            pizza = new ClamPizza();
        }
        else if(pizzaType == PizzaTypes.VEGGIE)
        {
            pizza = new VeggiePizza();
        }
    return pizza;
    }
}
