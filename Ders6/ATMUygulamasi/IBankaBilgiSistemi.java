package cc.ders3.myatm;

public interface IBankaBilgiSistemi {
    public KullaniciHesabi kullaniciDogrula(int hesapNumarasi, int sifre);
    public void hesapGuncelle(KullaniciHesabi kullaniciHesabi);

}
