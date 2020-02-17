package ders1.uygulama1;

public class Personel{


    private  String ad;
    private String soyad;
    private int yasi;
    private int toplam;


    public String getAd()
    {
        return ad;
    }

    public void setAd(String ad)
    {
        this.ad=ad;
    }


    public String getSoyad()
    {
        return soyad;
    }

    public void setSoyad(String soyad)
    {
        this.soyad=soyad;
    }


    public Integer getYasi()
    {
        return yasi;
    }

    public void setYasi(int yasi)
    {
        this.yasi=yasi;
    }


    public Integer getCalismaGunuHesapla()
    {
        return toplam;
    }

    public void setCalismaGunuHesapla(int gun)
    {
        toplam=gun*150;

    }

}

