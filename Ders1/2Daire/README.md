
# Kapsülleme (Encapsulation)

* Veri ve bu veriyi kullanan yöntemlerin tek bir yapı (sınıf) içerisinde yer almasını ifade eder. 
* Nesnenin içerisinde yer alan ayrıntıların diğer nesnelerden gizlenmesini sağlar.
* Veri ve bu veriyi kullanan yöntemler bir araya gelerek sınıf oluştururlar. Dışarıdan doğrudan erişilmesi istenmediği için verinin erişim düzeyi "private" yapılır. Nesneler "public" yöntemlerle iletişim kurabilirler. Böylece;
  * Karmaşık problemler parçalara ayrılmış olur. Her parça bağımsız geliştirilebilir. 
  * Nesnede yapılacak değişikliklerin diğer nesneleri etkilemesi önlenmiş olur.
  * modüllerin başka projelerde ya da projenin farklı yerlerde tekrar kullanımı (code reuse) artar.
  * Uygulamayı test etmek kolaylaşır.

## Çalışma Soruları

* Örnek uygulamada kullanılan daire nesnesinin etiket (String) bilgisinin de bulunması gerekiyor. Yapıcı, set, get ve toString yöntemlerinde gerekli güncellemeleri yapınız.
* main yöntemi içerisinde daire nesnesi oluşturarak tüm yöntemlerin kullanılmasını sağlayınız.
