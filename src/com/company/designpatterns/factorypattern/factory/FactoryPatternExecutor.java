package com.company.designpatterns.factorypattern.factory;

import com.company.designpatterns.factorypattern.factory.creators.PizzaStore;
import com.company.designpatterns.factorypattern.factory.creators.PizzaTypes;
import com.company.designpatterns.factorypattern.factory.creators.franchise.chicago.ChicagoPizzaStore;
import com.company.designpatterns.factorypattern.factory.creators.franchise.newyork.NYPizzaStore;

public class FactoryPatternExecutor {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza(PizzaTypes.VEGGIE);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza(PizzaTypes.CLAM);
    }
}
