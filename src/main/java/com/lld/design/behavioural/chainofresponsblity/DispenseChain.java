package com.lld.design.behavioural.chainofresponsblity;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency ccy);
}
