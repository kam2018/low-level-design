package com.kb.lld.design.behavioural.chainofresponsblity;

public class Rupee100Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency ccy) {
        if (ccy.getAmount() >= 100) {
            int count = ccy.getAmount() / 100;
            int remaining = ccy.getAmount() % 100;
            System.out.println(count + " Rs 100 notes!!");
            if (remaining != 0)
                this.dispenseChain.dispense(new Currency(remaining));
        } else {
            this.dispenseChain.dispense(ccy);
        }
    }
}
