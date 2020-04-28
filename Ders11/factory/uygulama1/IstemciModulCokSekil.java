package cc.ders12.factory.uygulama1;

public class IstemciModulCokSekil {

    ISekilFactory daireFactory;
    ISekilFactory dikdortgenFactory;

    public IstemciModulCokSekil(ISekilFactory daireFactory, ISekilFactory dikdortgenFactory) {
        this.daireFactory = daireFactory;
        this.dikdortgenFactory = dikdortgenFactory;
    }

    public void basla(){

        ISekil sekil1= daireFactory.factoryMethod();
        System.out.println(sekil1);

        ISekil sekil2= dikdortgenFactory.factoryMethod();
        System.out.println(sekil2);

    }

}
