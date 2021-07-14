package com.company.designpatterns.factorypattern;

public class VegBurger extends Burger implements BurgerBuilder{
    private final Burger burger;

    public VegBurger() {
        burger = new Burger();
    }

    public void fillBurger()
    {
         burger.setBurgerType("Vegetables");
    }

    public Burger prepare()
    {
        fillBurger();
        return burger;
    }
}
