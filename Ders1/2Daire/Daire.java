/**
* Daire.java olarak kaydedilmeli.
*
*/

public class Daire 
{

    private int x;
    private int y;
    private int yariCap;
      
    public Daire(int x, int y, int yariCap) {
        this.x = x;
        this.y = y;
        this.yariCap = yariCap;
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