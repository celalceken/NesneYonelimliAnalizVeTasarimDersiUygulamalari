package cc.ders7.atm;

public class Musteri {
    private String ad;
    private String soyad;

    public Musteri(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
