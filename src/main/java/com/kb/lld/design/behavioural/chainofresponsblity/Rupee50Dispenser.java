package com.kb.lld.design.behavioural.chainofresponsblity;

public class Rupee50Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency ccy) {
        if (ccy.getAmount() >= 50) {
            int count = ccy.getAmount() / 50;
            int remaining = ccy.getAmount() % 50;
            System.out.println(count + " Rs 50 notes!!");
            if (remaining != 0)
                this.dispenseChain.dispense(new Currency(remaining));
        } else {
            this.dispenseChain.dispense(ccy);
        }

    }
}
