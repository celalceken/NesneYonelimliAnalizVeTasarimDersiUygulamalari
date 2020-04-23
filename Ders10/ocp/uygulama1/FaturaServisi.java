package cc.ders10.ocp.uygulama1;

import javax.json.Json;
import javax.json.JsonObject;

public class FaturaServisi {

    ///*
    public String faturaOlustur(Fatura fatura){

        String faturaXML="<XML>"+fatura.toString();
        return faturaXML;

    }
    //*/
// Yeni özellik eklemek gerektiğinde istemcide (Fatura.faturaYazdir()) de değişiklik yapmak gerekebilir
    /*
    public String faturaOlustur(Fatura fatura, byte tur){
        String faturaCiktisi;
        if(tur==1)
            faturaCiktisi="<XML>"+fatura.toString();
        else {
            JsonObject faturaJSON = Json.createObjectBuilder().add("siparisNo", fatura.getSiparis().getSiparisNo())
                    .add("siparisTarihi", fatura.getSiparis().getSiparisTarihi().toString())
                    .add("toplam", fatura.getSiparis().getGenelToplam())
                    .build();
            faturaCiktisi= faturaJSON.toString();
        }

        return faturaCiktisi;
    }
    */

}
