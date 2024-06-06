package com.patternscreative;

import com.patternscreative.abstractfactory.app.Application;
import com.patternscreative.abstractfactory.factories.ITransportFactory;
import com.patternscreative.abstractfactory.factories.UberTransport;
import com.patternscreative.builder.builders.CarBuilder;
import com.patternscreative.builder.builders.TruckBuilder;
import com.patternscreative.builder.cars.Car;
import com.patternscreative.builder.cars.Truck;
import com.patternscreative.builder.directory.Director;
import com.patternscreative.methodfactory.BikeTransport;
import com.patternscreative.methodfactory.CarTransport;
import com.patternscreative.methodfactory.MotorCycleTransport;
import com.patternscreative.methodfactory.Transport;

public class Main {
    private static Transport transport;
    public static void main(String[] args) {
        configureMethodFactory(args[0]);

        Application app = configureAbstractFactory();
        app.startRoute();

        constructorCars();

    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configureMethodFactory(String type) {
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log" :
                transport = new MotorCycleTransport();
                break;
            case "eats" :
                transport = new BikeTransport();
                break;
            default :
                System.out.println("Selecione o tipo de entrega");
        }
        if(transport != null){
            runTransport();
        }
    }

    private static Application configureAbstractFactory() {
        Application app;
        ITransportFactory factory = null;

        String company = "uber";

        if(company == "uber"){
            factory = new UberTransport();
        }
        app = new Application(factory);

        return app;
    }

    private static void constructorCars() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " +truck.result());
    }
}
