package cc.ders7.atm;

public class ParaBolmesi implements IParaBolmesi {

    private int mevcutParaMiktarı=1000;

    public void paraVer(int tutar) {
        System.out.println("para veriliyor...");
        mevcutParaMiktarı-=tutar;
    }

    public void paraAl(int tutar) {
        System.out.println("para alınıyor...");
        mevcutParaMiktarı+=tutar;
    }

    public boolean paraVarmi() {
        return true;
    }

    public boolean yeterliParaVarmi(int cekilecekTutar) {
        return (mevcutParaMiktarı>cekilecekTutar);
    }

    public boolean alinanParaGecerlimi() {
        return true;
    }

    public boolean paraBolmedenAlindimi() {
        return true;
    }
}
