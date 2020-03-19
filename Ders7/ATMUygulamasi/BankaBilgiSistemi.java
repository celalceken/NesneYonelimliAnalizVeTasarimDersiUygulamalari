package cc.ders7.atm;

public class BankaBilgiSistemi implements IBankaBilgiSistemi {

    private KullaniciHesabi kullaniciHesabi; //Kullanıcının çok sayıda hesabı olabilir.

    public KullaniciHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {

        System.out.println("banka bilgi sistemi kullanıcıyı doğruluyor...");
        System.out.println("veritabanına bağlandı ve kullanıcı hesap bilgilerini aldı...");
        Musteri musteri=new Musteri("Ayşe","Gül");
        kullaniciHesabi= new KullaniciHesabi(125, musteri);
        return kullaniciHesabi;
        //return null;
    }

    public void hesapGuncelle(KullaniciHesabi kullaniciHesabi) {
        System.out.println("banka bilgi sistemi hesabı güncelliyor...");
        System.out.println(kullaniciHesabi);
    }
}
