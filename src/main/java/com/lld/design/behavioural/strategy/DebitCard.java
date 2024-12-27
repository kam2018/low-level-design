package com.lld.design.behavioural.strategy;

public class DebitCard implements PaymentStrategy {
    private String debitCardNo;
    public DebitCard(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }
    @Override
    public boolean validateDetails() {
        if (debitCardNo.length() == 16) {
            System.out.println("Debit card validated successfully!!");
            return true;
        } else {
            System.out.println("Debit card validation failed!!");
            return false;
        }
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment successful!!");
    }
}
