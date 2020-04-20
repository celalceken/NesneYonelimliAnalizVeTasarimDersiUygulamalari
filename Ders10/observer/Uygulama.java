package cc.ders12.observer;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args)
    {
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();

        Publisher p = new Publisher();

        p.attach(s1);
        p.attach(s2);


        KullaniciHesabi kullaniciHesabi=new KullaniciHesabi(123,300,p);
        Scanner giris = new Scanner(System.in);

        String cevap=null;
        double yeniBakiye=0;

        do{
            System.out.println("bakiyeyi giriniz");
            yeniBakiye=giris.nextDouble();giris.nextLine();
            kullaniciHesabi.setBakiye(yeniBakiye);
            System.out.println("Devam (e/h)?");
            cevap=giris.nextLine();
        }while(cevap.equalsIgnoreCase("E"));

    }
}
