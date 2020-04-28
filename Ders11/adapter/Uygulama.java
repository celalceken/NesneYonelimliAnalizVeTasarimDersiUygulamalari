package cc.ders12.adapter;

import cc.ders6.siparis.Siparis;

import java.util.Scanner;

public class Uygulama {

    public static void main(String args[]){

        Scanner giris = new Scanner(System.in);


        System.out.println("**********Sipariş Bilgilerini Giriniz*********");

        System.out.println("Siparis numarasını giriniz= ");
        int siparisNo = giris.nextInt(); giris.nextLine();

        Siparis siparis=new Siparis(siparisNo);

        String cevap=null;
        String urunAdi=null;
        double siparisBirimFiyati=0;
        int miktari=0;

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

        //System.out.println("Sipariş bilgileriniz:"+siparis);

        System.out.println("*****************Fatura İşlemleri**************************");

        Fatura fatura=new Fatura(siparis);
        FaturaServisi faturaServisi=new FaturaServisi();

        System.out.println("Fatura1 toplamı:"+fatura.toplamTutariHesapla());
        System.out.println("Fatura oluşturuluyor:"+fatura.faturaYazdir(faturaServisi));
        //System.out.println("Fatura oluşturuluyor:"+fatura.faturaYazdir(faturaServisi,(byte)1));

        IstemciModul istemciModul=new IstemciModul();
        System.out.println("Adapter:"+ istemciModul.istemciYontem(fatura));


    }
}