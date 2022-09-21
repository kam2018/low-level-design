package com.kb.lld.design.creational.factory;

public class City implements Trustee {
    private String user;
    private String password;

    public City(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public void login() {
        System.out.println(user + " Login Successfully in City");
    }

    @Override
    public boolean searchDeal(String cusip) {
        System.out.println(cusip + " searched for City");
        return false;
    }
}
