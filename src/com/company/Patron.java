package com.company;

public class Patron extends Calisan{
    private double maas;
    public Patron(String name,String surname,String unvan,double maas){
        super(name,surname,unvan);
        this.maas=maas;
    }
    @Override
    public void calis(){
        System.out.println(this.getName()+" "+this.getSurname()+" iş yerine giriş yaptı.");
    }
    public double getMaas(){
        return this.maas;
    }
    public void setMaas(double maas){
        this.maas=maas;
    }
}
