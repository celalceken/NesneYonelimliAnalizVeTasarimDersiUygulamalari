package cc.ders10.lsp.uygulama1;

public class Uygulama {
    public static void main(String[] args){
        AlanHesaplayici alanHesaplayici=new AlanHesaplayici();
        //Dikdortgen dikdortgen=new Dikdortgen();
        Dikdortgen kare=new Kare();

        //System.out.println(alanHesaplayici.alanHesapla(dikdortgen));
        System.out.println(alanHesaplayici.alanHesapla(kare));

    }
}
