package cc.ders2.arayuz;

public class VeritabaniUygulamasi{

    public static void main(String args[]){
        VeritabaniSurucu veritabaniSurucu= new PostgreSQLSurucu();
        VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri(veritabaniSurucu);

        veritabaniIslemleri.baglan();
        veritabaniIslemleri.ekle();
        veritabaniIslemleri.sil();
        veritabaniIslemleri.güncelle();
        veritabaniIslemleri.listele();
        veritabaniIslemleri.baglantiSonlandir();

    }

}
