package com.company;

public class Factory {
    private String country;
    private String factoryName;

    public Factory(String country, String factoryName) {
        this.country = country;
        this.factoryName = factoryName;
    }

    public String getCountry() {
        return country;
    }

    public String getFactoryName() {
        return factoryName;
    }
}
