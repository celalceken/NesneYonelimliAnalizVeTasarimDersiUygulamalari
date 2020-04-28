package cc.ders10.dip.uygulama2;

public class Buton {
    private IAnahtarlanabilir cihaz;

    public Buton(IAnahtarlanabilir cihaz) {
        this.cihaz = cihaz;
    }

    public void ac(){
        cihaz.ac();
    }
    public void kapat(){
        cihaz.kapat();
    }
}
