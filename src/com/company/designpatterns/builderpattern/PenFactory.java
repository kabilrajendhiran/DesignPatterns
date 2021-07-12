package com.company.designpatterns.builderpattern;

public class PenFactory {
    PenBuilder penBuilder;

    public PenFactory(PenBuilder penBuilder) {
        this.penBuilder = penBuilder;
    }

    public Pen getPen()
    {
        return this.penBuilder.build();
    }

    public void buildPen()
    {
        this.penBuilder.setPenType();
        this.penBuilder.fillInk();
    }

}
