package com.kb.lld.design.creational.factory;

public class App {
    public static void main(String[] args) {
        Trustee bony = TrusteeFactory.getTrustee(new BonyFactory("kam","kam"));
        bony.login();
        bony.searchDeal("jdaskds");
    }
}
