package cc.ders12.prototype.uygulama1;

public class Dikdortgen extends Sekil implements Cloneable {

    private float uzunluk;
    private float genislik;

    public Dikdortgen(double konumX, double konumY, String renk, float uzunluk, float genislik) {
        super(konumX, konumY, renk);
        this.uzunluk = uzunluk;
        this.genislik=genislik;
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
    @Override
    public double alanHesapla(){
        return this.uzunluk*this.genislik;
    }

    @Override
    protected Dikdortgen clone() throws CloneNotSupportedException {
        return new Dikdortgen(this.getKonumX(),this.getKonumY(),this.getRenk(),uzunluk,genislik);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                "} " + super.toString();
    }
}
