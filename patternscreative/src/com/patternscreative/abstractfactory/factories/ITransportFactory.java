package com.patternscreative.abstractfactory.factories;

import com.patternscreative.abstractfactory.aircrafts.IAircraft;
import com.patternscreative.abstractfactory.landvehicle.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
