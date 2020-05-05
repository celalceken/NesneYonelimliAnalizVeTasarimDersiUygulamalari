package cc.ders12.abstractfactory;


public class IstemciModulForm {

    AbstractGUIFactory factory;

    public IstemciModulForm(AbstractGUIFactory factory) {
        this.factory = factory;
    }

    public void basla(String msg){
        System.out.println(msg);
        IMetinKutusu mk=factory.metinKutusuOlustur();
        IButon buton1=factory.butonOlustur();
        IButon buton2=factory.butonOlustur();
    }
}
