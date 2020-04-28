
package cc.ders12.factory.uygulama2;

// Client
public class Uygulama {
    public static void main(String args[]){
        String sistem="android"; //"Config" dosyasından okunur.
        IButonFactory butonFactory;

        if(sistem.equalsIgnoreCase("ubuntu"))
            butonFactory=new UbuntuButonFactory();
        else
            butonFactory=new AndroidButonFactory();

        IstemciModul mesajKutusu=new IstemciModul(butonFactory);
        mesajKutusu.basla("Seçiminiz");
    }
}
