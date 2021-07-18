package com.company.designpatterns.factorypattern.factory.creators.franchise.newyork;

import com.company.designpatterns.factorypattern.factory.creators.PizzaStore;
import com.company.designpatterns.factorypattern.factory.creators.PizzaTypes;
import com.company.designpatterns.factorypattern.factory.products.*;
import com.company.designpatterns.factorypattern.factory.products.franchise.newyork.NYStyleCheesePizza;
import com.company.designpatterns.factorypattern.factory.products.franchise.newyork.NYStyleClamPizza;
import com.company.designpatterns.factorypattern.factory.products.franchise.newyork.NYStylePepperoniPizza;
import com.company.designpatterns.factorypattern.factory.products.franchise.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(Enum<PizzaTypes> pizzaType) {
        if(pizzaType == PizzaTypes.CHEESE)
        {
            return new NYStyleCheesePizza();
        }
        else if(pizzaType == PizzaTypes.VEGGIE)
        {
            return new NYStyleVeggiePizza();
        }
        else if(pizzaType == PizzaTypes.CLAM)
        {
            return new NYStyleClamPizza();
        }
        else if(pizzaType == PizzaTypes.PEPPERONI)
        {
            return new NYStylePepperoniPizza();
        }
        else
        {
            return null;
        }
    }
}
