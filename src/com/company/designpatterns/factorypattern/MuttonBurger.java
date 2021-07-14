package com.company.designpatterns.factorypattern;

public class MuttonBurger extends Burger implements BurgerBuilder {

    private final Burger burger;

    public MuttonBurger() {
        burger = new Burger();
    }

    @Override
    public void fillBurger() {
        burger.setBurgerType("Mutton pieces");
    }

    @Override
    public IBurger prepare() {
        return this.burger;
    }
}
