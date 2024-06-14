package com.designpatterns.strategy.payments;

public class Item {
    private int price;

    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
