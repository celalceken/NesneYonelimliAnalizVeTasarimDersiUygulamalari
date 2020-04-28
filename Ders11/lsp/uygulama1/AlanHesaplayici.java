package cc.ders10.lsp.uygulama1;

public class AlanHesaplayici {

    public double alanHesapla(Dikdortgen dikdortgen){
        dikdortgen.setYukseklik(8);
        dikdortgen.setGenislik(7);
        return dikdortgen.alanHesapla();
    }
}
