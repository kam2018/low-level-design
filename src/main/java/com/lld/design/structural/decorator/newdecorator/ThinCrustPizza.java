package com.lld.design.structural.decorator.newdecorator;

public class ThinCrustPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}
