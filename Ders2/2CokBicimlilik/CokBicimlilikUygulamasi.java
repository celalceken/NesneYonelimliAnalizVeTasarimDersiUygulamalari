
/*
* Bir modülün duruma göre farklı biçimlerde davranabilmesi özelliğidir.
* Kalıtımla yakından ilgilidir. temel sınıfın kullanıldığı yerlerde alt sınıflarında kullanılabilmesini ifade eder.
* Yöntemlerin aşırı yüklenmesi de çok biçimlilik örneğidir.
*
* */
package cc.ders2.cokbicimlilik;

/*import cc.ders2.cokbicimlilik.Daire;
import cc.ders2.cokbicimlilik.Dikdortgen;
import cc.ders2.cokbicimlilik.EskenarUcgen;
import cc.ders2.cokbicimlilik.Sekil;*/

public class CokBicimlilikUygulamasi {

    public static void main(String[] s) {

        Sekil [] sekiller=new Sekil[3];



        Daire daire1= new Daire(20,20,"mavi",2);
        Daire daire2= new Daire(20,20,"mavi",1);
        Dikdortgen dikdortgen1= new Dikdortgen(70,55,"sarı",3,6);

        //Farklı tipte veri toplulukları oluşturuşuyor.
        sekiller[0]=daire1;
        sekiller[1]=daire2;
        sekiller[2]=dikdortgen1;

        // Tek tek kod yazmak yerine toplu işlem yapılabiliyor.
        for (int i = 0; i < 3; i++) {
            System.out.println(sekiller[i].alanHesapla()); // Sekil sınıfında alanHesapla() fonksiyonu mutlaka bulunmalı (abstract ya da gerçeklenmiş olarak).
        }

        System.out.println("*********");

        sekilYazdir(daire1);
        sekilYazdir(dikdortgen1);

        sekilYazdir2(daire1);
        sekilYazdir2(dikdortgen1);


        Sekil ucgen1= new EskenarUcgen(10,5,"yeşil",10);
        sekilYazdir(ucgen1);




    }

    public static void sekilYazdir2(Sekil genelSekil){
        // cok bicimlilik sayesinde sekilYazdir() yontemi icerisinde değişiklik yapmadan farklı şekilleri desteklemesi de sağlanabilir

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

    public static void sekilYazdir(Sekil genelSekil){
        // cok bicimlilik sayesinde sekilYazdir() yontemi icerisinde değişiklik yapmadan farklı şekilleri desteklemesi de sağlanabilir
        System.out.println(genelSekil);
        System.out.println("Alanı="+genelSekil.alanHesapla());
    }

}
