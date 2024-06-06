package com.patternscreative.methodfactory.vehicle;

public class MotorCycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga!");
    }
}
