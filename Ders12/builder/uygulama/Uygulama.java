package cc.ders12.builder.uygulama;

public class Uygulama {

    public static void main(String[] args) {


        //Dikdortgen dikdortgen1 = new Dikdortgen(10,12,"mavi",100,20);
        Dikdortgen dikdortgen1 = new Dikdortgen.DikdortgenBuilder(10,12)
                .renk("mavi")
                .koordinat(100,20)
                .build();

        System.out.println(dikdortgen1);

        //Dikdortgen dikdortgen2 = new Dikdortgen(10,12,"yeşil");
        Dikdortgen dikdortgen2 = new Dikdortgen.DikdortgenBuilder(100,200)
                .renk("yeşil")
                //.koordinat(40,50)
                .build();

        System.out.println(dikdortgen2);

        //Dikdortgen dikdortgen3 = new Dikdortgen(10,12,100,20);
        Dikdortgen dikdortgen3 = new Dikdortgen.DikdortgenBuilder(500,600)
                //.renk("mavi")
                .koordinat(300,320)
                .build();

        System.out.println(dikdortgen3);

        //Dikdortgen dikdortgen4 = new Dikdortgen(10,12,100,20);
        Dikdortgen dikdortgen4 = new Dikdortgen.DikdortgenBuilder(20,100)
                //.renk("mavi")
                //.koordinat(100,20)
                .build();

        System.out.println(dikdortgen4);
    }
}
