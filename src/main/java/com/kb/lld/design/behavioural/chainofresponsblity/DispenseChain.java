package com.kb.lld.design.behavioural.chainofresponsblity;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency ccy);
}
