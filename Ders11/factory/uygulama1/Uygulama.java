
package cc.ders12.factory.uygulama1;

public class Uygulama {
    public static void main(String args[]){
        IstemciModul istemci1=new IstemciModul(new DikdortgenFactory());
        IstemciModul istemci2=new IstemciModul(new DaireFactory());
        istemci1.basla();
        istemci2.basla();

        /*******Çok şekil kullanan istemci modül****/
        System.out.println("çok şekil içeren istemci");
        IstemciModulCokSekil cokSekilIcerenIstemci=new IstemciModulCokSekil(new DaireFactory(),new DikdortgenFactory());
        cokSekilIcerenIstemci.basla();

    }
}
