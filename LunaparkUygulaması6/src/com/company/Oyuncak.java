package com.company;

import java.util.Scanner;

public abstract class Oyuncak {

    public void bakımTarihi() {
        System.out.println("Oyuncakların rutin bakım tarihi: 12 Ocak");
    }
    public void onarım(){
        int ucret=1300;
        System.out.println("Oyuncakların rutin onarım ücreti: "+ucret+" Tl.");
    }

    public void ucret(int secim, int jetonSayı) {
         int total, jeton = 2;
        if (secim == 1 && jetonSayı == 1) {
            System.out.println("Uçan salıncak için en az iki jeton alınmalıdır.");
        } else if (secim == 1 && jetonSayı >= 2) {
            total = jetonSayı * jeton;
            System.out.println("Ödenecek tutar: " + total + " Tl");

        } else if (secim == 2 && jetonSayı > 0) {
            total = jetonSayı * jeton;
            System.out.println("Ödenecek tutar: " + total + " Tl");

        }



}}
