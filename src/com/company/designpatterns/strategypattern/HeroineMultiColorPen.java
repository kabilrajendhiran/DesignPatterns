package com.company.designpatterns.strategypattern;

public class HeroineMultiColorPen extends MultiColorPen {

    InkCatridge inkCatridge;

    @Override
    public void write(String text) {
        System.out.println(text);
    }

}
