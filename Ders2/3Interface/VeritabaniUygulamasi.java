package cc.ders2.arayuz;

public class VeritabaniUygulamasi{

    public static void main(String args[]){
        IVeritabaniSurucu veritabaniSurucu= new PostgreSQLSurucu();
        //IVeritabaniSurucu veritabaniSurucu= new MySQLSurucu();

        // Dependency injection: nesne dışarıda oluşturulup istemci koda gönderiliyor
        VeritabaniIslemleriRepository veritabaniIslemleri = new VeritabaniIslemleriRepository(veritabaniSurucu);
        
        //Diğer modüller, veritabanı işlemleri için istemci modülün (repository) ilgili yöntemlerini çağırırlar.
        veritabaniIslemleri.baglan();
        veritabaniIslemleri.ekle();
        veritabaniIslemleri.idAra(2);
        veritabaniIslemleri.sil();
        veritabaniIslemleri.güncelle();
        veritabaniIslemleri.listele();
        veritabaniIslemleri.baglantiSonlandir();
    }

}
