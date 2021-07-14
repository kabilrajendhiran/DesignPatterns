package com.company.designpatterns.strategypattern;

public class StrategyPatternExecuter {

    public void execute()
    {
        HeroineMultiColorPen pen = new HeroineMultiColorPen();
        pen.setInkCatridge(new BlueInkCatridge());
        pen.fillInk();
        pen.write("Kabil");

        pen.setInkCatridge(new BlackInkCatridge());
        pen.fillInk();
        pen.write("Alcatraz");
    }

}
