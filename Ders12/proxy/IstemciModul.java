package cc.ders12.proxy;
//Web Tarayıcı
public class IstemciModul {

    IInternetBaglantisi internetBaglantisi;

    public IstemciModul(IInternetBaglantisi internetBaglantisi) {
        this.internetBaglantisi = internetBaglantisi;
    }

    public void interneteBaglan(String url){
        System.out.println(internetBaglantisi.baglan(url));
    }

}
