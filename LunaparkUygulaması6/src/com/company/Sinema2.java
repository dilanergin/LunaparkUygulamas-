package com.company;

public class Sinema2 extends Salon implements IGenel{
    @Override
    public void name() {
        System.out.println("2 Nolu salon.Bilgiler:");
    }

    @Override
    public void personel() {
        System.out.println("Sorumlu personel: Dilan Ergin");

    }

    @Override
    public void bakımTarihi() {
        System.out.println();
    }

    @Override
    public void onarım() {
        int masraf=1500;
        System.out.println("Onarım Ücreti: "+masraf+" Tl");

    }

    @Override
    public void ucret(int kisi) {
        super.ucret(kisi);
    }
}
