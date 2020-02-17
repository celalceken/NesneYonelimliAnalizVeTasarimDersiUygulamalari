package ders1.uygulama2;

public class KalitimUygulamasi {

    public static void main(String[] args) {

        Yonetici y = new Yonetici("Ali",2500, "IT");
        y.bilgileriGoster();
        y.zamYap(500);
        y.maasHesapla(20);

        KadroluCalisan kadrolu=new KadroluCalisan("Ayse",2000,"muhasebe");
        kadrolu.bilgileriGoster();
        kadrolu.maasHesapla(20);

    }
}
