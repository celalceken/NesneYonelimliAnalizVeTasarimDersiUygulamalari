package cc.ders5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uygulama {

    public static void main(String args[]){

        Scanner giris = new Scanner(System.in);

        List<Musteri> musteriListesi = new ArrayList<Musteri>();

        System.out.println("**********Müşteri Bilgilerini Giriniz*********");

        String cevap=null;
        String adi=null;
        String soyadi=null;
        String telefonNo=null;
        String adresSatiri=null;
        String il=null;
        Adres evAdresi=null;
        Adres isAdresi=null;

        do{
            System.out.println("Müşteri adını soyadını telefon numarasını giriniz:");
            adi=giris.nextLine();
            soyadi=giris.nextLine();
            telefonNo=giris.nextLine();

            System.out.println("Ev adresinin, adres ve il bilgilerini giriniz:");
            adresSatiri=giris.nextLine();
            il=giris.nextLine();
            evAdresi=new Adres(adresSatiri,il);

            System.out.println("İş adresinin, adres ve il bilgilerini giriniz:");
            adresSatiri=giris.nextLine();
            il=giris.nextLine();
            isAdresi=new Adres(adresSatiri,il);

            musteriListesi.add(new Musteri(adi,soyadi,evAdresi,telefonNo,isAdresi));

            System.out.println("Eklemek istediğiniz kayıt var mı (e/h)?");
            cevap=giris.nextLine();

        }while(cevap.equalsIgnoreCase("E"));

        for(Musteri musteri:musteriListesi)
            System.out.println(musteri.getAd()+" "+musteri.getSoyad()+" "+ musteri.getEvAdresi().toString()+" "+musteri.getIsAdresi());
    }
}
