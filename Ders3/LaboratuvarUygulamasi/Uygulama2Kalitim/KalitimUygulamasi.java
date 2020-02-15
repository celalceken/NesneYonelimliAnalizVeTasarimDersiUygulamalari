package ders1.uygulama2;

public class KalitimUygulamasi {

    public static void main(String[] args) {

        Yonetici y = new Yonetici("Ali",2500, "IT");
        y.BilgileriGoster();
        y.Zam_Yap(500);
        y.MaasHesapla(20);

        KadroluCalisan kadrolu=new KadroluCalisan("Ayse",2000,"muhasebe");
        kadrolu.BilgileriGoster();
        kadrolu.MaasHesapla(20);

    }
}
