package com.designpatterns.strategy.payments;

public class PaypalPayment implements PaymentStrategy {
    private String email;

    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("** Pago via PayPal" + amount);
    }
}
