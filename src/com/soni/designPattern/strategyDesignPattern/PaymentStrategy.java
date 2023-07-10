package com.soni.designPattern.strategyDesignPattern;

public class PaymentStrategy {

    private PaymentGateway paymentGateway;

    public void setPaymentStrategy(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(double amount){
        paymentGateway.pay(amount);
    }

}
