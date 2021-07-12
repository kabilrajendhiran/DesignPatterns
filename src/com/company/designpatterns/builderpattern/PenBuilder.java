package com.company.designpatterns.builderpattern;

public interface PenBuilder {
    public void setPenType();
    public void fillInk();
    public Pen build();

}
