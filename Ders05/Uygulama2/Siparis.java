package cc.ders6.siparis;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Siparis {
    private int siparisNo;
    private LocalDateTime siparisTarihi;
    private double genelToplam;
    private List<SiparisKalemi> siparisKalemleri = new ArrayList<SiparisKalemi>();

    public Integer getSiparisNo() {
        return siparisNo;
    }

    public LocalDateTime getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisNo(Integer siparisNo) {
        this.siparisNo = siparisNo;
    }

    public void setSiparisTarihi(LocalDateTime siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public List<SiparisKalemi> getSiparisKalemleri() {
        return siparisKalemleri;
    }

    public void setSiparisKalemleri(List<SiparisKalemi> siparisKalemleri) {
        this.siparisKalemleri = siparisKalemleri;
    }

    public Siparis(int siparisNo) {
        this.siparisNo = siparisNo;
        this.siparisTarihi = LocalDateTime.now();
        this.genelToplam=0;
    }

    public void sepeteEkle(String urunAdi, int miktari, double siparisBirimFiyati)
    {
        SiparisKalemi siparisKalemi = new SiparisKalemi(urunAdi, miktari, siparisBirimFiyati);
        genelToplam+=siparisKalemi.araToplam();
        siparisKalemleri.add(siparisKalemi);
    }

    @Override
    public String toString() {
        return "Siparis{" +
                "Sipariş No=" + siparisNo +
                ", Sipariş Tarihi=" + siparisTarihi +
                ", Genel Toplam=" + genelToplam +
                ", Sipariş Kalemleri=" + siparisKalemleri +
                '}';
    }
}
