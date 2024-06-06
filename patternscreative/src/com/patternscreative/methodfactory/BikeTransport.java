package com.patternscreative.methodfactory;

import com.patternscreative.methodfactory.vehicle.Bike;
import com.patternscreative.methodfactory.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    public IVehicle createTransport() {
        return new Bike();
    }
}
