package com.lld.design.structural.decorator.newdecorator;

public class CheeseBurstPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Cheese Burst Pizza";
    }

    @Override
    public double getCost() {
        return 185.00;
    }
}
