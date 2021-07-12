package com.company.designpatterns.builderpattern;

public class BluePenBuilder implements PenBuilder{
    Pen pen;

    public BluePenBuilder() {
        this.pen = new PenImpl();
    }

    @Override
    public void setPenType() {
        pen.setPenType("BluePen");
    }

    @Override
    public void fillInk() {
        pen.setInk("Blue");
    }

    public Pen build()
    {
        return this.pen;
    }
}
