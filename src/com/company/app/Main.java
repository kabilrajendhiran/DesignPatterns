package com.company.app;

import com.company.designpatterns.builderpattern.Run;
import com.company.designpatterns.decoratorpattern.DecoratorPatternExecuter;
import com.company.designpatterns.factorypattern.FactoryPatternRun;
import com.company.designpatterns.observerpattern.ObserverPatternExecuter;
import com.company.designpatterns.strategypattern.StrategyPatternExecuter;

public class Main {

    public static void main(String[] args) {
        Run run = new Run();
        run.executeBuilderPattern();

        FactoryPatternRun factoryPatternRun = new FactoryPatternRun();
        factoryPatternRun.run();

        StrategyPatternExecuter spe = new StrategyPatternExecuter();
        spe.execute();

        ObserverPatternExecuter ope = new ObserverPatternExecuter();
        ope.execute();

        DecoratorPatternExecuter dpe = new DecoratorPatternExecuter();
        dpe.execute();

    }
}
