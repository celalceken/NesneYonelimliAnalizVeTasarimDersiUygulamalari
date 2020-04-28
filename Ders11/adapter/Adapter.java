package cc.ders12.adapter;

import javax.json.Json;
import javax.json.JsonObject;

public class Adapter implements ITarget {

    FaturaServisi faturaServisi;

    public Adapter(FaturaServisi faturaServisi) {
        this.faturaServisi = faturaServisi;
    }


// Faturayı CSV formatında olıp JSON formatına dönüştürüyor.
    public String faturaOlusturJSON(Fatura fatura) {
        //conversion logic
        String faturaCiktisi=this.faturaServisi.faturaOlustur( fatura);
        String [] arrayStr=faturaCiktisi.split(",");

                JsonObject istenenFormat = Json.createObjectBuilder().add("siparisNo", arrayStr[0])
                .add("siparisTarihi", arrayStr[1])
                .add("toplam", arrayStr[2])
                .build();

        return istenenFormat.toString();
    }
}
