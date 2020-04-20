package cc.ders10.ocp.uygulama2;


public class FaturaOlusturXML implements IFaturaOlustur {

    public String faturaOlustur(Fatura fatura){

        String faturaXML="<XML>"+fatura.toString();
        return faturaXML;

    }

}
