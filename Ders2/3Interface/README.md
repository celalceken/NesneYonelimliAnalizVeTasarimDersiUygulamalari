# Interface (Arayüz)
> - Bir sınıfın yapmasını istediklerimizi belirtmek için kullanırız ("is capable of")
> - Ne yapması gerektiği belirtilir, nasıl ile ilgilenilmez.
> - Arayüzler sayesinde:
>   - gerçeklemeler(sınıflar) henüz ortada yok iken istemci kod içerisinde kullanılabilir 
>     - gereçekleme ve istemci modüller aynı anda farklı kodlayıcılar tarafından oluşturulabilir (takım çalışması)
>   - yeni özellik eklendiğinde istemci kod değiştirilmez (sözleşme yapılır)
>   - istemci kod, gerçekleme kısmındaki değişikliklerden etkilenmez (bağımlılığın zayıflatılması)
>   - aynı istemci kod farklı modüller tarafından defalarca kullanılabilir (kod tekrar kullanımı-code reuse)


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

## Çalışma Soruları

* MongoDB sürücüsünün de gerçeklemesini  yaparak istemci kod içerisinde kullanılmasını sağlayınız.

***

<p align="center"> Uygulamanın sınıf şeması </>

![](https://github.com/celalceken/NesneYonelimliAnalizVeTasarimDersiUygulamalari/blob/master/Sekiller/02/Interface2.png)


