package cc.ders12.factory.uygulama1;

public class DikdortgenFactory implements ISekilFactory {

    @Override
    public ISekil factoryMethod(){
            //Nesne oluşturmayla ilgili iş mantığı istemciden gizleniyor.
            Koordinat koordinat=new Koordinat();
            koordinat.setKonumX(500);
            koordinat.setKonumY(500);
            Dikdortgen dikdortgen=new Dikdortgen();
            dikdortgen.setKoordinat(koordinat);
            dikdortgen.setGenislik(3);
            dikdortgen.setUzunluk(3);
            return dikdortgen;
    }
}
