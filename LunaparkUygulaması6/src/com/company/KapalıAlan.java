package com.company;

public abstract class KapalıAlan {
    public void bakımTarihi() {
        System.out.println("Oyunların rutin bakım tarihi: 3 Eylül");
    }
    public void onarım(){
        int ucret=1000;
        System.out.println("Oyunların rutin onarım ücreti: "+ucret+" Tl.");
    }


}
