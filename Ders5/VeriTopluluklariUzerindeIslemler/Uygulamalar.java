package cc.ders4.listarray;

import java.util.*;

public class Uygulamalar {
    public static void main(String[] Args) {


        //Statik dizi kullanımı
        Kitap[] kitaplarStatikDizi=new Kitap[2];
        kitaplarStatikDizi[0]=new Kitap("NYP",110.00);
        kitaplarStatikDizi[1]=new Kitap("Yapay Zeka",125.00);

        for (int i=0; i<kitaplarStatikDizi.length;i++)
            System.out.println(kitaplarStatikDizi[i].getAdi());
        //for each ile erişim
        for(Kitap kitap:kitaplarStatikDizi)
            System.out.println(kitap.getAdi());


        /*List tipli veri toplulukları

        List dinamikDizi = new ArrayList();
        List vektor = new Vector();
        List bagliListe = new LinkedList();

        "Generic" ler sayesinde "Type-safe" olarak da tanımlanabilir.
        List<Double> l1 = new ArrayList<Double>(); ilkel tipler yerine ilgili sınıflar kullanılmalı
        */



        //ArrayList  kullanımı

        List<Kitap> kitaplarAL = new ArrayList<Kitap>();
        kitaplarAL.add(new Kitap("AL Veritabanı Yönetim Sistemleri",100.00));
        kitaplarAL.add(new Kitap("AL Nesne Yönelimli Programlama",125.00));
        kitaplarAL.add(2,new Kitap("AL Bilgisayar Ağları",150.00));

        System.out.println(kitaplarAL);

        for (int i=0; i<kitaplarAL.size();i++)
            System.out.println(kitaplarAL.get(i).getAdi());

        //for each ile erişim
        for(Kitap kitap:kitaplarAL)
            System.out.println(kitap.getAdi());

        //LinkedList  kullanımı

        List<Kitap> kitaplarLL = new LinkedList<Kitap>();
        kitaplarLL.add(new Kitap("Veritabanı",100.00));
        kitaplarLL.add(new Kitap("Nesne Yönelimli ",125.00));
        kitaplarLL.add(2,new Kitap("LL Bilgisayar Ağları",150.00));

        System.out.println(kitaplarLL);

        for (int i=0; i<kitaplarLL.size();i++)
            System.out.println(kitaplarLL.get(i).getAdi());

        //for each ile erişim
        for(Kitap kitap:kitaplarLL)
            System.out.println(kitap.getAdi());

        //Vector  kullanımı

        List<Kitap> kitaplarV = new Vector<Kitap>();
        kitaplarV.add(new Kitap("Vektör Veritabanı ",100.00));
        kitaplarV.add(new Kitap("Vektör Nesne Yönelimli ",125.00));
        kitaplarV.add(2,new Kitap("V Bilgisayar Ağları",150.00));

        System.out.println(kitaplarV);

        for (int i=0; i<kitaplarV.size();i++)
            System.out.println(kitaplarV.get(i).getAdi());

        //for each ile erişim
        for(Kitap kitap:kitaplarV)
            System.out.println(kitap.getAdi());

    }


}
