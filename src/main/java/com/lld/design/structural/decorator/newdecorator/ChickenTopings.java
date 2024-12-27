package com.lld.design.structural.decorator.newdecorator;

public class ChickenTopings extends PizzaToppingsDecorator{
    public ChickenTopings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chicken";
    }

    @Override
    public double getCost() {
        return super.getCost() + 8.50;
    }
}
