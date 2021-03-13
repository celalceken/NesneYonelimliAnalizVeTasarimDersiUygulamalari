package cc.ders4.listarray;

import java.util.ArrayList;

public class Kitap {
    private String adi;
    private double birimFiyati;

    public Kitap(String adi, double birimFiyati) {
        this.adi = adi;
        this.birimFiyati = birimFiyati;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", birimFiyati=" + birimFiyati +
                '}';
    }
}

