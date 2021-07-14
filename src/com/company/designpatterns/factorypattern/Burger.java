package com.company.designpatterns.factorypattern;

public class Burger implements IBurger {

    private String burgerType;
    private String bake;
    private String pack;

    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }

    @Override
    public void bake() {
        this.bake = "Baked";
    }

    @Override
    public void pack() {
        this.pack = "Packed";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Burger{");
        sb.append("burgerType='").append(burgerType).append('\'');
        sb.append(", bake='").append(bake).append('\'');
        sb.append(", pack='").append(pack).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
