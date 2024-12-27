package com.lld.design.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private final Internet internet = new RealInternet();
    private static final List<String> urlList;

    static {
        urlList = new ArrayList<>();
        urlList.add("www.xyx.com");
    }

    @Override
    public void connectTo(String url) {
        if (urlList.contains(url)) {
            System.out.println("Connection blocked by Proxy!! for " + url);
        } else {
            internet.connectTo(url);
        }
    }
}
