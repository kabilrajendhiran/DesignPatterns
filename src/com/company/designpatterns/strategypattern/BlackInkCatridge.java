package com.company.designpatterns.strategypattern;

public class BlackInkCatridge implements InkCatridge {
    @Override
    public void setInkColor() {
        System.out.println("\u001b[30m");
    }
}
