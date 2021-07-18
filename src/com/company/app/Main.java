package com.company.app;

import com.company.designpatterns.builderpattern.Run;
import com.company.designpatterns.decoratorpattern.DecoratorPatternExecutor;
import com.company.designpatterns.observerpattern.ObserverPatternExecutor;
import com.company.designpatterns.strategypattern.StrategyPatternExecuter;

public class Main {

    public static void main(String[] args) {
        Run run = new Run();
        run.executeBuilderPattern();

        StrategyPatternExecuter spe = new StrategyPatternExecuter();
        spe.execute();

        ObserverPatternExecutor ope = new ObserverPatternExecutor();
        ope.execute();

        DecoratorPatternExecutor dpe = new DecoratorPatternExecutor();
        dpe.execute();

    }
}
