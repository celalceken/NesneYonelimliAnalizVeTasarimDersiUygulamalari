package cc.ders10.srp.uygulama1;

import cc.ders6.siparis.Siparis;
import cc.ders6.siparis.SiparisKalemi;

import javax.json.*;

import java.time.LocalDateTime;

public class Fatura {
    private Siparis siparis;
    private LocalDateTime siparisTarihi;
    private double faturaToplami=0;

    public Fatura(Siparis siparis) {
        this.siparis=siparis;
    }

    public double toplamTutariHesapla(){
        for(SiparisKalemi siparisKalemi:siparis.getSiparisKalemleri())
            faturaToplami+=siparisKalemi.araToplam()*1.18;
        return faturaToplami;
    }

    public String faturaOlustur(){


        String faturaXML="<XML>"+this.toString();

       /* JsonObject faturaJSON = Json.createObjectBuilder().add("siparisNo", this.siparis.getSiparisNo())
                .add("siparisTarihi", this.siparis.getSiparisTarihi().toString())
                .add("toplam", siparis.getGenelToplam())
                .build();
*/
        /*JsonObject fatura = Json.createObjectBuilder().add("siparisNo", this.siparis.getSiparisNo())
                .add("siparisTarihi", this.siparis.getSiparisTarihi())
                .add("toplam", siparis.getGenelToplam())
                *//*.add("x",
                        Json.createObjectBuilder().add("a", "b")
                                .add("c", "d")
                                .build()
                )*//*
                .build();*/
      //return faturaJSON.toString();
        return faturaXML;

    }

    public void faturaDepola(){

        System.out.println("PostgreSQL veritabanına bağlandı");
        System.out.println("faturayı sakla");
        System.out.println("bağlantıyı sonlandır");

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
