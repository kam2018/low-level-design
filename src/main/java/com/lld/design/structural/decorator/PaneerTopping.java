package com.lld.design.structural.decorator;

public class PaneerTopping extends ThinCrustDecorator{
    public PaneerTopping(Pizza thinCrustPizza) {
        super(thinCrustPizza);
    }

    @Override
    public String getDescription() {
        return thinCrustPizza.getDescription() + ", Panner";
    }

    @Override
    public double getCost() {
        return thinCrustPizza.getCost() + 35.00;
    }
}
