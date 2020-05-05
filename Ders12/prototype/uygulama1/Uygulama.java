
package cc.ders12.prototype.uygulama1;

public class Uygulama {

    public static void main(String[] s) throws CloneNotSupportedException {

        Dikdortgen dikdortgen1=new Dikdortgen(100,200,"sarı",3,4);
        Dikdortgen dikdortgen2=dikdortgen1.clone();
        dikdortgen1.setRenk("yeşil");
        dikdortgen1.setGenislik(10);
        System.out.println(dikdortgen1);
        System.out.println(dikdortgen2);

    }
}
