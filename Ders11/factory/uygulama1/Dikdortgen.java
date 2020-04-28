package cc.ders12.factory.uygulama1;

public class Dikdortgen implements ISekil  {

    private float uzunluk;
    private float genislik;
    Koordinat koordinat;

    public Koordinat getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(Koordinat koordinat) {
        this.koordinat = koordinat;
    }

    public float getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(float uzunluk) {
        this.uzunluk = uzunluk;
    }

    public float getGenislik() {
        return genislik;
    }

    public void setGenislik(float genislik) {
        this.genislik = genislik;
    }

    public double alanHesapla(){
        return this.uzunluk*this.genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                ", koordinat=" + koordinat +
                '}';
    }
}
