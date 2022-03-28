package cc.ders7.atm;

public class BakiyeGoruntuleme extends Islem {

    public BakiyeGoruntuleme(IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi) {
        super(ekran, tusTakimi, null, musteriHesabi);
    }

    public void islemYap() {
        ekran.mesajGoruntule("Bakiye görüntüleme işlemini seçtiniz");
        ekran.mesajGoruntule(musteriHesabi.getMusteri().getAd()+" "+musteriHesabi.getMusteri().getSoyad());
        ekran.mesajGoruntule("Bakiyeniz:"+ musteriHesabi.getBakiye());

    }
}
