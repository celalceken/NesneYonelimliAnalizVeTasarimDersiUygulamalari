package cc.ders3.myatm;

public class KartBolmesi implements IKartBolmesi {
    public void kartAl() {
        System.out.println("kart alınıyor...");
    }

    public boolean kartDogrula() {
        System.out.println("kart doğrulanıyor...");
        return true;
    }

    public void kartCikart() {
        System.out.println("kart çıkartılıyor...");
    }
}
