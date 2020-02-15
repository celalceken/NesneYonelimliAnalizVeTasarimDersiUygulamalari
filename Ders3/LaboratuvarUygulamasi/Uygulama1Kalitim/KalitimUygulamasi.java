package ders1.uygulama1;

public class KalitimUygulamasi {

    public static void main(String[] args) {

        Yonetici yonetici =new Yonetici();
        yonetici.adSoyad="Ayse Ceylan";
        yonetici.yasi=45;
        yonetici.EkFatura=9000;
        System.out.println(yonetici.adSoyad);
        System.out.println(yonetici.yasi);
        System.out.println(yonetici.EkFatura);
        System.out.println(yonetici.calismaGunuHesapla(30));
    }

}
