package cc.ders2.kalitim;

public class Daire extends Sekil {

    private float yaricap;

    public Daire(double konumX, double konumY, String renk, float yaricap) {
        super(konumX, konumY, renk);
        this.yaricap = yaricap;
    }

    public float getYaricap() {
        return yaricap;
    }

    public void setYaricap(float yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla(){
        return Math.pow(yaricap,2)*Math.PI;
    }

}
