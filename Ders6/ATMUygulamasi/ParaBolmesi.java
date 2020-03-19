package cc.ders3.myatm;

public class ParaBolmesi implements IParaBolmesi {

    private int kalanPara;
    public void paraVer() {
        System.out.println("para veriliyor...");
    }

    public void paraAl() {
        System.out.println("para alınıyor...");
    }

    public boolean paraVarmi() {
        return true;
    }
}
