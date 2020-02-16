package ders1.uygulama3;



public class KalitimUygulamasi {


    public static void main(String[] args) {
        Personel i=new Personel("Ayse Yilmaz",12345);
        System.out.println(i.print());
        System.out.println("**********************");
        Ogrenci o=new Ogrenci("Haluk Engin",23456,21);
        System.out.println(o.print());
    }
}