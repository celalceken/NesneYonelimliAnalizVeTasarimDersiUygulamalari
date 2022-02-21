# Çok biçimlilik (Polymorphism)
> - Bir modülün duruma göre farklı biçimlerde davranabilmesi özelliğidir.
> - Kalıtımla yakından ilgilidir. Temel sınıfın kullanıldığı yerlerde alt sınıflarında kullanılabilmesini ifade eder.
> - Yöntemlerin aşırı yüklenmesi de çok biçimlilik (statik) örneğidir.
> - Aynı istemci kodun farklı modüller için kullanılabilmesini sağlar. 


* Uygulamayı çalıştırmak için

```console
Orka:~ nyat$ javac -d .  CokBicimlilikUygulamasi.java Sekil.java Daire.java Dikdortgen.java EskenarUcgen.java 
Orka:~ nyat$ java cc.ders2.cokbicimlilik.CokBicimlilikUygulamasi


Merhaba dünya
Yarıçapı giriniz 4
konumu = (20.0,20.0) - rengi= mavi
konumu = (30.0,50.0) - rengi= mavi
30.0
```

* Uygulamanın sınıf şeması

![](https://github.com/celalceken/NesneYonelimliAnalizVeTasarimDersiUygulamalari/blob/master/Sekiller/02/SinifSemasi.png)
