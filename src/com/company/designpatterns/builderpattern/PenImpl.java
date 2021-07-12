package com.company.designpatterns.builderpattern;

public class PenImpl implements Pen {

    private String penType;
    private String ink;

    public void setPenType(String penType) {
        this.penType = penType;
    }

    public void setInk(String ink) {
        this.ink = ink;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PenImpl{");
        sb.append("penType='").append(penType).append('\'');
        sb.append(", ink='").append(ink).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
