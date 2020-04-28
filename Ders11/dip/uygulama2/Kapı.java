package cc.ders10.dip.uygulama2;

public class Kapı implements IAnahtarlanabilir {
    @Override
    public void ac() {
        System.out.println("kapı açıldı");

    }

    @Override
    public void kapat() {
        System.out.println("kapı kapandı");
    }
}
