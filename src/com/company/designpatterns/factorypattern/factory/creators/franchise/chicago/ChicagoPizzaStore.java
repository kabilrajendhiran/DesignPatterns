package com.company.designpatterns.factorypattern.factory.creators.franchise.chicago;

import com.company.designpatterns.factorypattern.factory.creators.PizzaStore;
import com.company.designpatterns.factorypattern.factory.creators.PizzaTypes;
import com.company.designpatterns.factorypattern.factory.products.Pizza;
import com.company.designpatterns.factorypattern.factory.products.franchise.chicago.*;


public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(Enum<PizzaTypes> pizzaType) {
        if(pizzaType == PizzaTypes.CHEESE)
        {
            return new ChicagoStyleCheesePizza();
        }
        else if(pizzaType == PizzaTypes.VEGGIE)
        {
            return new ChicagoStyleVeggiePizza();
        }
        else if(pizzaType == PizzaTypes.CLAM)
        {
            return new ChicagoStyleClamPizza();
        }
        else if(pizzaType == PizzaTypes.PEPPERONI)
        {
            return new ChicagoStylePepperoniPizza();
        }
        else
        {
            return null;
        }
    }
}
