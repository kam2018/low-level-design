package com.lld.design.behavioural.command;

public class BuyStock implements Order{
    private Stock stock;
    private int stockToBuy;

    public BuyStock(Stock stock, int stockToBuy){
        this.stock = stock;
        this.stockToBuy = stockToBuy;
    }
    @Override
    public void execute() {
        stock.buyStock(stockToBuy);
    }
}
