package cc.ders2.arayuz;

public class MySQLSurucu implements VeritabaniSurucu {

    @Override
    public void baglan() {
        System.out.println("MySQL veritabanına bağlanıyor...");
    }

    @Override
    public void sorguCalistir() {
        System.out.println("MySQL sorgusu çalıştırılıyor...");
    }

    @Override
    public void baglantiSonlandir() {

        System.out.println("MySQL veritabanı bağlantısı sonlandırılıyor...");

    }
}