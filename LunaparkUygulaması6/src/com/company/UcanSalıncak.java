package com.company;

public class UcanSalıncak extends Oyuncak implements IGenel{
    @Override
    public void name() {
        System.out.println("Oyuncak Adı: Uçan Salıncak");
    }

    @Override
    public void personel() {
        System.out.println("Oyuncaktan sorumlu kişi: Dilan Ergin");
    }


    @Override
    public void bakımTarihi() {
        super.bakımTarihi();
    }

    @Override
    public void onarım() {
        super.onarım();
    }

    @Override
    public void ucret(int secim, int jetonSayı) {
        super.ucret(secim, jetonSayı);
    }


}
