package com.company;

public class Main {

    public static void main(String[] args) {
        Calisan i1= new Isci("Berkay","Özdemir","İşçi",3000,175);
        Calisan p1 = new Patron("Mahmut","Özdemir","Başkan",10000);
        Isci i2 = new Isci("Alpay","Özdemir","İşçi",3000,175);

        Calisan[] calisArray={i1,p1,i2};
        calisArray[0].calis();
        calisArray[1].calis();
        System.out.println(calisArray[0].getName()+" "+calisArray[0].getSurname());
        System.out.println(i1.getName());

    }
}
