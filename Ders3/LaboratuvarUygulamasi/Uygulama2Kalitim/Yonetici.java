package ders1.uygulama2;

public class Yonetici extends Kisi {



    public Yonetici(String isim, int maas, String departman) {

        super(isim, maas, departman);

    }

    public void zamYap(int zam){

        System.out.println("Çalışanlara " + zam + " TL Zam Yapıldı.");

    }

    public void maasHesapla(int sayi) {

        int total=sayi*150;
        System.out.println(total);


    }


}