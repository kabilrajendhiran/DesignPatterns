package com.company.designpatterns.observerpattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setValue(int luminosity);
}
