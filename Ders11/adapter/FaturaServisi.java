package cc.ders12.adapter;

public class FaturaServisi {

    // Faturayı CSV formatında oluşturuyor...

    public String faturaOlustur(Fatura fatura){

        return fatura.getSiparis().getSiparisNo()+","+fatura.getSiparis().getSiparisTarihi()+","+fatura.getSiparis().getGenelToplam();

    }

}
