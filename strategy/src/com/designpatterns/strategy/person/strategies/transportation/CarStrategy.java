package com.designpatterns.strategy.person.strategies.transportation;

public class CarStrategy implements TransportationStrategy{
    @Override
    public void transport() {
        System.out.println("Eu ando de CARRO!");
    }
}
