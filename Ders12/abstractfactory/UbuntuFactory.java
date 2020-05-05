package cc.ders12.abstractfactory;

class UbuntuFactory implements AbstractGUIFactory{
    public IButon butonOlustur(){
        return new UbuntuButon("UbuntuButon");
    }
    public IMetinKutusu metinKutusuOlustur(){
        return new UbuntuMetinKutusu("UbuntuMetinKutusu");
    }
}
