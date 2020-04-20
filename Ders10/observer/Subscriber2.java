package cc.ders12.observer;

public class Subscriber2 implements IObserver {
    @Override
    public void update(String mesaj) {
        System.out.println("Abone2 ye gelen mesaj->" + mesaj);
    }}
