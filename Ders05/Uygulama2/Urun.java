package cc.ders6.siparis;

public class Urun {
    private String ad;
    private double birimFiyati;
    private int stokMiktari;

    public Urun(String ad) {
        this.ad = ad;
    }

    public Urun(String ad, double birimFiyati, int stokMiktari) {
        this.ad = ad;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "ad='" + ad + '\'' +
                '}';
    }
}
