package cc.ders12.factory.uygulama1;

public class IstemciModul {

    ISekilFactory sekilFactory;

    public IstemciModul(ISekilFactory sekilFactory) {
        this.sekilFactory = sekilFactory;
    }

    public void basla(){

        ISekil sekil1= sekilFactory.factoryMethod();
        System.out.println(sekil1);

        ISekil sekil2= sekilFactory.factoryMethod();
        System.out.println(sekil2);

    }

}
