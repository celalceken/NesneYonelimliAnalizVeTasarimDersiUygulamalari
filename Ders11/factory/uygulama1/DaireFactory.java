package cc.ders12.factory.uygulama1;

public class DaireFactory implements ISekilFactory {

    @Override
    public ISekil factoryMethod(){
        Koordinat koordinat=new Koordinat();
        koordinat.setKonumX(500);
        koordinat.setKonumY(500);
        Daire daire=new Daire();
        daire.setKoordinat(koordinat);
        daire.setYaricap(5);
        return daire;
    }

}
