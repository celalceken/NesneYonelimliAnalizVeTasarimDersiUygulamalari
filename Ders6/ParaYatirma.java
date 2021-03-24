package cc.ders7.atm;

public class ParaYatirma implements IIslem {
    private IBankaBilgiSistemi bankaBilgiSistemi;
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private KullaniciHesabi kullaniciHesabi;
    private IParaBolmesi paraBolmesi;

    public ParaYatirma(IBankaBilgiSistemi bankaBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, KullaniciHesabi kullaniciHesabi, IParaBolmesi paraBolmesi) {
        this.bankaBilgiSistemi = bankaBilgiSistemi;
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.kullaniciHesabi = kullaniciHesabi;
        this.paraBolmesi = paraBolmesi;
    }
    public void islemYap() {
        ekran.mesajGoruntule("para yatırma işlemini seçtiniz");
        ekran.mesajGoruntule("Bakiyeniz:"+kullaniciHesabi.getBakiye());
        ekran.mesajGoruntule("Tutarı giriniz");
        int yatirilacakTutar= tusTakimi.veriAl();
        kullaniciHesabi.setBakiye(kullaniciHesabi.getBakiye()+yatirilacakTutar);
        ekran.mesajGoruntule("son bakiyeniz"+ kullaniciHesabi.getBakiye());
        bankaBilgiSistemi.hesapGuncelle(kullaniciHesabi);
    }


}

