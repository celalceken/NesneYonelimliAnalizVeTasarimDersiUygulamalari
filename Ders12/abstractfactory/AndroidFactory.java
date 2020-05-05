package cc.ders12.abstractfactory;

public class AndroidFactory implements AbstractGUIFactory {
    public IButon butonOlustur(){
        return new AndroidButon("AndroidButon");
    }
    public IMetinKutusu metinKutusuOlustur(){
        return new AndroidMetinKutusu("AndroidMetinKutusu");
    }
}
