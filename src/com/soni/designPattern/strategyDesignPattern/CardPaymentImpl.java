package com.soni.designPattern.strategyDesignPattern;

public class CardPaymentImpl implements PaymentGateway{

    @Override
    public void pay(double amount) {
        System.out.println("card is charged for " + amount);
    }
}
