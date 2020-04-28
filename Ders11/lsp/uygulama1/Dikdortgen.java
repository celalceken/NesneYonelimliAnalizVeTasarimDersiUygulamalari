package cc.ders10.lsp.uygulama1;

public class Dikdortgen {
    private double yukseklik;
    private double genislik;

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
