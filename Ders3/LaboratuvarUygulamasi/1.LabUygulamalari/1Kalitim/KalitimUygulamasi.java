package ders1.uygulama1;

public class KalitimUygulamasi {

    public static void main(String[] args) {

        Mudur mudur=new Mudur();
        mudur.adSoyad="Ayse Ceylan";
        mudur.yasi=45;
        mudur.EkFatura=9000;
        System.out.println(mudur.adSoyad);
        System.out.println(mudur.yasi);
        System.out.println(mudur.EkFatura);
        System.out.println(mudur.calismaGunuHesapla(30));
    }

}
