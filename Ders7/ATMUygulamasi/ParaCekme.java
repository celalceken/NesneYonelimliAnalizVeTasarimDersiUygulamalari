package cc.ders7.atm;

public class ParaCekme implements IIslem{
    private IBankaBilgiSistemi bankaBilgiSistemi;
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private KullaniciHesabi kullaniciHesabi;
    private IParaBolmesi paraBolmesi;

    public ParaCekme(IBankaBilgiSistemi bankaBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, KullaniciHesabi kullaniciHesabi, IParaBolmesi paraBolmesi) {
        this.bankaBilgiSistemi = bankaBilgiSistemi;
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.kullaniciHesabi = kullaniciHesabi;
        this.paraBolmesi = paraBolmesi;
    }

    public void islemYap() {
        ekran.mesajGoruntule("Bakiyeniz:"+kullaniciHesabi.getBakiye());
        ekran.mesajGoruntule("Tutarı giriniz");
        int cekilecekTutar= tusTakimi.veriAl();
        if(paraBolmesi.paraVarmi()==true){
            kullaniciHesabi.setBakiye(kullaniciHesabi.getBakiye()-cekilecekTutar);
            ekran.mesajGoruntule("son bakiyeniz"+ kullaniciHesabi.getBakiye());
            bankaBilgiSistemi.hesapGuncelle(kullaniciHesabi);
        } else
            ekran.mesajGoruntule("Bankamatikte yeterli para yok...");





    }

}
