package cc.ders9.nesnelerindepolanmasi.siparis;

import cc.ders9.nesnelerindepolanmasi.repository.IUrunRepository;
import cc.ders9.nesnelerindepolanmasi.repository.Urun;
import cc.ders9.nesnelerindepolanmasi.repository.UrunRepositoryImplPostgreSQL;
import cc.ders9.nesnelerindepolanmasi.repository.UrunService;

import java.util.List;
import java.util.Scanner;

public class Uygulama {

    private static IUrunRepository urunRepository= new UrunRepositoryImplPostgreSQL();
    private static UrunService urunService= new UrunService(urunRepository);
    private static ISiparisRepository siparisRepository= new SiparisRepositoryImplPostgreSQL();
    private static SiparisService siparisService= new SiparisService(siparisRepository);

    public static void main(String args[]){

        Scanner giris = new Scanner(System.in);

        System.out.println("Siparis numarasını giriniz= ");
        int siparisNo = giris.nextInt(); giris.nextLine();

        Siparis siparis=new Siparis(siparisNo);

        String cevap=null;
        Urun urun=null;
        double siparisBirimFiyati=0;
        int miktari=0;
        List<Urun> tumUrunlerinListesi;

        do{
            tumUrunlerinListesi= urunService.tumUrunler();
            System.out.println(tumUrunlerinListesi);

            System.out.println("Eklemek istediğiniz ürünün adını giriniz:");
            String urunAdi=giris.nextLine();

            // Liste içerisinden ürün adına göre arama yapıyor ve urun nesnesini döndürüyor
            urun = tumUrunlerinListesi.stream()
                    .filter(urunElementi -> urunAdi.equalsIgnoreCase(urunElementi.getAdi()))
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

        siparisService.siparisiKaydet(siparis);
    }
}