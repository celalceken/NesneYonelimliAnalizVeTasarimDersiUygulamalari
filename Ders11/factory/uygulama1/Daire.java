package cc.ders12.factory.uygulama1;

public class Daire implements ISekil{

    private float yaricap;

    Koordinat koordinat;

    public Koordinat getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(Koordinat koordinat) {
        this.koordinat = koordinat;
    }

    public float getYaricap() {
        return yaricap;
    }

    public void setYaricap(float yaricap) {
        this.yaricap = yaricap;
    }



    public double alanHesapla(){
        return Math.pow(yaricap,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                ", koordinat=" + koordinat +
                '}';
    }


}
