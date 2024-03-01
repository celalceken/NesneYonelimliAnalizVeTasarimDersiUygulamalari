/*
*
*
* */

package cc.ders2.kalitim;

abstract public class Sekil {  //Soyut yöntem sadece soyut sınıflarda bulunabilir. Soyut sınıflardan nesne oluşturulamaz
    private double konumX;
    private double konumY;
    private String renk;

    public Sekil(double konumX, double konumY, String renk) {
        this.konumX = konumX;
        this.konumY = konumY;
        this.renk = renk;
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

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }


    public void konumDegistir(double x, double y){
        this.setKonumX(x);
        this.setKonumY(y);
    }

    public abstract double alanHesapla(); // Soyut yöntem. Gerçekleme kısmı yoktur. Soyut sınıflarda bulunur.
    /*public double alanHesapla(){
        System.out.println("Alan hesaplanıyor...");
        return 0;
    }*/


    public String toString() {
        return "konumu = (" + this.getKonumX() + "," + this.getKonumY() + ") - rengi= " + this.getRenk();
    }

}
