package cc.ders12.adapter;

public class IstemciModul {



    public String istemciYontem(Fatura fatura){

        ITarget target=new Adapter(new FaturaServisi());
        return target.faturaOlusturJSON(fatura);

    }


}
