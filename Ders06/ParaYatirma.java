package cc.ders7.atm;

public class ParaYatirma extends Islem {

    private final IParaBolmesi paraBolmesi;

    public ParaYatirma(IBankaBilgiSistemi bankaBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi, IParaBolmesi paraBolmesi) {
        super(ekran, tusTakimi, bankaBilgiSistemi, musteriHesabi);
        this.paraBolmesi = paraBolmesi;
    }

    public void islemYap() {
        ekran.mesajGoruntule("para yatırma işlemini seçtiniz");
        ekran.mesajGoruntule("Bakiyeniz:"+ musteriHesabi.getBakiye());
        ekran.mesajGoruntule("Tutarı giriniz");
        int yatirilacakTutar= tusTakimi.veriAl();
        ekran.mesajGoruntule("parayı bölmeye yerleştiriniz");
        if(paraBolmesi.alinanParaGecerlimi()){
            musteriHesabi.setBakiye(musteriHesabi.getBakiye()+yatirilacakTutar);
            ekran.mesajGoruntule("son bakiyeniz"+ musteriHesabi.getBakiye());
            bankaBilgiSistemi.hesapGuncelle(musteriHesabi);
        }else
            ekran.mesajGoruntule("paranız geçerli değil");
    }

}

