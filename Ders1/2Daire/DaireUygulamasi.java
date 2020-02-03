
/**
* DaireUygulamasi.java olarak kaydedilmeli.
*
*/

import java.util.Scanner; // klavyeden veri okumak için gerekli Scanner sınıfı (java.util paketi içerisinde tanımlı) dahil ediliyor
import java.text.DecimalFormat; // Sayıların biçimlenmesi için gerekli DecimalFormat Sınıfı uygulamaya dahil ediliyor

public class DaireUygulamasi
{
         public static void main(String[] s) 
         {
                  
                  Daire daire1= new Daire(20,20,3); //daire1 nesnesi oluşturuluyor (3 parametre bekleyen yapıcısı çalıştırılıyor) 
                  System.out.println(daire1); // daire1.toString() fonksiyonu çağrılıyor
                  System.out.println(daire1.alanHesapla()); // daire1.alanHesapla() fonksiyonu çağrılıyor
                  
                  //nesne oluşturuluyor (3 parametre bekleyen yapıcısı çağrılıyor) ve toString fonksiyonu çağırılarak değerleri ekrana yazdırılıyor
                  System.out.println(new Daire(50, 40, 100));
                  
                  //nesne oluşturuluyor (2 parametre bekleyen yapıcısı çağrılıyor) ve toString fonksiyonu çağırılarak değerleri ekrana yazdırılıyor
                  System.out.println(new Daire(25, 50));
                  
                  // Klavyeden (System.in) veri girişi için Scanner sınıfından nesne oluşturuluyor
                  Scanner input = new Scanner (System.in);

                  System.out.print ("Yarıçapı giriniz ");
                  int yariCap = input.nextInt();  //klavyeden int değer okunuyor
                  
                  /*       Scanner sınıfı Üye yöntemleri
                                
                           public byte nextByte()
                           public short nextShort()
                           public int nextInt()
                           public long nextLong()
                           
                           public float nextFloat()
                           public double nextDouble()
                         
                           public String next() // Boşluğa kadar okur
                           public String nextLine() //satır-enter girilene kadar
                  */
                  Daire daire4= new Daire(20,20,yariCap);
                  System.out.println(daire4);
                  System.out.println(daire4.alanHesapla());
                  //System.out.println(daire4.x); //Hata... nesne üye değişkenlerine dışarıdan doğrudan erişilememeli, uygun set, get fonksiyonları kullanılmalı
                  
                  System.out.println(daire4.getX());
                  
                  // Daire alanının virgülden sonra 4 basamak yazdırılması sağlanıyor
                  DecimalFormat fmt = new DecimalFormat ("0.####");
                  System.out.println(fmt.format(daire4.alanHesapla()));
                     
         } 
}
