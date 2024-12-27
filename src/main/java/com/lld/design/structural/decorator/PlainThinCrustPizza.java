package com.lld.design.structural.decorator;

public class PlainThinCrustPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain Thin Crust Pizza";
    }

    @Override
    public double getCost() {
        return 150.00;
    }
}
