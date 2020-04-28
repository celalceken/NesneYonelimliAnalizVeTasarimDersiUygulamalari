package cc.ders12.facade.uygulama1.siparis;

public class Urun {
    private int urunNo;
    private String adi;
    private double birimFiyati;
    private int stokMiktari;

    public Urun(String ad) {
        this.adi = ad;
    }

    public Urun(int urunNo, String adi, double birimFiyati, int stokMiktari) {
        this.urunNo=urunNo;
        this.adi = adi;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    public int getUrunNo() {
        return urunNo;
    }

    public String getAd() {
        return adi;
    }

    public void setAd(String ad) {
        this.adi = ad;
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
                "urunNo=" + urunNo +
                ", adi='" + adi + '\'' +
                ", birimFiyati=" + birimFiyati +
                ", stokMiktari=" + stokMiktari +
                '}';
    }

   /*public List<Urun> urunleriListele(){

        ret

    }*/
}
