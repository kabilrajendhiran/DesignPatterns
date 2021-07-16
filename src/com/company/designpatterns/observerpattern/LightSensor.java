package com.company.designpatterns.observerpattern;

import java.util.ArrayList;

public class LightSensor implements Subject{

    int luminosity;
    ArrayList<Observer> observers;

    public LightSensor() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(luminosity));
    }

    @Override
    public void setValue(int luminosity) {
        this.luminosity = luminosity;
        notifyObservers();
    }
}
