package com.soni.designPattern.strategyDesignPattern;

public class PayPartiallyBills {

    public static void main(String[] args) {
        PaymentStrategy payment = new PaymentStrategy();
        CardPaymentImpl card = new CardPaymentImpl();
        CashPaymentImpl cash = new CashPaymentImpl();

        payment.setPaymentStrategy(card);
        payment.makePayment(30);

        payment.setPaymentStrategy(cash);
        payment.makePayment(40);
    }
}
