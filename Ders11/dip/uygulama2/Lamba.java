package cc.ders10.dip.uygulama2;

public class Lamba implements IAnahtarlanabilir {

    @Override
    public void ac(){
        System.out.println("ışık yanıyor");
    }

    @Override
    public void kapat(){
        System.out.println("ışık kapandı");
    }
}
