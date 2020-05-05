package cc.ders12.proxy;

import java.util.ArrayList;
import java.util.List;

public class Uygulama {
    public static void main(String [] args){

        InternetBaglantisi gercekInternetBaglantisi=new InternetBaglantisi();
        InternetBaglantisiProxy internetBaglantisiProxy=new InternetBaglantisiProxy(gercekInternetBaglantisi);

        internetBaglantisiProxy.engellenenSiteEkle("www.xyz.com");
        internetBaglantisiProxy.engellenenSiteEkle("www.abc.com");
        internetBaglantisiProxy.engellenenSiteEkle("www.def.com");



        IstemciModul istemciModul=new IstemciModul(internetBaglantisiProxy);
        istemciModul.interneteBaglan("www.xz.com");


    }
}
