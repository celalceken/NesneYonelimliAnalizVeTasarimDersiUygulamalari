package ders2.uygulama1;

public class YazdirmaUygulamasi {

    public static void main(String args[]){

        YaziciArayuzu gercekYazici= new EpsonYazici();

        // Dependency injection: nesne dışarıda oluşturulup istemci koda gönderiliyor
        YaziciSurucusu yaziciSurucusu = new YaziciSurucusu(gercekYazici);

        yaziciSurucusu.ac();
        yaziciSurucusu.yazdir("Merhaba Dünya");
        yaziciSurucusu.kapat();

    }

}