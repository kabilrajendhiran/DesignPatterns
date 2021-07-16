package com.company.designpatterns.observerpattern;

public class ObserverPatternExecuter {

    public void execute()
    {
        LightSensor lightSensor = new LightSensor();
        lightSensor.addObserver(new DisplayDevice());
        lightSensor.addObserver(new DisplayDevice());

        lightSensor.setValue(100);
        lightSensor.setValue(200);

    }

}
