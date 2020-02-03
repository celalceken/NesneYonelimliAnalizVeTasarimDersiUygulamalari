
/**
* DaireUygulamasi.java olarak kaydedilmeli.
*
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class DaireUygulamasi
{
         public static void main(String[] s) 
         {
                  System.out.println(new Daire(50, 40, 100));
                  System.out.println(new Daire(25, 50, 5));
                  
                  Daire daire3= new Daire(20,20,3);
                  System.out.println(daire3);
                  System.out.println(daire3.alanHesapla());
                  
                  Scanner scan = new Scanner (System.in);

                  System.out.print ("Yarıçapı giriniz ");
                  int yariCap = scan.nextInt();
                  
                  Daire daire4= new Daire(20,20,yariCap);
                  System.out.println(daire4);
                  System.out.println(daire4.alanHesapla());
                  //System.out.println(daire4.x); //Hata... nesne üye değişkenlerine dışarıdan doğrudan erişilememeli, uygun set, get fonksiyonları kullanılmalı
                  
                  System.out.println(daire4.getX());
                  
                  DecimalFormat fmt = new DecimalFormat ("0.####");
                  System.out.println(fmt.format(daire4.alanHesapla()));
                     
         } 
}
