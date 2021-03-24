package cc.ders7.atm;

public class BakiyeGoruntuleme implements IIslem {
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private KullaniciHesabi kullaniciHesabi;

    public BakiyeGoruntuleme(IEkran ekran, ITusTakimi tusTakimi, KullaniciHesabi kullaniciHesabi) {
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.kullaniciHesabi = kullaniciHesabi;
    }

    public void islemYap() {
        ekran.mesajGoruntule("para çekme işlemini seçtiniz");
        ekran.mesajGoruntule("Bakiyeniz:"+kullaniciHesabi.getBakiye());
    }
}
