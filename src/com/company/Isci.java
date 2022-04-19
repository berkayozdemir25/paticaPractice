package com.company;

public class Isci extends Calisan {
    private double maas;
    private int boy;

    public Isci(String name, String surname, String unvan, double maas, int boy) {
        super(name, surname, unvan);
        this.maas = maas;
        this.boy = boy;
    }

    public double getMaas() {
        return this.maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getBoy() {
        return this.boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override

    public void calis() {
        System.out.println(this.getName() + " çalışmaya başladı.");
    }
}
