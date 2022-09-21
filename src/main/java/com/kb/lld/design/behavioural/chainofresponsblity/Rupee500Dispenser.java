package com.kb.lld.design.behavioural.chainofresponsblity;

public class Rupee500Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency ccy) {
        if (ccy.getAmount() >= 500) {
            int count = ccy.getAmount() / 500;
            int remaining = ccy.getAmount() % 500;
            System.out.println(count + " Rs 500 notes!!");
            if (remaining != 0)
                this.dispenseChain.dispense(new Currency(remaining));
        } else {
            this.dispenseChain.dispense(ccy);
        }
    }
}
