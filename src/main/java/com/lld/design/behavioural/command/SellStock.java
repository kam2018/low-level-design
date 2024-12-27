package com.lld.design.behavioural.command;

public class SellStock implements Order{
    private Stock stock;
    private int stockToSell;

    public SellStock(Stock stock, int stockToSell){
        this.stock = stock;
        this.stockToSell = stockToSell;
    }
    @Override
    public void execute() {
        stock.sellStock(stockToSell);
    }
}
