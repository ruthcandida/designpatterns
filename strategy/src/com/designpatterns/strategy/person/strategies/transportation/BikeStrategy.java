package com.designpatterns.strategy.person.strategies.transportation;

public class BikeStrategy implements TransportationStrategy{
    @Override
    public void transport() {
        System.out.println("Eu ando de BIKE!");
    }
}
