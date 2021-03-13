package cc.ders5;

public abstract class Kisi {

    private String ad;
    private String soyad;
    private Adres evAdresi;

    public Kisi(String ad, String soyad, Adres evAdresi) {
        this.ad = ad;
        this.soyad = soyad;
        this.evAdresi = evAdresi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setEvAdresi(Adres evAdresi) { this.evAdresi = evAdresi;
    }

}