package cc.ders7.atm;

import cc.ders7.atm.veritabani.PostgreSQLSurucu;


public class BankaBilgiSistemi implements IBankaBilgiSistemi {

    private IBankaBilgiSistemi veritabani;

    public BankaBilgiSistemi(IBankaBilgiSistemi veritabani) {
        this.veritabani=veritabani;
    }

    public KullaniciHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {

        return veritabani.kullaniciDogrula(hesapNumarasi, sifre);

    }

    public void hesapGuncelle(KullaniciHesabi kullaniciHesabi) {

        veritabani.hesapGuncelle(kullaniciHesabi);

    }
}
