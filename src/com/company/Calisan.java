package com.company;

public abstract class Calisan {
    private String name;
    private String surname;
    private String unvan;

    public Calisan(String name, String surname, String unvan) {
        this.name = name;
        this.surname = surname;
        this.unvan = unvan;

    }

    public String getName() {
        return this.name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUnvan() {
        return this.unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public abstract void calis();
}
