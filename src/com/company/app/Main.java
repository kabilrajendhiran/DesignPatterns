package com.company.app;

import com.company.designpatterns.builderpattern.Run;
import com.company.designpatterns.factorypattern.FactoryPatternRun;

public class Main {

    public static void main(String[] args) {
        Run run = new Run();
        run.executeBuilderPattern();

        FactoryPatternRun factoryPatternRun = new FactoryPatternRun();
        factoryPatternRun.run();

    }
}
