package cc.ders9.nesnelerindepolanmasi.crudinterface;

import java.util.List;
import java.util.Scanner;

public class Uygulama {

    public static void main(String args[]){

        Scanner giris = new Scanner(System.in);

        // Geçici değişkenler
        String cevap=null;
        Urun urun=null;
        int urunNo;
        String urunAdi;
        double birimFiyati=0;
        int stokMiktari=0;

        //*****ürüne ait veritabanı işlemleri için kullanılacak nesne**************************

        IUrunRepository urunRepository=new UrunRepositoryPostgreSQL();
        //IUrunRepository urunRepository=new UrunRepositoryMySQL();
        //IUrunRepository urunRepository=new UrunRepositoryMongoDB();
        //IUrunRepository urunRepository=new UrunRepositoryCassandra();.....


        ///*
        System.out.println("*********************Arama**************************");

        System.out.println("aradığınız ürünün numarasını giriniz");
        urunNo=giris.nextInt();giris.nextLine();
        urun= urunRepository.ara(urunNo);
        if(urun!=null)
            System.out.println("Aradığınız ürün:"+urun);
        else
            System.out.println("aradığınız ürün bulunamadı");



        System.out.println("******************tüm ürünleri getir********************");

        List<Urun> urunlerinListesi;

        urunlerinListesi= urunRepository.tumUrunler();
        System.out.println(urunlerinListesi);

        System.out.println("Eklemek istediğiniz ürünün adını giriniz:");
        String urununAdi=giris.nextLine();

        // Liste içerisinden ürün adına göre arama yapıyor ve urun nesnesini döndürüyor
        urun = urunlerinListesi.stream()
                .filter(urunElementi -> urununAdi.equalsIgnoreCase(urunElementi.getAdi()))
                .findAny()
                .orElse(null);
        if(urun!=null)
            System.out.println("Eklemek istediğiniz ürün:"+urun);

        System.out.println("******************Kaydet********************");

        //System.out.println("ürünün numarasını giriniz");
        //urunNo=giris.nextInt();giris.nextLine();
        System.out.println("Ürün adını giriniz:");
        urunAdi=giris.nextLine();

        System.out.println("birim fiyatını ve stok miktarı giriniz");
        birimFiyati=giris.nextDouble();
        stokMiktari=giris.nextInt(); giris.nextLine();
        //urun=new Urun(urunNo,urunAdi,birimFiyati,stokMiktari);
        urun=new Urun(urunAdi,birimFiyati,stokMiktari); // urunNo değeri vt içerisinde sayıcıyla atanıyor (serial, auto increment)

        urunRepository.kaydet(urun);

//*/

        System.out.println("******************Silme**************************");

        urunlerinListesi= urunRepository.tumUrunler();
        System.out.println(urunlerinListesi);

        System.out.println("Silmek istediğiniz ürünün numarasını giriniz:");
        urunNo=giris.nextInt(); giris.nextLine();
        urunRepository.sil(urunNo);


    }
}