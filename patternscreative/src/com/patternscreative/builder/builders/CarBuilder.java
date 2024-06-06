package com.patternscreative.builder.builders;

import com.patternscreative.builder.cars.Car;
import com.patternscreative.builder.components.CarType;
import com.patternscreative.builder.components.Engine;
import com.patternscreative.builder.components.Transmission;

public class CarBuilder implements IBuilder {
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

    public Car getresult(){
        return new Car(carType, seats, engine, transmission);
    }
}