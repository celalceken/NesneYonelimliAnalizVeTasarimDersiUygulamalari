package ders1.uygulama1;

public class KalitimUygulamasi {

    public static void main(String[] args) {

        Yonetici yonetici =new Yonetici();
        yonetici.setAd("ayse");
        yonetici.setSoyad("ceylan");
        yonetici.setYasi(45);
        yonetici.EkFatura=9000;
        yonetici.setCalismaGunuHesapla(30);
        System.out.println(yonetici.getAd());
        System.out.println(yonetici.getSoyad());
        System.out.println(yonetici.getYasi());
        System.out.println(yonetici.EkFatura);
        System.out.println(yonetici.getCalismaGunuHesapla());

    }

}
