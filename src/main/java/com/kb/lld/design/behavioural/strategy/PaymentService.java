package com.kb.lld.design.behavioural.strategy;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment(int amount) {
        if (paymentStrategy.validateDetails()) {
            paymentStrategy.pay(amount);
        }
    }
}
