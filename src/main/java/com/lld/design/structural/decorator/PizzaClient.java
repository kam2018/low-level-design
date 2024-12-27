package com.lld.design.structural.decorator;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza cheeseBurst = new PaneerTopping(new PlainCheeseBurstPizza());
        System.out.println(cheeseBurst.getDescription());
        System.out.println(cheeseBurst.getCost());

        Pizza thinCrust = new PaneerTopping(new PlainThinCrustPizza());
        System.out.println(thinCrust.getDescription());
        System.out.println(thinCrust.getCost());
    }
}
