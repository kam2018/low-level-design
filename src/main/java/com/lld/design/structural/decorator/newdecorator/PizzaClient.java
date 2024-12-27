package com.lld.design.structural.decorator.newdecorator;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza vegPizza = new PaneerTopings(new VegetableTopings(new ThinCrustPizza()));
        System.out.println(vegPizza.getDescription());
        System.out.println(vegPizza.getCost());

        Pizza nonVegPizza = new ChickenTopings(new VegetableTopings(new CheeseBurstPizza()));
        System.out.println(nonVegPizza.getDescription());
        System.out.println(nonVegPizza.getCost());
    }
}
