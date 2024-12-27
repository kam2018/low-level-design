package com.lld.design.structural.decorator;

public class ThinCrustDecorator extends PlainThinCrustPizza{
    public Pizza thinCrustPizza;

    public ThinCrustDecorator(Pizza thinCrustPizza){
        this.thinCrustPizza = thinCrustPizza;
    }
}
