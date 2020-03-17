package ders4.uygulama1;

import java.io.IOException;
import java.util.Scanner;

public class Uygulama {

    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Siparis adınızı giriniz= ");
        String urunAd = input.nextLine();

        System.out.print("Siparis birim fiyatı giriniz= ");
        Integer birimFiyat = input.nextInt();

        System.out.print("Siparis numaranızı giriniz= ");
        Integer siparisNo = input.nextInt();

        System.out.print("Siparis tarihinizi giriniz= ");
        String siparisTarihi = input2.nextLine();

        System.out.print("Sipariş miktarını giriniz= ");
        Integer miktar = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        System.out.print("Siparis adınızı giriniz= ");
        String urunAd1 = input3.nextLine();

        System.out.print("Siparis birim fiyatı giriniz= ");
        Integer birimFiyat1 = input3.nextInt();

        System.out.print("Siparis numaranızı giriniz= ");
        Integer siparisNo1 = input3.nextInt();

        System.out.print("Siparis tarihinizi giriniz= ");
        String siparisTarihi1 = input4.nextLine();

        System.out.print("Sipariş miktarını giriniz= ");
        Integer miktar1 = input4.nextInt();

        Urun urun = new Urun(urunAd, birimFiyat);
        Siparis siparis = new Siparis(siparisNo, siparisTarihi);

        Urun urun1 = new Urun(urunAd1, birimFiyat1);
        Siparis siparis1 = new Siparis(siparisNo1, siparisTarihi1);

        siparis.sepeteEkle(urun,siparis,miktar);
        siparis.sepeteEkle(urun1,siparis1,miktar1);
        siparis.ekranaBas();


    }
}