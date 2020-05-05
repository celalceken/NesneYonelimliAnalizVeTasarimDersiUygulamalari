package cc.ders12.iterator;

public class Uygulama {
    public static void main(String[] args) {
        PersonelCollection personelCollection = new PersonelCollection();
        personelCollection.getPersonelListesi().add(new Personel("Ayşe","Çelik",1,"Bilgi İşlem"));
        personelCollection.getPersonelListesi().add(new Personel("Mert","Yorulmaz",2,"İK"));
        personelCollection.getPersonelListesi().add(new Personel("Mehmet","Zorlu",3,"PB"));
        personelCollection.getPersonelListesi().add(new Personel("Aylin","Şener",4,"İK"));

        Personel geciciPersonel;


        // İstemci kod
        for(IIterator iter = personelCollection.getIterator(); iter.hasNext();){
            geciciPersonel = (Personel)iter.next();
            System.out.println(geciciPersonel);
        }
    }

}
