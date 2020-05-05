package cc.ders12.proxy;

public class InternetBaglantisi implements IInternetBaglantisi {
    @Override
    public String baglan(String url) {
        return url+" sitesine baglandı...";
    }
}
