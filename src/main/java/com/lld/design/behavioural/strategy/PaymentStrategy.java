package com.lld.design.behavioural.strategy;

public interface PaymentStrategy {

    boolean validateDetails();

    void pay(int amount);
}
