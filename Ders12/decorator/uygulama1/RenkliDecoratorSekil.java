package cc.nyat.ders12.decorator.uygulama1;

class RenkliDecoratorSekil implements ISekil {
    private ISekil sekil;
    private String renk;

    public RenkliDecoratorSekil(ISekil sekil, String renk) {
        this.sekil = sekil;
        this.renk = renk;
    }

    @Override
    public void ciz() {
        sekil.ciz();
        System.out.println("Çizilen şeklin rengi: " + renk);
    }
}
