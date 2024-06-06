package com.patternscreative.builder.builders;

import com.patternscreative.builder.cars.Truck;
import com.patternscreative.builder.components.CarType;
import com.patternscreative.builder.components.Engine;
import com.patternscreative.builder.components.Transmission;

public class TruckBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;



    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getresult(){
        return new Truck(carType, seats, engine, transmission);
    }
}