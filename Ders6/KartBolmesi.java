package cc.ders7.atm;

public class KartBolmesi implements IKartBolmesi {

    private int  hesapNumarasi;


    public int kartAl() {
        System.out.println("kart alınıyor...");
        Araclar.bekle(2000);
        this.hesapNumarasi=2; //Döndürülmesi istenen hesap numarası buraya yazılmalı
        return kartDogrula();
    }

    private int kartDogrula() {
        System.out.println("kart doğrulanıyor...");
        Araclar.bekle();
        return hesapNumarasi;
    }

    public void kartCikart() {
        System.out.println("kart çıkartılıyor...");
        Araclar.bekle();
    }

    public boolean kartAlindimi() {
        System.out.println("kart alındı...");
        Araclar.bekle();
        return true;
    }

    public void kartiYut() {
        System.out.println("kart yutuldu...");
        Araclar.bekle();
    }

}
