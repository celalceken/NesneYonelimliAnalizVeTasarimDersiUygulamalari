package cc.nyat.ders12.decorator.uygulama1;

public class DecoratorSekilUygulamasi {

    public static void main(String[] args) {

        ISekil dikdortgen1 = new Dikdortgen(10,12);
        dikdortgen1.ciz();

        System.out.println("****************************************");

        ISekil dikdortgen2 = new RenkliDecoratorSekil(new Dikdortgen(10,12), "yesil");
        dikdortgen2.ciz();

        System.out.println("****************************************");

        ISekil dikdortgen3 = new KenarlikliDecoratorSekil(dikdortgen2, 4);
        dikdortgen3.ciz();

        System.out.println("****************************************");

        ISekil daire1 = new RenkliDecoratorSekil(new Daire(10), "mavi");
        daire1.ciz();

        ISekil daire2 =new KenarlikliDecoratorSekil (new RenkliDecoratorSekil(new Daire(10), "mavi"),5);
        daire2.ciz();

    }
}
