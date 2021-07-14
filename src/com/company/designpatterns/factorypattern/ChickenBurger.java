package com.company.designpatterns.factorypattern;

public class ChickenBurger extends Burger implements BurgerBuilder {
    private final Burger burger;

    public ChickenBurger() {
        burger = new Burger();
    }

    @Override
    public void fillBurger() {
        burger.setBurgerType("Chicken pieces");
    }

    @Override
    public IBurger prepare() {
        return this.burger;
    }
}
