# Interface (Arayüz)
>  - Bir sınıfın yapmasını istediklerimizi belirtmek için kullanırız ("is capable of")
>  - Ne yapması gerektiği belirtilir, nasıl ile ilgilenilmez.
>  - Arayüzler sayesinde:
>    - istemci kod, gerçekleme kısmındaki değişikliklerden etkilenmez
>    - gerçeklemeler henüz ortada yokken istemci kod içerisinde kullanılabilir (Yeni özellik eklendiğinde istemci kod değiştirilmez)
>    - gereçekleme ve istemci modüller aynı anda farklı kodlayıcılar tarafından
oluşturulabilir (takım çalışması)

* Uygulamayı çalıştırmak için


```console
Orka:~ nyat$ javac -d . VeritabaniUygulamasi.java VeritabaniIslemleri.java VeritabaniSurucu.java PostgreSQLSurucu.java MySQLSurucu.java 
 
Orka:~ nyat$ java cc.ders2.arayuz.VeritabaniUygulamasi


Merhaba dünya
Yarıçapı giriniz 4
konumu = (20.0,20.0) - rengi= mavi
konumu = (30.0,50.0) - rengi= mavi
30.0
```

* Uygulamanın sınıf şeması

![](https://github.com/celalceken/NesneYonelimliAnalizVeTasarimDersiUygulamalari/blob/master/Sekiller/02/Interface.png)
