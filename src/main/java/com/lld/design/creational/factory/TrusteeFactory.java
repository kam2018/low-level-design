package com.lld.design.creational.factory;

public class TrusteeFactory {

    public static Trustee getTrustee(TrusteeAbstractFactory abstractFactory){
        return abstractFactory.getTrustee();
    }
}
