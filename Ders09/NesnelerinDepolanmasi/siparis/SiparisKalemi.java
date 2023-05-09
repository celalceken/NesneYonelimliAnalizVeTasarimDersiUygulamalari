package cc.ders9.nesnelerindepolanmasi.siparis;

import cc.ders9.nesnelerindepolanmasi.repository.Urun;

public class SiparisKalemi {
    private Urun urun;
    private int miktar;
    private double siparisBirimFiyati;

    public SiparisKalemi(Urun urun, int miktar, double siparisBirimFiyati) {
        this.urun = urun;
        this.miktar = miktar;
        this.siparisBirimFiyati = siparisBirimFiyati;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getMiktar() {
        return miktar;
    }

    public double getSiparisBirimFiyati() {
        return siparisBirimFiyati;
    }

    public double araToplam(){
        return this.getMiktar()*this.getSiparisBirimFiyati();
    }

    @Override
    public String toString() {
        return "SiparisKalemi{" +
                "urun=" + urun.getAdi() +
                ", miktar=" + miktar +
                ", siparisBirimFiyati=" + siparisBirimFiyati +
                ", ara toplam=" + this.araToplam() +
                '}';
    }
}
