package com.lld.design.structural.decorator.newdecorator;

public abstract class PizzaToppingsDecorator implements Pizza {
    private Pizza pizza;
    public PizzaToppingsDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
