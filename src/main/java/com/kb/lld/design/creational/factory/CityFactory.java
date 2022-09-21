package com.kb.lld.design.creational.factory;

public class CityFactory implements TrusteeAbstractFactory {
    private String user;
    private String password;

    public CityFactory(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public Trustee getTrustee() {
        return new City(user, password);
    }
}
