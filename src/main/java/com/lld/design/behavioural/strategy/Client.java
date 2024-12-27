package com.lld.design.behavioural.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCard("1234567890123456");
        PaymentStrategy debitCard = new DebitCard("123456790123456");
        new PaymentService(creditCard).doPayment(1000);
        new PaymentService(debitCard).doPayment(1000);
    }
}
