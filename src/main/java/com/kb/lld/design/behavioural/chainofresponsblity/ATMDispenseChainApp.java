package com.kb.lld.design.behavioural.chainofresponsblity;

public class ATMDispenseChainApp {
    public static void main(String[] args) {
        DispenseChain dispenseChain = new Rupee500Dispenser();
        DispenseChain dispenseChain100 = new Rupee100Dispenser();
        DispenseChain dispenseChain50 = new Rupee50Dispenser();
        dispenseChain.setNextChain(dispenseChain100);
        dispenseChain100.setNextChain(dispenseChain50);
        dispenseChain.dispense(new Currency(5450));
    }
}
