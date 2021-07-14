package com.company.designpatterns.strategypattern;

public class BlueInkCatridge implements InkCatridge {
    @Override
    public void setInkColor() {
        System.out.println("\u001b[34m");
    }
}
