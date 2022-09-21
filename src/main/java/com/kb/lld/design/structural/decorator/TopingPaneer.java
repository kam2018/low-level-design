package com.kb.lld.design.structural.decorator;

public class TopingPaneer extends ThinCrustDecorator{
    public TopingPaneer(Pizza thinCrustPizza) {
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
