package cc.ders7.atm;

public interface IParaBolmesi {
    public void paraVer(int tutar);
    public void paraAl(int tutar);
    public boolean paraVarmi();
    public boolean yeterliParaVarmi(int cekilecekTutar);
    public boolean alinanParaGecerlimi();
    public boolean paraBolmedenAlindimi();

    //public boolean alinanParaEksikmi();

}
