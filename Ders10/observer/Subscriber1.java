package cc.ders12.observer;

public class Subscriber1 implements IObserver {
    @Override
    public void update(String mesaj) {
        System.out.println("Abone1 e gelen mesaj->" + mesaj);
    }
}
