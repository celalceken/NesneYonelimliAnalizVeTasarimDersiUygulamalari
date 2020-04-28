package cc.ders10.lsp.uygulama1;

public class Kare extends Dikdortgen {

    @Override
    public void setYukseklik(double yukseklik) {
        super.setYukseklik(yukseklik);
        super.setGenislik(yukseklik);
    }

    @Override
    public void setGenislik(double genislik){
        super.setYukseklik(genislik);
        super.setGenislik(genislik);
    }
}
