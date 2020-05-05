package cc.ders12.iterator;


import cc.ders5.Adres;

public class Personel extends Kisi {

    private int sicilNO;
    private String bolum;

    public Personel(String ad, String soyad, int sicilNO, String bolum) {
        super(ad, soyad);
        this.sicilNO = sicilNO;
        this.bolum = bolum;
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
                "} " + super.toString();
    }
}