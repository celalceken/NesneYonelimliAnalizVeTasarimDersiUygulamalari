package cc.ders10.dip.uygulama2;

public class Uygulama {
    public static void main(String[] args){

        //IAnahtarlanabilir cihaz=new Lamba();
        IAnahtarlanabilir cihaz=new Kapı();
        Buton buton=new Buton(cihaz);

        buton.ac();
        buton.kapat();

    }
}

