package ders4.uygulama1;

import java.util.ArrayList;
import java.util.List;

public class Siparis {
    private Integer siparisNo;
    private String siparisTarihi;
    private List<SiparisKalemi> siparisler = new ArrayList<SiparisKalemi>();

    public Integer getSiparisNo() {
        return siparisNo;
    }

    public String getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisNo(Integer siparisNo) {
        this.siparisNo = siparisNo;
    }

    public void setSiparisTarihi(String siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public List<SiparisKalemi> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(List<SiparisKalemi> siparisler) {
        this.siparisler = siparisler;
    }

    public Siparis(Integer siparisNo, String siparisTarihi) {
        this.siparisNo = siparisNo;
        this.siparisTarihi = siparisTarihi;
    }

    public void sepeteEkle(Urun urun, Siparis siparis, Integer miktar)
    {
        SiparisKalemi siparisKalemi = new SiparisKalemi(urun, siparis, miktar);
        siparisler.add(siparisKalemi);
    }

    public void ekranaBas() { System.out.println(siparisler);}

    @Override
    public String toString() {
        return "Siparis{" +
                "siparisNo=" + siparisNo +
                ", siparisTarihi='" + siparisTarihi + '\'' +
                '}';
    }


}
