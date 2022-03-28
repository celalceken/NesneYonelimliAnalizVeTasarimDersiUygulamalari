package cc.ders7.atm;

public class ParaCekme extends Islem{

    private final IParaBolmesi paraBolmesi;

    public ParaCekme(IBankaBilgiSistemi bankaBilgiSistemi, IEkran ekran, ITusTakimi tusTakimi, MusteriHesabi musteriHesabi, IParaBolmesi paraBolmesi) {
        super(ekran, tusTakimi, bankaBilgiSistemi, musteriHesabi);
        this.paraBolmesi = paraBolmesi;
    }
    @Override
    public void islemYap() {
        ekran.mesajGoruntule("para çekme işlemini seçtiniz");
        ekran.mesajGoruntule("Bakiyeniz:"+ musteriHesabi.getBakiye());
        if(paraBolmesi.paraVarmi()) {
            ekran.mesajGoruntule("Tutarı giriniz");
            int cekilecekTutar = tusTakimi.veriAl();
            if (paraBolmesi.yeterliParaVarmi(cekilecekTutar)) {
                paraBolmesi.paraVer(cekilecekTutar);
                if(paraBolmesi.paraBolmedenAlindimi()) {
                    musteriHesabi.setBakiye(musteriHesabi.getBakiye() - cekilecekTutar);
                    ekran.mesajGoruntule("son bakiyeniz" + musteriHesabi.getBakiye());
                    bankaBilgiSistemi.hesapGuncelle(musteriHesabi);
                }else{
                    ekran.mesajGoruntule("Para bölmeden alınmadı");
                    paraBolmesi.paraAl(cekilecekTutar);
                }
            } else
                ekran.mesajGoruntule("Bankamatikte yeterli para yok...");
        } else{
            ekran.mesajGoruntule("Bankamatikte para yok...");
            Araclar.bekle(2000);
        }
    }

}
