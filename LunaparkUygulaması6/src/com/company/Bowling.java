package com.company;
import java.util.Scanner;
public class Bowling extends KapalıAlan implements IGenel{

    @Override
    public void name() {
        System.out.println("Oyuncak Adı: Bowling");
    }

    @Override
    public void personel() {
        System.out.println("Sorumlu personel: Dilan Ergin");
    }



    @Override
    public void bakımTarihi() {
        super.bakımTarihi();
    }

    @Override
    public void onarım() {
        super.onarım();
    }
    public void ucret(){
        int kisi,total,ucret=20;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç kişilik bowling oyunu açmak istiyorsunuz?: ");
        kisi= scan.nextInt();
        if(kisi<2){
            System.out.println("Bowling en az iki kişi ile oynanır.");
        }else{
            total=kisi*ucret;
            System.out.println("Ödenecek tutar: "+total);
        }
    }

}
