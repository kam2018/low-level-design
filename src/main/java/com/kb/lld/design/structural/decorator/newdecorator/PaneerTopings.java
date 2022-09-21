package com.kb.lld.design.structural.decorator.newdecorator;

public class PaneerTopings extends PizzaToppingsDecorator{
    public PaneerTopings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Paneer";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.00;
    }
}
