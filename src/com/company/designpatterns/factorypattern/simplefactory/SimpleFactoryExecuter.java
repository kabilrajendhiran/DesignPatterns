package com.company.designpatterns.factorypattern.simplefactory;

import com.company.designpatterns.factorypattern.simplefactory.creators.PizzaStore;
import com.company.designpatterns.factorypattern.simplefactory.creators.PizzaTypes;
import com.company.designpatterns.factorypattern.simplefactory.creators.SimplePizzaFactory;
import com.company.designpatterns.factorypattern.simplefactory.products.Pizza;

public class SimpleFactoryExecuter {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza(PizzaTypes.VEGGIE);

    }

}
