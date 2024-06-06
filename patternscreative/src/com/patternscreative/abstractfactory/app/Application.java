package com.patternscreative.abstractfactory.app;

import com.patternscreative.abstractfactory.aircrafts.IAircraft;
import com.patternscreative.abstractfactory.factories.ITransportFactory;
import com.patternscreative.abstractfactory.landvehicle.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
