/*
* Benzer varlıklar arasında olmalıdır. “is a” , “is kind of”
* Türetilmiş sınıf (Derived class) Temel Sınıfın (base class)  üyelerini kalıtım yoluyla sahip olur.
* Kod tekrar kullanımı sağlanır
*
*/
package cc.ders2.kalitim;

import java.util.Scanner;

public class KalitimUygulamasi {

    public static void main(String[] s) {

        System.out.println("Merhaba dünya");

        Scanner input = new Scanner (System.in);

        System.out.print ("Yarıçapı giriniz ");
        float yariCap = input.nextFloat();  //klavyeden int değer okunuyor

        Daire daire1= new Daire(20,20,"mavi",yariCap);
        System.out.println(daire1);
        daire1.konumDegistir(30,50);
        System.out.println(daire1);
        System.out.println(daire1.getKonumX());

    }
}
