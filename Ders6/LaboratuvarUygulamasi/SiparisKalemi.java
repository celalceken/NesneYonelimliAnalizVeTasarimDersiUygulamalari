package ders4.uygulama1;

public class SiparisKalemi {
    private Urun urun;
    private Siparis siparis;
    private Integer miktar;

    public Urun getUrun() {
        return urun;
    }

    public Integer getMiktar() {
        return miktar;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public void setMiktar(Integer miktar) {
        this.miktar = miktar;
    }

    public SiparisKalemi(Urun urun, Siparis siparis, Integer miktar) {
        this.urun = urun;
        this.siparis = siparis;
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return "SiparisKalemi{" +
                "urun=" + urun +
                ", siparisKalemi=" + siparis +
                ", miktar=" + miktar +
                '}';
    }
}
