package cc.ders12.facade.uygulama1;

import cc.ders12.facade.uygulama1.fatura.Fatura;
import cc.ders12.facade.uygulama1.fatura.FaturaServisiJSON;
import cc.ders12.facade.uygulama1.fatura.IFaturaServisi;
import cc.ders12.facade.uygulama1.siparis.*;

import java.util.List;
import java.util.Scanner;

public class SiparisOlusturFacade {

    private Siparis siparis;

    public void siparisOlustur(){

        Scanner giris = new Scanner(System.in);

        System.out.println("Siparis numarasını giriniz= ");
        int siparisNo = giris.nextInt(); giris.nextLine();

        this.siparis=new Siparis(siparisNo);

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



    public void faturaOlustur(){

        Fatura fatura=new Fatura(this.siparis);
        //IFaturaServisi faturaServisi=new FaturaServisiXML();
        IFaturaServisi faturaServisi=new FaturaServisiJSON();

        System.out.println("Fatura toplamı:"+fatura.toplamTutariHesapla());
        System.out.println("Fatura oluşturuluyor:"+fatura.faturaYazdir(faturaServisi));
    }


}
