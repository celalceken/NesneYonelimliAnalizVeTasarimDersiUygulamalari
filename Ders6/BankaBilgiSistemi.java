package cc.ders7.atm;


public class BankaBilgiSistemi implements IBankaBilgiSistemi {

    private IVeritabaniRepository veritabani;

    public BankaBilgiSistemi(IVeritabaniRepository veritabani) {
        this.veritabani=veritabani;
    }

    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {

        return veritabani.kullaniciDogrula(hesapNumarasi, sifre);

    }

    public void hesapGuncelle(MusteriHesabi musteriHesabi) {

        veritabani.hesapGuncelle(musteriHesabi);

    }
}
