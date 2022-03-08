package cc.ders4.veritopluluklari;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Uygulamalar {
    //nesne üyesi olarak da tanımlanabilir
    //private Kitap[] kitaplar=new Kitap[3];

    public static void main(String[] Args) {

        Kitap kitap1=new Kitap("Veritabanı Yönetim Sistemleri ",100.00);
        Kitap kitap2=new Kitap("Nesne Yönelimli Analiz Ve Tasarım ",125.00);
        Kitap kitap3=new Kitap("Ağ Programlama",150.00);

        System.out.println("*************Statik dizi  kullanımı*************");
        /**
        * Statik dizi
        * Derleme yapılırken eleman sayısı belirlenmiş olmalıdır. Çalışma zamanında boyutu değiştirilemez.
        * */
        Kitap[] kitaplarStatikDizisi=new Kitap[3];
        kitaplarStatikDizisi[0]=kitap1;
        kitaplarStatikDizisi[1]=kitap2;
        kitaplarStatikDizisi[2]=new Kitap("Veri Yapıları",120.50);

        // for ile erişim
        for (int i=0; i<kitaplarStatikDizisi.length;i++)
            System.out.println(kitaplarStatikDizisi[i].getAdi());
        //for each ile erişim
        for(Kitap kitap:kitaplarStatikDizisi)
            System.out.println(kitap.getAdi());

        /**
         * List tipli veri toplulukları
         * List arayüzünü gerçekleyen soyut veri tipleridir. Veri yapısı ve veriye erişim sağlayan yöntemleri içerirler.
         *
         * List dinamikDizi = new ArrayList();  (Dinamik dizidir. Boyutu %50 artar )
         * List vektor = new Vector();          (Dinamik dizidir. Boyutu %100 artar. Çok işparçacığı bulunan programlarda güvenli (ACID-I) )
         * List bagliListe = new LinkedList();  (iki yönlü bağlı liste. Queue arayüzünü de gerçeklediği için ek yöntemler de içerir)
         *
         * "Generic" ler sayesinde "Type-safe" olarak da tanımlanabilir.
         * List<Double> l1 = new ArrayList<Double>(); ilkel tipler yerine ilgili sınıflar kullanılmalı
        */

        System.out.println("*************ArrayList  kullanımı*************");

        List<Kitap> kitaplarAL = new ArrayList<Kitap>();
        kitaplarAL.add(kitap1);
        kitaplarAL.add(kitap2);
        kitaplarAL.add(2,new Kitap("AL Bilgisayar Ağları",150.00));

        System.out.println(kitaplarAL);

        for (int i=0; i<kitaplarAL.size();i++)
            System.out.println(kitaplarAL.get(i).getAdi());

        //for each ile erişim
        for(Kitap kitap:kitaplarAL)
            System.out.println(kitap.getAdi());

        System.out.println("*************LinkedList  kullanımı*************");

        List<Kitap> kitaplarLL = new LinkedList<Kitap>();
        kitaplarLL.add(kitap1);
        kitaplarLL.add(kitap2);
        kitaplarLL.add(2,new Kitap("LL Bilgisayar Ağları",150.00));

        System.out.println(kitaplarLL);

        for (int i=0; i<kitaplarLL.size();i++)
            System.out.println(kitaplarLL.get(i).getAdi());

        //for each ile erişim
        for(Kitap kitap:kitaplarLL)
            System.out.println(kitap.getAdi());


        System.out.println("*************Vector  kullanımı*************");
        List<Kitap> kitaplarV = new Vector<Kitap>();
        kitaplarV.add(kitap1);
        kitaplarV.add(kitap2);
        kitaplarV.add(2,kitap3);
        kitaplarV.add(3,new Kitap("Veri Yapıları",160.00));

        System.out.println(kitaplarV);

        //for each ile erişim
        for (int i=0; i<kitaplarV.size();i++)
            System.out.println(kitaplarV.get(i).getAdi());

        //for each ile erişim
        for(Kitap kitap:kitaplarV)
            System.out.println(kitap.getAdi());

        System.out.println("*************Lambda ifadeler-forEach *************");

        kitaplarV.forEach(kitap -> System.out.println(kitap));

        System.out.println("*************Lambda ifadeler-forEach *************");

        kitaplarV.forEach(kitap -> System.out.println(kitap.getAdi()));

        double sum=0;
        for (int i=0; i<kitaplarV.size();i++){
            sum+=kitaplarV.get(i).getBirimFiyati();
        }
        System.out.println("Tüm kitapların birim fiyat toplamı="+sum);

        System.out.println("*************Lambda ifadeler-toplam *************");

        sum= kitaplarV.stream().mapToDouble(item->item.getBirimFiyati()).sum();
        System.out.println("Tüm kitapların birim fiyat toplamı="+sum);

        System.out.println("*************Lambda ifadeler-filtre *************");

        List<Kitap> filtrelenmisKitaplar = kitaplarV
                .stream()
                .filter(item -> item.getAdi().startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(filtrelenmisKitaplar);
    }

}
