package com.kb.lld.design.structural.decorator.newdecorator;

public class VegetableTopings extends PizzaToppingsDecorator{
    public VegetableTopings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Vegetables";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.00;
    }
}
