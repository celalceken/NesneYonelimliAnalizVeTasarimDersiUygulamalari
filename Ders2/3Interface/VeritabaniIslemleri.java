/*
* "Program to interface, not implementation"
* Bu modül (istemci kod) veritabanı işlemlerini gerçekleştirmek üzere PostgreSQL, MySQL vb.
* gerçeklemeleri kullanmak yerine "VeritabaniSurucu" arayüzünü kullanıyor.
* böylece veritabanı işlemlerinin nasıl yapılacağını tanımlayan gerçeklemeler yerine
* ne yapılması gerektiğini söyleyen arayüzü kullanarak kodlama yapılıyor.
* Bu sayede:
* i )değişiklik  istendiğinde istemci kod değiştirilmiyor
* ii) gerçekleme kısmında yapılacak değişiklik istemci kodu etkilemiyor.
* iii) gerçeklemeler henüz ortada yokken arayüzler istemci kod içerisinde kullanılabilir.
*       Takım çalışması, yeni özelliklerin kolayca eklenebilmesi.
*
* */
package cc.ders2.arayuz;

public  class VeritabaniIslemleri {

    private VeritabaniSurucu veritabani;
    //private PostgreSQLSurucu veritabani; // her farklı vt sürücü için burayı değiştirmek gerekir

    public VeritabaniIslemleri(VeritabaniSurucu veritabani) {
        this.veritabani = veritabani;
    }

    // her farklı vt sürücü için burayı değiştirmek gerekir
   /* public VeritabaniIslemleri(PostgreSQLSurucu veritabani) {
        this.veritabani = veritabani;
    }*/

    public void baglan(){
        veritabani.baglan();
    }
    public void ekle(){
        System.out.println("Ekleme işlemi yapılıyor....");
        veritabani.sorguCalistir();
    }

    public void sil(){
        System.out.println("Silme işlemi yapılıyor....");
        veritabani.sorguCalistir();
    }

    public void güncelle(){
        System.out.println("Güncelleme işlemi yapılıyor....");
        veritabani.sorguCalistir();
    }
    public void listele(){
        System.out.println("Listeleme işlemi yapılıyor....");
        veritabani.sorguCalistir();
    }
    public void baglantiSonlandir(){
        veritabani.baglantiSonlandir();
    }



}
