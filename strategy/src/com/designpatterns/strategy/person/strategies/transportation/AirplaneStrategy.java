package com.designpatterns.strategy.person.strategies.transportation;

public class AirplaneStrategy implements TransportationStrategy{
    @Override
    public void transport() {
        System.out.println("Eu ando de Avião!");
    }
}
