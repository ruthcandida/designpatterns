package com.patternscreative.abstractfactory.factories;

import com.patternscreative.abstractfactory.aircrafts.Airplane;
import com.patternscreative.abstractfactory.aircrafts.IAircraft;
import com.patternscreative.abstractfactory.landvehicle.Car;
import com.patternscreative.abstractfactory.landvehicle.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
