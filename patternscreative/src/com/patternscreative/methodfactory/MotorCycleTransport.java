package com.patternscreative.methodfactory;

import com.patternscreative.methodfactory.vehicle.IVehicle;
import com.patternscreative.methodfactory.vehicle.MotorCycle;

public class MotorCycleTransport extends Transport{
    @Override
    public IVehicle createTransport() {
        return new MotorCycle();
    }
}
