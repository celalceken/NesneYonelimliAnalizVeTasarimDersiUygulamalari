package cc.ders7.atm;

public abstract class Islem {

    protected final IEkran ekran;
    protected final ITusTakimi tusTakimi;
    protected final IBankaBilgiSistemi bankaBilgiSistemi;
    protected final MusteriHesabi musteriHesabi;

    protected Islem(IEkran ekran, ITusTakimi tusTakimi, IBankaBilgiSistemi bankaBilgiSistemi, MusteriHesabi musteriHesabi) {
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.bankaBilgiSistemi = bankaBilgiSistemi;
        this.musteriHesabi = musteriHesabi;
    }

    public abstract void islemYap();
}
