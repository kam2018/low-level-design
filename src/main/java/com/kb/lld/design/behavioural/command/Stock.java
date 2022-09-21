package com.kb.lld.design.behavioural.command;

public class Stock {
    private String stockName;
    private int stockCount;

    public Stock(String stockName, int stockCount) {
        this.stockName = stockName;
        this.stockCount = stockCount;
    }

    public void buyStock(int count) {
        this.stockCount = stockCount - count;
        System.out.println(count + " stock sold and remaining is " + stockCount);
    }

    public void sellStock(int count) {
        this.stockCount = stockCount + count;
        System.out.println(count + " stock received and remaining is " + stockCount);
    }
}
