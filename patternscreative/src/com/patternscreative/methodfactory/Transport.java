package com.patternscreative.methodfactory;

import com.patternscreative.methodfactory.vehicle.IVehicle;

public abstract class Transport {

    public void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    public abstract IVehicle createTransport();
}
