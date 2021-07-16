package com.company.designpatterns.observerpattern;

public class DisplayDevice implements Observer{

    int luminosity;

    @Override
    public void update(int luminosity) {
        this.luminosity = luminosity;
        display();
    }

    public void display()
    {
        System.out.println(this);
        System.out.println("luminosity = " + luminosity);
    }
}
