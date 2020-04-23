package cc.ders10.srp.uygulama2;

import javax.json.Json;
import javax.json.JsonObject;

public class FaturaServisi {

    public String faturaOlustur(Fatura fatura){

        //String faturaXML="<XML>"+fatura.toString();

      // /*

        JsonObject faturaJSON = Json.createObjectBuilder().add("siparisNo", fatura.getSiparis().getSiparisNo())
                .add("siparisTarihi", fatura.getSiparis().getSiparisTarihi().toString())
                .add("toplam", fatura.getSiparis().getGenelToplam())
                .build();
        //        */

        /*JsonObject fatura = Json.createObjectBuilder().add("siparisNo", this.siparis.getSiparisNo())
                .add("siparisTarihi", this.siparis.getSiparisTarihi())
                .add("toplam", siparis.getGenelToplam())
                *//*.add("x",
                        Json.createObjectBuilder().add("a", "b")
                                .add("c", "d")
                                .build()
                )*//*
                .build();*/
        return faturaJSON.toString();
        //return faturaXML;

    }


}
