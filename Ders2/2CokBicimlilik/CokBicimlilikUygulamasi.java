
/*
* Bir modülün duruma göre farklı biçimlerde davranabilmesi özelliğidir.
* Kalıtımla yakından ilgilidir. Türetilmiş sınıf aynı zamanda temel sınıf gibi ele alınabilir.
* Yöntemlerin aşırı yüklenmesi de çok biçimlilik (statik) örneğidir.
*
* */
package cc.ders2.cokbicimlilik;

/* Bir önceki uygulamada geliştirilen sınıfları kullanmak isteseydik
aşağıdaki gibi modülümüze dahil etmemiz gerekirdi.

import cc.ders2.kalitim.Daire;
import cc.ders2.kalitim.Dikdortgen;
import cc.ders2.kalitim.EskenarUcgen;
import cc.ders2.kalitim.Sekil;
ya da 

import cc.ders2.kalitim.*;
*/

public class CokBicimlilikUygulamasi {

    public static void main(String[] s) {

        Sekil [] sekiller=new Sekil[3];



        Daire daire1= new Daire(20,20,"mavi",2);
        Daire daire2= new Daire(20,20,"mavi",1);
        Dikdortgen dikdortgen1= new Dikdortgen(70,55,"sarı",3,6);

        //Cok bicimlilik sayesinde farklı tipte veri toplulukları oluşturuluyor.
        sekiller[0]=daire1;
        sekiller[1]=daire2;
        sekiller[2]=dikdortgen1;

        // Tek tek kod yazmak yerine toplu işlem yapılabiliyor.
        for (int i = 0; i < 3; i++) {
            System.out.println(sekiller[i].alanHesapla()); // Sekil sınıfında alanHesapla() fonksiyonu mutlaka bulunmalı (abstract ya da gerçeklenmiş olarak).
        }

        System.out.println("*********");

        //Farklı modüller için aynı istemci kod kullanılabilir.
        sekilYazdir(daire1);
        sekilYazdir(dikdortgen1);

        sekilYazdir2(daire1);
        sekilYazdir2(dikdortgen1);

        //Yazılımlara yeni özellikler daha kolay eklenebilir
        Sekil ucgen1= new EskenarUcgen(10,5,"yeşil",10);
        sekilYazdir(ucgen1);

    }

    // cok bicimlilik olmasaydı yeni eklenecek her şekil için istemcinin (sekilYazdir2())  değiştirilmesi gerekecekti.
    public static void sekilYazdir2(Sekil genelSekil){

        if (genelSekil instanceof Daire){
            Daire daire = (Daire)genelSekil;
            System.out.println(daire);
            System.out.println("Alanı(cok bicimlilik olmasaydı)="+daire.alanHesapla());
        }
        else if (genelSekil instanceof Dikdortgen) {
            Dikdortgen dikdortgen = (Dikdortgen) genelSekil;
            System.out.println(dikdortgen);
            System.out.println("Alanı(cok bicimlilik olmasaydı)=" + dikdortgen.alanHesapla());
        }
    }

    // cok bicimlilik sayesinde istemci (sekilYazdir())  içerisinde değişiklik yapmadan farklı şekilleri desteklemesi de sağlanabilir
    public static void sekilYazdir(Sekil genelSekil){
        System.out.println(genelSekil);
        System.out.println("Alanı="+genelSekil.alanHesapla());
    }

}
