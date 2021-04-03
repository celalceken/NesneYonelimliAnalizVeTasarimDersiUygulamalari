package cc.ders7.atm;

public class ParaYatirma implements IIslem {
    private IBankaBilgiSistemi bankaBilgiSistemi;
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private MusteriHesabi musteriHesabi;
    private IParaBolmesi paraBolmesi;

    public ParaYatirma(IBankaBilgiSistemi bankaBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi, IParaBolmesi paraBolmesi) {
        this.bankaBilgiSistemi = bankaBilgiSistemi;
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.musteriHesabi = musteriHesabi;
        this.paraBolmesi = paraBolmesi;
    }
    public void islemYap() {
        ekran.mesajGoruntule("para yatırma işlemini seçtiniz");
        ekran.mesajGoruntule("Bakiyeniz:"+ musteriHesabi.getBakiye());
        ekran.mesajGoruntule("Tutarı giriniz");
        int yatirilacakTutar= tusTakimi.veriAl();
        musteriHesabi.setBakiye(musteriHesabi.getBakiye()+yatirilacakTutar);
        ekran.mesajGoruntule("son bakiyeniz"+ musteriHesabi.getBakiye());
        bankaBilgiSistemi.hesapGuncelle(musteriHesabi);
    }


}

