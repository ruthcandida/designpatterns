package com.patternscreative.methodfactory;

import com.patternscreative.methodfactory.vehicle.Car;
import com.patternscreative.methodfactory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    public IVehicle createTransport() {
        return new Car();
    }
}
