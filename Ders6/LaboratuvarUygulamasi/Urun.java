package ders4.uygulama1;

public class Urun {
    private String ad;
    private Integer birimFiyati;
    private Integer stokMiktari;

    public String getAd() {
        return ad;
    }

    public Integer getBirimFiyati() {
        return birimFiyati;
    }

    public Integer getStokMiktari() {
        return stokMiktari;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBirimFiyati(Integer birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public void setStokMiktari(Integer stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public Urun(String ad, Integer birimFiyati) {
        this.ad = ad;
        this.birimFiyati = birimFiyati;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "ad='" + ad + '\'' +
                ", birimFiyati=" + birimFiyati +
                '}';
    }
}
