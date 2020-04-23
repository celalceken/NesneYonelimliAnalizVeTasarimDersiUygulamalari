package cc.ders10.ocp.uygulama2;

import cc.ders6.siparis.Siparis;
import cc.ders6.siparis.SiparisKalemi;

import java.time.LocalDateTime;

public class Fatura {
    private Siparis siparis;
    private LocalDateTime siparisTarihi;
    private double faturaToplami=0;

    public Fatura(Siparis siparis) {
        this.siparis=siparis;
    }

    public Siparis getSiparis() {
        return siparis;
    }

    public double toplamTutariHesapla(){
        for(SiparisKalemi siparisKalemi:siparis.getSiparisKalemleri())
            faturaToplami+=siparisKalemi.araToplam()*1.18;
        return faturaToplami;
    }

    public String faturaYazdir(IFaturaServisi faturaServisi){
        return faturaServisi.faturaOlustur(this);
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "siparis=" + siparis +
                ", siparisTarihi=" + siparisTarihi +
                ", faturaToplami=" + faturaToplami +
                '}';
    }
}
