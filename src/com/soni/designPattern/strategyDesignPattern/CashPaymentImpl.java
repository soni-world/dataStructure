package com.soni.designPattern.strategyDesignPattern;

public class CashPaymentImpl implements PaymentGateway{


    @Override
    public void pay(double amount) {
        System.out.println("Cash payment done for amount " + amount);
    }
}
