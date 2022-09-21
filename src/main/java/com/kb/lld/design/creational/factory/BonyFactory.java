package com.kb.lld.design.creational.factory;

public class BonyFactory implements TrusteeAbstractFactory{
    private String user;
    private String password;

    public BonyFactory(String user, String password){
        this.user = user;
        this.password = password;
    }
    @Override
    public Trustee getTrustee() {
        return new Bony(user, password);
    }
}
