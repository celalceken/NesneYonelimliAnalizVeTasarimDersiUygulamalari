/*
*  "Program to interface, not implementation"
* Bu modül (istemci kod) veritabanı işlemlerini gerçekleştirmek üzere PostgreSQL, MySQL vb.
* gerçeklemeleri kullanmak yerine "VeritabaniSurucu" arayüzünü kullanıyor.
* böylece veritabanı işlemlerinin nasıl yapılacağını tanımlayan gerçeklemeler yerine
* ne yapılması gerektiğini söyleyen arayüzü kullanarak kodlama yapılıyor.
* Bu sayede:
 * i )değişiklik  istendiğinde istemci kod değiştirilmiyor
* ii) gerçekleme kısmında yapılacak değişiklik istemci kodu etkilemiyor.
* iii) gerçeklemeler henüz ortada yokken arayüzler istemci kod içerisinde kullanılabilir.
*       Takım çalışması, yeni özelliklerin kolayca eklenebilmesi.
* iv) istemci kodun tekrar kullanımı sağlanmış olur. Aynı kod postgresql, mysql vb... ile kullanılabilir.
*
* */
package cc.ders2.arayuz;

public  class VeritabaniIslemleriRepository  {

    private IVeritabaniSurucu veritabaniSurucu;
    //private PostgreSQLSurucu veritabani; // her farklı vt sürücü için burayı değiştirmek gerekir

    // Dependency injection: nesne dışarıda oluşturulup istemci koda gönderiliyor
    public VeritabaniIslemleriRepository(IVeritabaniSurucu veritabani) {
        this.veritabaniSurucu = veritabani;
    }

    // her farklı vt sürücü için burayı değiştirmek gerekir
   /* public VeritabaniIslemleriRepository(PostgreSQLSurucu veritabani) {
        this.veritabani = veritabani;
    }*/
    public void ekle(){
        veritabaniSurucu.baglan();
        System.out.println("Ekleme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }

    public void idAra(int id){
        veritabaniSurucu.baglan();
        System.out.println(id+ "nolu kayıt için arama işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }
    public void listele(){
        veritabaniSurucu.baglan();
        System.out.println("Listeleme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }
    public void sil(){
        veritabaniSurucu.baglan();
        System.out.println("Silme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }

    public void güncelle(){
        veritabaniSurucu.baglan();
        System.out.println("Güncelleme işlemi yapılıyor....");
        veritabaniSurucu.sorguCalistir();
        veritabaniSurucu.baglantiSonlandir();
    }
}
