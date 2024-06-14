package com.designpatterns.strategy.person.strategies.work;

public class DeveloperStrategy implements WorkStrategy{
    @Override
    public void job() {
        System.out.println("Eu sou Desenvolvedor de Software!");
    }
}
