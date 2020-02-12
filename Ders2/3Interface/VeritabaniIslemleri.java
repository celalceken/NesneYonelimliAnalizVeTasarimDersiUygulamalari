/*
*  Program to interface, not implementation
* Modülü kodlarken arayüzler yerine gerçeklemelerin kullanılması durumunda;
* i )değişiklik (yeni özellik ekleme) istendiğinde istemci kodu değiştirmek gerekir
* i) modüldeki değişiklik istemciyi etkileyebilir
* ii)test yazmak zorlaşır
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
