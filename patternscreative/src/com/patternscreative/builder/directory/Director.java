package com.patternscreative.builder.directory;


import com.patternscreative.builder.builders.IBuilder;
import com.patternscreative.builder.components.CarType;
import com.patternscreative.builder.components.Engine;
import com.patternscreative.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}
