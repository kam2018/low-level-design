package com.kb.lld.design.structural.decorator;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza cheeseBurst = new TopingPaneer(new PlainCheeseBurstPizza());
        System.out.println(cheeseBurst.getDescription());
        System.out.println(cheeseBurst.getCost());

        Pizza thinCrust = new TopingPaneer(new PlainThinCrustPizza());
        System.out.println(thinCrust.getDescription());
        System.out.println(thinCrust.getCost());
    }
}
