/*
*
*
* */

package cc.ders12.builder.uygulama;

public class Koordinat {
    private double konumX;
    private double konumY;

    public Koordinat(double konumX, double konumY) {
        this.konumX = konumX;
        this.konumY = konumY;
    }

    public double getKonumX() {
        return konumX;
    }

    public void setKonumX(double konumX) {
        this.konumX = konumX;
    }

    public double getKonumY() {
        return konumY;
    }

    public void setKonumY(double konumY) {
        this.konumY = konumY;
    }

    public void konumDegistir(double x, double y){
        this.setKonumX(x);
        this.setKonumY(y);
    }

    @Override
    public String toString() {
        return "Koordinat{" +
                "konumX=" + konumX +
                ", konumY=" + konumY +
                '}';
    }
}
