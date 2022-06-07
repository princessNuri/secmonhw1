package com.company;

public class Car {
    private double volume;
    private int year;
    private Color color;
    private Factory factory;

    public Car(double volume, int year, Color color, Factory factory) {
        this.volume = volume;
        this.year = year;
        this.color = color;
        this.factory = factory;
    }
    public Car(double volume, int year, Color color) {
        this.volume = volume;
        this.year = year;
        this.color = color;
    }


    public double getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public Factory getFactory() {
        return factory;
    }

    public String getInfo(){
        return "Volume: "+volume+
                "\nColor: "+color+
                "\nYear: "+year;
    }
    public String getAllInfo(){
        return "Volume: "+volume+
                "\nColor: "+color+
                "\nYear: "+year+
                "\nFactory name: "+factory.getFactoryName()+
                "\nFactory country: "+factory.getCountry();
    }
}
