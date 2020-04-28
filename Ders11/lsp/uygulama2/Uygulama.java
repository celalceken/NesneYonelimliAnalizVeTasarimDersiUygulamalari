package cc.ders10.lsp.uygulama2;



public class Uygulama {
    public static void main(String[] args){
        AlanHesaplayici alanHesaplayici=new AlanHesaplayici();
        ISekil dikdortgen=new Dikdortgen(8,7);
        //ISekil kare=new Kare(8);

        System.out.println(alanHesaplayici.alanHesapla(dikdortgen));
        //System.out.println(alanHesaplayici.alanHesapla(kare));

    }
}
