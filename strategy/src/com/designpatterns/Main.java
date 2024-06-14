package com.designpatterns;

import com.designpatterns.strategy.payments.CreditCardPayment;
import com.designpatterns.strategy.payments.Item;
import com.designpatterns.strategy.payments.PaypalPayment;
import com.designpatterns.strategy.payments.ShopCart;
import com.designpatterns.strategy.person.Person;
import com.designpatterns.strategy.person.strategies.eat.MeatFoodStrategy;
import com.designpatterns.strategy.person.strategies.eat.VeggieFoodStrategy;
import com.designpatterns.strategy.person.strategies.transportation.AirplaneStrategy;
import com.designpatterns.strategy.person.strategies.transportation.CarStrategy;
import com.designpatterns.strategy.person.strategies.work.DeveloperStrategy;
import com.designpatterns.strategy.person.strategies.work.PilotStrategy;

public class Main {
    public static void main(String[] args) {
        shoppingCart();
        person();
    }

    public static void shoppingCart() {
        ShopCart cart = new ShopCart();

        Item item = new Item(25);
        Item item2 = new Item(25);
        Item item3 = new Item(25);
        cart.addItem(item);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.setPaymentStrategy(new PaypalPayment("ana.maria@gmail.com", "123456"));
        cart.checkout();

        Item item4 = new Item(25);
        cart.addItem(item4);
        cart.setPaymentStrategy(new CreditCardPayment("maria.ana", "1234567", "015", "17/01/2030"));
        cart.checkout();

    }

    public static void person() {
        Person ruth = new Person("Ruth", new MeatFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
        presentation(ruth);

        Person juliana = new Person("Juliana", new VeggieFoodStrategy(), new AirplaneStrategy(), new PilotStrategy());
        presentation(juliana);
    }

    public static void presentation(Person person) {
        System.out.println("Oi, eu sou " + person.getName());
        person.eat();
        person.move();
        person.work();
        System.out.println("-------------------");
    }
}
