package com.company;

public class Main {

    public static void main(String[] args) {
        Factory mercedes= new Factory("Germany","Mercedes");
        Toyota toyota= new Toyota(3.0,2003,Color.BLACK,mercedes,"sedan");
        ToyotaAvensis toyotaAvensis= new ToyotaAvensis(1.8,2000,Color.RED,"universal","AC1234");
        ToyotaAvensis toyotaAvensis1= new ToyotaAvensis(1.9,2006,Color.SILVER,mercedes,"sedan","DF9876");
        toyota.startEngine(toyota);
        System.out.println(toyota.getAllInfo());
        toyotaAvensis.startEngine(toyotaAvensis);
        System.out.println(toyotaAvensis1.getAllInfo());;
        toyotaAvensis1.startEngine(toyotaAvensis1);
        System.out.println("Toyota object A\n"+toyota.getInfo()+
                "\n Toyota object B\n"+toyotaAvensis.getInfo()+
                "\n Toyota object C\n"+toyotaAvensis1.getInfo());

    }
}
