package cc.ders12.abstractfactory;

public class Uygulama {
    public static void main(String args[]){

        AbstractGUIFactory pf;

        String sistem="ubuntu"; //"Config" dosyasından okunur.
        if(sistem.equalsIgnoreCase("ubuntu"))
            pf=new UbuntuFactory();
        else
            pf=new AndroidFactory();

        IstemciModulForm form=new IstemciModulForm(pf);
        form.basla("Form Oluşturuldu");
    }
}