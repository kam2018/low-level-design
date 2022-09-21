package com.kb.lld.design.behavioural.strategy;

public class CreditCard implements PaymentStrategy {
    private String creditCardNo;
    public CreditCard(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    @Override
    public boolean validateDetails() {
        if (creditCardNo.length() == 16) {
            System.out.println("Credit card validated successfully!!");
            return true;
        } else {
            System.out.println("Credit card validation failed!!");
            return false;
        }
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment successful!!");
    }
}
