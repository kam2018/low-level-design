package com.lld.design.structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String url) {
        System.out.println("Connected to " + url);
    }
}
