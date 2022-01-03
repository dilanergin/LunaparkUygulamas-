package com.company;

public class Sinema1 extends Salon implements IGenel{
    public Sinema1() {
        super();
    }

    @Override
    public void name() {
        System.out.println("1 nolu salon.Bilgiler:");

    }

    @Override
    public void personel() {
        System.out.println("Sorumlu personel: Dilan Ergin");

    }

    @Override
    public void bakımTarihi() {

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
