package ders3.uygulama1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uygulama {
        public static void main(String args[]) throws IOException {

                char cevap;
                List<Musteri> musteriler = new ArrayList<Musteri> ();

                do {
                        Scanner input = new Scanner(System.in);
                        System.out.print("Müsterinin adini giriniz= ");
                        String ad = input.nextLine();

                        System.out.print("Müsterinin soyadını giriniz= ");
                        String soyad = input.nextLine();

                        System.out.print("Ev adresini giriniz= ");
                        Adres evAdresi = new Adres();
                        evAdresi.setAdresSatiri(input.nextLine());
                        System.out.print("Ev adresine ekleme yapabilirsiniz= ");
                        evAdresi.setAdresSatiri2(input.nextLine());
                        System.out.print("Ev adresi il bilgisini giriniz= ");
                        evAdresi.setIl(input.nextLine());

                        Scanner input2 = new Scanner(System.in);
                        System.out.print("Telefon no giriniz= ");
                        Integer telNo = input2.nextInt();

                        System.out.print("İş adresini giriniz= ");
                        Adres isAdresi = new Adres();
                        isAdresi.setAdresSatiri(input.nextLine());
                        System.out.print("İş adresine ekleme yapabilirsiniz= ");
                        isAdresi.setAdresSatiri2(input.nextLine());
                        System.out.print("İş adresi il bilgisini giriniz= ");
                        isAdresi.setIl(input.nextLine());

                        Musteri musterigecici = new Musteri(telNo, isAdresi, evAdresi, ad, soyad);
                        musteriler.add(musterigecici);
                        System.out.println("Devam etmek istiyor musunuz ?");
                        cevap = (char) System.in.read();
                        input.nextLine();

                }while(cevap!='h');


                for(Musteri str : musteriler) {
                        System.out.println(str.toString());
                }

        }

}