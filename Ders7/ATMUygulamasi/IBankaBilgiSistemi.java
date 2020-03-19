package cc.ders7.atm;

public interface IBankaBilgiSistemi {
    public KullaniciHesabi kullaniciDogrula(int hesapNumarasi, int sifre);
    public void hesapGuncelle(KullaniciHesabi kullaniciHesabi);

}
