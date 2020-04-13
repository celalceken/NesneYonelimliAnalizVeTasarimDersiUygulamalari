package cc.ders9.nesnelerindepolanmasi.crudinterface;

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
    public Urun(String adi, double birimFiyati, int stokMiktari) {

        this.adi = adi;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    public int getUrunNo() {
        return urunNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String ad) {
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

}
