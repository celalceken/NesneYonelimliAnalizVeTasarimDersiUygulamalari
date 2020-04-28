package cc.ders10.lsp.uygulama2;

public class Kare implements ISekil {

    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public double alanHesapla(){
        return Math.pow(kenar,2);
    }
}
