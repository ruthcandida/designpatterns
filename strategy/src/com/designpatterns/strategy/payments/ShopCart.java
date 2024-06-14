package com.designpatterns.strategy.payments;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {
    List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShopCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public Double calculateTotal(){
        Double sum = 0.0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(){
        Double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

}
