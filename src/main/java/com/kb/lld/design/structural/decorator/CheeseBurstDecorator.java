package com.kb.lld.design.structural.decorator;

public class CheeseBurstDecorator extends PlainCheeseBurstPizza{
    private Pizza cheeseBurstPizza;

    public CheeseBurstDecorator(Pizza cheeseBurstPizza){
        this.cheeseBurstPizza = cheeseBurstPizza;
    }

/*    @Override
    public String getDescription() {
        return cheeseBurstPizza.getDescription();
    }

    @Override
    public double getCost() {
        return cheeseBurstPizza.getCost();
    }*/
}
