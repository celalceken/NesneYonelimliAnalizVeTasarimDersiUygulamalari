/*
*
*
* */

package cc.ders12.factory.uygulama1;

public class Koordinat {  //Soyut yöntem sadece soyut sınıflarda bulunabilir. Soyut sınıflardan nesne oluşturulamaz
    private double konumX;
    private double konumY;


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
