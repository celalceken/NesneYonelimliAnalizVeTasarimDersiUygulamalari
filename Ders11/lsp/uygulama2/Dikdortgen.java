package cc.ders10.lsp.uygulama2;

public class Dikdortgen implements ISekil {
    private double yukseklik;
    private double genislik;

    public Dikdortgen(double yukseklik, double genislik) {
        this.yukseklik = yukseklik;
        this.genislik = genislik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double alanHesapla(){
        return genislik*yukseklik;
    }
}
