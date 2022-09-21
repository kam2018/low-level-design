package com.kb.lld.design.behavioural.command;

public class App {
    public static void main(String[] args) {
        Stock stock = new Stock("PTC India", 100);
        Broker broker = new Broker();
        broker.getOrder(new BuyStock(stock, 12));
        broker.getOrder(new SellStock(stock, 7));
        broker.getOrder(new BuyStock(stock, 12));
        broker.getOrder(new SellStock(stock, 22));

        broker.executeOrder();
        System.out.println(stock.toString());
    }
}
