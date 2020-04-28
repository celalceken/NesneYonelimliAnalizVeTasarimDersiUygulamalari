package cc.ders12.factory.uygulama2;


public class IstemciModul {

    IButonFactory butonFactory;

    public IstemciModul(IButonFactory butonFactory) {
        this.butonFactory = butonFactory;
    }

    public void basla(String msg){
        System.out.println(msg);
        IButon buton1=butonFactory.factoryMethod();
        IButon buton2=butonFactory.factoryMethod();
    }

}
