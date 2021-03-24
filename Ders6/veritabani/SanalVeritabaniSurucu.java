package cc.ders7.atm.veritabani;

import cc.ders7.atm.Araclar;
import cc.ders7.atm.IBankaBilgiSistemi;
import cc.ders7.atm.KullaniciHesabi;

public class SanalVeritabaniSurucu implements IBankaBilgiSistemi {
    @Override
    public KullaniciHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {
        KullaniciHesabi kullaniciHesabi=null;

        System.out.println("banka bilgi sistemi  kullanıcıyı doğruluyor...");
        Araclar.bekle(2000);
        System.out.println("veritabanına bağlandı (sanal veritabanı yönetim sistemi) ve kullanıcıyı sorguluyor...");
        Araclar.bekle(2000);
        if(hesapNumarasi==2 && sifre==2)
            kullaniciHesabi = new KullaniciHesabi(hesapNumarasi, 1000, "Zeynep", "Gök");
        return kullaniciHesabi;
    }

    @Override
    public void hesapGuncelle(KullaniciHesabi kullaniciHesabi) {

    }
}
