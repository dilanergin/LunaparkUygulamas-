package com.company;
import java.util.Scanner;
public class Bilardo extends KapalıAlan implements IGenel{
    @Override
    public void name() {
        System.out.println("Oyun Adı: Bilardo");
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


    public void ucret() {
        int saat,ucret=5,total;
        Scanner scan= new Scanner(System.in);
        System.out.print("Kaç saatlik oyun açmak istersiniz?: ");
        saat= scan.nextInt();
        total=ucret*saat;
        System.out.println("Ödenecek tutar: "+total);


    }

}
