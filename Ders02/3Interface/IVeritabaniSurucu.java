/*
* Bir sınıfın yapmasını istediklerimizi belirtmek için kullanırız.
* Ne yapması gerektiği belirtilir, nasıl ile ilgilenilmez.
* Bu sayede:
* i) istemci kod, gerçekleme kısmındaki değişikliklerden etkilenmez
* ii)gerçeklemeler henüz ortada yokken istemci kod içerisinde
* kullanılabilir (Yeni özellik eklendiğinde istemci kod değiştirilmez)
* iii) gerçekleme ve istemci modüller aynı anda farklı kodlayıcılar tarafından
* oluşturulabilir (takım çalışması)
* Dependency inversion ve open-closed prensipleriyle ilgilidir.
*
* */

package cc.ders2.arayuz;

interface IVeritabaniSurucu {

    public void baglan();
    public void sorguCalistir();
    public void baglantiSonlandir();
}

