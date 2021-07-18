package com.company.designpatterns.factorypattern.factory.products;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing "+name);
        toppings.forEach(topping -> System.out.print(topping+" "));
        System.out.println();
    }
    public void bake(){
        System.out.println("Bake Pizza");
    }
    public void cut(){
        System.out.println("Cut Pizza");
    }
    public void box(){
        System.out.println("Box Pizza");
    }
}
