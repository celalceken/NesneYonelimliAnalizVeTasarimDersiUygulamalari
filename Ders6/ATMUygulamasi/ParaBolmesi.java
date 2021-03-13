package cc.ders7.atm;

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
