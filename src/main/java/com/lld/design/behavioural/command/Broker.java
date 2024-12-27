package com.lld.design.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList;

    public Broker(){
        this.orderList = new ArrayList<>();
    }

    public void getOrder(Order order){
        orderList.add(order);
    }

    public void executeOrder(){
        orderList.forEach(o -> {
            o.execute();
        });
    }
}
