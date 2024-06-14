package com.designpatterns.strategy.person;

import com.designpatterns.strategy.person.strategies.eat.EatStrategy;
import com.designpatterns.strategy.person.strategies.transportation.TransportationStrategy;
import com.designpatterns.strategy.person.strategies.work.WorkStrategy;

public class Person {
    private EatStrategy eatStrategy;
    private TransportationStrategy transportationStrategy;
    private WorkStrategy workStrategy;
    private String name;

    public Person(String name, EatStrategy eatStrategy, TransportationStrategy transportationStrategy, WorkStrategy workStrategy) {
        this.name = name;
        this.eatStrategy = eatStrategy;
        this.transportationStrategy = transportationStrategy;
        this.workStrategy = workStrategy;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        eatStrategy.eat();
    }

    public void work() {
        workStrategy.job();
    }

    public void move() {
        transportationStrategy.transport();
    }
}
