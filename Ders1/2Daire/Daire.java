/**
* Daire.java olarak kaydedilmeli.
*
*/

public class Daire 
{
    // Üye değişkenlere dışarıdan doğrudan erişilememeli. Bu nedenle private yapılmıştır.
    // Üye değişkenlere ilgili set ve get yöntemleriyle erişilir.
    private int x;
    private int y;
    private int yariCap;
    
    // Yapıcılar nesne oluşturulurken çağırılan özel üye yöntemlerdir.         
    public Daire(int x, int y, int yariCap) {
        this.x = x;
        this.y = y;
        this.yariCap = yariCap;
    }
    
    //Yapıcı yöntem aşırı yükleniyor (function overloading). 
    //Yöntem imzaları (yöntem adı+ parametre listesi) mutlaka farklı olmalı
    public Daire(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    public String toString() {
        return "konumu = (" + x + "," + y + ") - yarıçapı= " + yariCap;
    }
    
    public double alanHesapla(){
        return Math.pow(yariCap,2)*Math.PI;
    }
}