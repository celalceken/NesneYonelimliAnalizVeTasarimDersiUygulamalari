package cc.ders5;


import javax.print.DocFlavor;
import java.util.Scanner;

public class Personel extends Kisi{

    private int sicilNO;
    private String bolum;

    public Personel(String ad, String soyad, Adres evAdresi,int sicilNo,String bolum) {
        super(ad, soyad, evAdresi);
        this.sicilNO=sicilNo;
        this.bolum=bolum;

    }

    public int getSicilNO() {
        return sicilNO;
    }

    public String getBolum() {
        return bolum;
    }

    public void setSicilNO(int sicilNO) {
        this.sicilNO = sicilNO;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "sicilNO=" + sicilNO +
                ", bolum='" + bolum + '\'' +
                '}';
    }
}