package com.company;
import java.util.Scanner;

public abstract class Salon {
    public void bakımTarihi() {
        System.out.println("Oyuncakların rutin bakım tarihi: 26 Aralık.");
    }
    public void onarım(){
        int ucret=700;
        System.out.println("Salonların rutin onarım ücreti: "+ucret+" Tl.");
    }
    public void ucret(int kisi){
        int bilet=15,bilet2=20;
        String gun;
        System.out.println("Kisi sayısı: "+kisi);
        Scanner scan=new Scanner(System.in);
        System.out.print("Gün yazınız:");
       gun=scan.nextLine();
        if(gun.equals("SALI")){

            System.out.println("İndirimli tarife! Ücret: "+(bilet*kisi));

        }else{
            System.out.println("Ücret:"+(kisi*bilet2)+ "Tl");
        }



    }
}
