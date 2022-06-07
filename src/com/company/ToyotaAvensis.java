package com.company;

public final class ToyotaAvensis extends Toyota{
    private String number;

    public String getNumber() {
        return number;
    }

    public ToyotaAvensis(double volume, int year, Color color, Factory factory,String kuzov,String number) {
        super(volume, year, color, factory,kuzov);
        this.number=number;
    }
    public ToyotaAvensis(double volume, int year, Color color, String kuzov,String number) {
        super(volume, year, color,kuzov);
        this.number=number;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nNumber: "+number;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo();
    }

    @Override
    public void startEngine(Toyota x) {
        System.out.println("toyota rrr");
    }

}
