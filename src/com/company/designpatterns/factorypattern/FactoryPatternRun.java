package com.company.designpatterns.factorypattern;

public class FactoryPatternRun {

    public void run()
    {
        BurgerFactory burgerFactory = new BurgerFactory();
        IBurger burger = burgerFactory.prepareBurger(BurgerTypes.VEG);
        burger.bake();
        burger.pack();

        System.out.println(burger);

    }

}
