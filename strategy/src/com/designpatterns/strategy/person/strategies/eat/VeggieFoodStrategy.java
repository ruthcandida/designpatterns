package com.designpatterns.strategy.person.strategies.eat;

public class VeggieFoodStrategy implements EatStrategy{
    @Override
    public void eat() {
        System.out.println("Eu como comida vegana!");
    }
}
