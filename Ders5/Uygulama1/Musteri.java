package cc.ders5;

public class Musteri extends Kisi{

    private String telefonNo;
    private Adres isAdresi;

    public Musteri(String ad, String soyad, Adres evAdresi, String telefonNo, Adres isAdresi) {
        super(ad,soyad,evAdresi);
        this.telefonNo = telefonNo;
        this.isAdresi = isAdresi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }
}