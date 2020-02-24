# Uygulama Geliştirme Ortamının Oluşturulması
  * https://www.youtube.com/watch?v=XpJElFJdQb0

# Java İle Uygulama Geliştirme

Java programlama dilinin temellerini öğrenmek için kullanabileceğiniz kaynaklar:
* http://www.w3schools.com/java/ 
* https://docs.oracle.com/javase/tutorial/index.html

## Java Teknolojisi

* https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html

## İlk Uygulama

* https://docs.oracle.com/javase/tutorial/getStarted/cupojava/index.html
* Java uygulamaları geliştirebilmek için Java Development Kit (JDK) yazılımını kurmalısınız. Bu yazılımı indirmek için aşağıdaki adresi kullanınız:
* * https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html

```java
/**
* IlkUygulama.java olarak kaydedilmeli.
*
*/
public class IlkUygulama 
{
    public static void main(String[] s) {
        System.out.println("Merhaba Dünya");
    }
}
```

```console
Orka:~ nyat$ javac IlkUygulama.java # Derleme
Orka:~ nyat$ java IlkUygulama       # Çalıştırma
Merhaba Dünya

```
