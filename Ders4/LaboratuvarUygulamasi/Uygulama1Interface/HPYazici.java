package ders2.uygulama1;

public class HPYazici implements YaziciArayuzu {
    public void ac() {
        System.out.println("HP yazıcı çalışmaya başlıyor...");
    }

    public void yazdir(String mesaj) {
        System.out.println("HP yazıcı "+mesaj+" yazdırıyor...");
    }

    public void kapat() {
        System.out.println("HP yazıcı kapanıyor...");
    }
}