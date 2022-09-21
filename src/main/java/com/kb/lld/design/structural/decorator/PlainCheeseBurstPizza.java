package com.kb.lld.design.structural.decorator;

public class PlainCheeseBurstPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain Cheese Burst Pizza";
    }

    @Override
    public double getCost() {
        return 250.00;
    }
}
