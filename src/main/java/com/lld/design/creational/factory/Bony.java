package com.lld.design.creational.factory;

public class Bony implements Trustee{
    private String user;
    private String password;

    public Bony(String user, String password){
        this.user = user;
        this.password = password;
    }
    @Override
    public void login() {
        System.out.println(user + " Login Successfully in Bony");
    }

    @Override
    public boolean searchDeal(String cusip) {
        System.out.println(cusip + " searched for Bony");
        return false;
    }
}
