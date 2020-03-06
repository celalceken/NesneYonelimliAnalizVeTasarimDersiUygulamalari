package ders3.uygulama1;


import javax.print.DocFlavor;
import java.util.Scanner;

public class Personel extends Kisi{

    private int sicilNO;
    private String bolum;

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