package com.designpatterns.strategy.person.strategies.work;

public class PilotStrategy implements WorkStrategy{
    @Override
    public void job() {
        System.out.println("Eu sou Piloto de Avião!");
    }
}
