package com.company.designpatterns.builderpattern;

public class Run {

    public void executeBuilderPattern()
    {
        PenBuilder penBuilder = new BlackPenBuilder();
        PenFactory penFactory = new PenFactory(penBuilder);
        penFactory.buildPen();
        System.out.println(penFactory.getPen());
    }

}
