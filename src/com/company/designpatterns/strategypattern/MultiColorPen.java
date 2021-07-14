package com.company.designpatterns.strategypattern;

public abstract class MultiColorPen {

    InkCatridge inkCatridge;

    public abstract void write(String text);

    public void setInkCatridge(InkCatridge inkCatridge) {
        this.inkCatridge = inkCatridge;
    }

    public void fillInk()
    {
        this.inkCatridge.setInkColor();
    }
}
