package cc.ders12.proxy;

import cc.ders9.nesnelerindepolanmasi.siparis.Urun;

import java.util.ArrayList;
import java.util.List;

public class InternetBaglantisiProxy implements IInternetBaglantisi {

    private InternetBaglantisi gercekInternetBaglantisi;

    public List<String> engellenenSiteler=new ArrayList<String>();

    public InternetBaglantisiProxy(InternetBaglantisi gercekInternetBaglantisi) {
        this.gercekInternetBaglantisi = gercekInternetBaglantisi;
    }

    @Override
    public String baglan(String url) {

        String engellenenSite = engellenenSiteler.stream()
                .filter(site -> url.equalsIgnoreCase(site))
                .findAny()
                .orElse(null);
        if(engellenenSite==null)
            return gercekInternetBaglantisi.baglan(url);
        else
            return "İstediğiniz siteye erişim engellenmiştir...";
    }

    public void engellenenSiteEkle(String url){
        engellenenSiteler.add(url);
    }
}
