package cc.ders7.atm;

public class BakiyeGoruntuleme implements IIslem {
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private MusteriHesabi musteriHesabi;

    public BakiyeGoruntuleme(IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi) {

        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.musteriHesabi = musteriHesabi;

    }


    public void islemYap() {
        ekran.mesajGoruntule("para çekme işlemini seçtiniz");
        ekran.mesajGoruntule("Bakiyeniz:"+ musteriHesabi.getBakiye());

    }
}
