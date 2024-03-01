package cc.ders7.lab;

import cc.ders5.Adres;
import cc.ders5.Musteri;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args){

        Scanner giris = new Scanner(System.in);


        System.out.println("**********Müşteri Bilgilerini Giriniz*********");

        String adi;
        String soyadi;
        String telefonNo;
        String adresSatiri;
        String il;
        Adres evAdresi;
        Adres isAdresi;


        System.out.println("Müşteri adını soyadını telefon numarasını giriniz:");
        adi=giris.nextLine();
        soyadi=giris.nextLine();
        telefonNo=giris.nextLine();

        System.out.println("Ev adresinin, adres ve il bilgilerini giriniz:");
        adresSatiri=giris.nextLine();
        il=giris.nextLine();
        evAdresi=new Adres(adresSatiri,il);

        System.out.println("İş adresinin, adres ve il bilgilerini giriniz:");
        adresSatiri=giris.nextLine();
        il=giris.nextLine();
        isAdresi=new Adres(adresSatiri,il);

        Musteri musteri=new Musteri(adi,soyadi,evAdresi,telefonNo,isAdresi);

        System.out.println("**********Sipariş Bilgilerini Giriniz*********");

        System.out.println("Siparis numarasını giriniz= ");
        int siparisNo = giris.nextInt(); giris.nextLine();

        MusteriliSiparis siparis=new MusteriliSiparis(siparisNo, musteri);

        String cevap;
        String urunAdi;
        double siparisBirimFiyati;
        int miktari;

        do{
            System.out.println("Ürün adını giriniz:");
            urunAdi=giris.nextLine();

            System.out.println("siparis birim fiyatını ve miktarı giriniz");
            siparisBirimFiyati=giris.nextDouble();
            miktari=giris.nextInt(); giris.nextLine();

            siparis.sepeteEkle(urunAdi,miktari,siparisBirimFiyati);

            System.out.println("sepetinizdeki ürünler");
            System.out.println(siparis.getSiparisKalemleri());

            System.out.println("Sepete eklemek istediğiniz ürün var mı (e/h)?");
            cevap=giris.nextLine();

        }while(cevap.equalsIgnoreCase("E"));

        System.out.println("Sipariş bilgileriniz:"+siparis);
        System.out.println(siparis.siparisGoruntule());
    }
}