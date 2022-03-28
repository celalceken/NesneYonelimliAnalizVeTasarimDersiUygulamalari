package cc.ders7.atm;

public interface IVeritabaniRepository {
    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre);
    public void hesapGuncelle(MusteriHesabi musteriHesabi);

}
