package com.lld.design.behavioural.chainofresponsblity;

public class Currency {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currency(int amount) {
        this.amount = amount;
    }
}
