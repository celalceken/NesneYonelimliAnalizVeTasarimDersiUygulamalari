package cc.ders6.siparis;

public class SiparisKalemi {
    private Urun urun;
    private int miktar;
    private double siparisBirimFiyati;

    public SiparisKalemi(String urunAdi, int miktar, double siparisBirimFiyati) {
        this.urun = new Urun(urunAdi);
        this.miktar = miktar;
        this.siparisBirimFiyati = siparisBirimFiyati;
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
                "urun=" + urun.getAd() +
                ", miktar=" + miktar +
                ", siparisBirimFiyati=" + siparisBirimFiyati +
                ", ara toplam=" + this.araToplam() +
                '}';
    }
}
