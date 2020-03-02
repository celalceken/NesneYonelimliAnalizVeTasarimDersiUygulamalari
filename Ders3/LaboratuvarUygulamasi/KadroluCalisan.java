package ders1.uygulama2;

public class KadroluCalisan extends Kisi  {


    public KadroluCalisan(String isim, int maas, String bolum) {

        super(isim, maas, bolum);

    }

    public void maasHesapla(int sayi) {

        int toplam=sayi*100;
        System.out.println(toplam);


    }
}
