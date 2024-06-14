package com.designpatterns.strategy.person.strategies.eat;

public class MeatFoodStrategy implements EatStrategy{
    @Override
    public void eat() {
        System.out.println("Eu como carne!");
    }
}
