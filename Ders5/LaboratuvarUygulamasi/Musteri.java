package ders3.uygulama1;

import java.util.Scanner;

public class Musteri extends Kisi{

    private int telefonNo;
    private Adres isAdresi;


    public int getTelefonNo() {
        return telefonNo;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setTelefonNo(int telefonNo) {
        this.telefonNo = telefonNo;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    public Musteri(int telefonNo, Adres isAdresi, Adres evAdresi, String ad,String soyad) {
        this.telefonNo = telefonNo;
        this.isAdresi = isAdresi;
        super.setEvAdresi(evAdresi);
        super.setAd(ad);
        super.setSoyad(soyad);
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "telefonNo=" + telefonNo +
                ", isAdresi=" + isAdresi +
                ", ad='" + getAd() + '\'' +
                ", soyad='" + getSoyad() + '\'' +
                ", evAdresi=" + getEvAdresi() +
                '}';
    }
}