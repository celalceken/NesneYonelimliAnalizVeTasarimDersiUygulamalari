package cc.ders2.arayuz;

public class MySQLSurucu implements IVeritabaniSurucu {

    public void baglan() {
        System.out.println("MySQL veritabanına bağlanıyor...");
    }

    public void sorguCalistir() {
        System.out.println("MySQL sorgusu çalıştırılıyor...");
    }

    public void baglantiSonlandir() {

        System.out.println("MySQL veritabanı bağlantısı sonlandırılıyor...");

    }
}