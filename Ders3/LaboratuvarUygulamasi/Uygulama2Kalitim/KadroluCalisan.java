package ders1.uygulama2;

public class KadroluCalisan extends Kisi  {


    public KadroluCalisan(String isim, int maas, String departman) {

        super(isim, maas, departman);

    }

    public void maasHesapla(int sayi) {

        int toplam=sayi*100;
        System.out.println(toplam);


    }
}
