package com.company;

public class Toyota extends Car{
    private String kuzov;

    public String getKuzov() {
        return kuzov;
    }

    public Toyota(double volume, int year, Color color, Factory factory,String kuzov) {
        super(volume, year, color, factory);
        this.kuzov=kuzov;
    }
    public Toyota(double volume, int year, Color color,String kuzov) {
        super(volume, year, color);
        this.kuzov=kuzov;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nKuzov: "+kuzov;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo();
    }
    public void startEngine(Toyota x){
        System.out.println("Toyota's engine started.");
    }
    public final void startEngine(Car x){
        System.out.println("Car's engine started.");
    }
    /*
    public String makeSignal(){
        return "RRRRRRR";
    }*/
}
