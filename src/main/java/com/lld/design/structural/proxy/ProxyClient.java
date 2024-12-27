package com.lld.design.structural.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("www.xyz.com");
        internet.connectTo("www.xyx.com");
    }
}
