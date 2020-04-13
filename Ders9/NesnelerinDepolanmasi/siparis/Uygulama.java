package cc.ders9.nesnelerindepolanmasi.siparis;

import java.util.List;
import java.util.Scanner;

public class Uygulama {

    public static void main(String args[]){

        Scanner giris = new Scanner(System.in);

        System.out.println("Siparis numarasını giriniz= ");
        int siparisNo = giris.nextInt(); giris.nextLine();

        Siparis siparis=new Siparis(siparisNo);

        String cevap=null;
        Urun urun=null;
        double siparisBirimFiyati=0;
        int miktari=0;
        List<Urun> urunlerinListesi;

        do{
            IUrunVeritabaniServisi urunler=new UrunPostgreSQLSurucu();
            urunlerinListesi= urunler.urunListele();
            System.out.println(urunlerinListesi);

            System.out.println("Eklemek istediğiniz ürünün adını giriniz:");
            String urunAdi=giris.nextLine();

            // Liste içerisinden ürün adına göre arama yapıyor ve urun nesnesini döndürüyor
            urun = urunlerinListesi.stream()
                    .filter(urunElementi -> urunAdi.equalsIgnoreCase(urunElementi.getAd()))
                    .findAny()
                    .orElse(null);

            System.out.println("siparis birim fiyatını ve miktarı giriniz");
            siparisBirimFiyati=giris.nextDouble();
            miktari=giris.nextInt(); giris.nextLine();



            siparis.sepeteEkle(urun,miktari,siparisBirimFiyati);

            System.out.println("sepetinizdeki ürünler");
            System.out.println(siparis.getSiparisKalemleri());

            System.out.println("Sepete eklemek istediğiniz ürün var mı (e/h)?");
            cevap=giris.nextLine();

        }while(cevap.equalsIgnoreCase("E"));

        System.out.println("Sipariş bilgileriniz:"+siparis);

        ISiparisVeritabaniServisi siparisVTIslemleri=new SiparisPostgreSQLSurucu();
        siparisVTIslemleri.siparisiKaydet(siparis);
    }
}