package cc.ders2.arayuz;

public class PostgreSQLSurucu implements IVeritabaniSurucu {

    public void baglan() {
        System.out.println("PostgreSQL veritabanına bağlanıyor...");
    }

    public void sorguCalistir() {
        System.out.println("PostgreSQL sorgusu çalıştırılıyor...");
    }

    public void baglantiSonlandir() {

        System.out.println("PostgreSQL veritabanı bağlantısı sonlandırılıyor...");

    }
}
