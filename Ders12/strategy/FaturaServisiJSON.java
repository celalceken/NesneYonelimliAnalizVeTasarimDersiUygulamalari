package cc.ders12.strategy;


import javax.json.Json;
import javax.json.JsonObject;

public class FaturaServisiJSON implements IFaturaServisi {

    public String faturaOlustur(Fatura fatura){

        JsonObject faturaJSON = Json.createObjectBuilder().add("siparisNo", fatura.getSiparis().getSiparisNo())
                .add("siparisTarihi", fatura.getSiparis().getSiparisTarihi().toString())
                .add("toplam", fatura.getSiparis().getGenelToplam())
                .build();

        return faturaJSON.toString();
    }

}
