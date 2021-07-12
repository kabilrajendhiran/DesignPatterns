package com.company.designpatterns.builderpattern;

public class BlackPenBuilder implements PenBuilder{

    Pen pen;

    public BlackPenBuilder() {
        this.pen = new PenImpl();
    }

    @Override
    public void setPenType() {
        pen.setPenType("BlackInkPen");
    }

    @Override
    public void fillInk() {
        pen.setInk("Black");
    }

    public Pen build()
    {
        return this.pen;
    }
}
