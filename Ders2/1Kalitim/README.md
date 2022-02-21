# Kalıtım
> - Sınıfların diğer sınıflardan oluşturulabilmesine ve böylece kod tekrarının önüne geçilebilmesine imkan verir.
> 
> - Benzer varlıklar arasında olmalıdır. “is a” , “is kind of”
> 
> - Türetilmiş sınıf (Derived class) Temel Sınıfın (base class)  üyelerine kalıtım yoluyla sahip olur.
> 
> - Kod tekrar kullanımı sağlanır


* Uygulamayı çalıştırmak için

```console
Orka:~ nyat$ javac -d .  KalitimUygulamasi.java Sekil.java Daire.java Dikdortgen.java EskenarUcgen.java 
Orka:~ nyat$ java cc.ders2.kalitim.KalitimUygulamasi


Merhaba dünya
Yarıçapı giriniz 4
konumu = (20.0,20.0) - rengi= mavi
konumu = (30.0,50.0) - rengi= mavi
30.0
```

* Uygulamanın sınıf şeması



![](https://github.com/celalceken/NesneYonelimliAnalizVeTasarimDersiUygulamalari/blob/master/Sekiller/02/SinifSemasi.png)
