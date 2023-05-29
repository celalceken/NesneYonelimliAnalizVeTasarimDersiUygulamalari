package cc.nyat.ders12.decorator.uygulama1;

class KenarlikliDecoratorSekil implements ISekil {
    private ISekil sekil;
    private int kenarlikKalinligi;

    public KenarlikliDecoratorSekil(ISekil sekil, int kenarlikKalinligi) {
        this.sekil = sekil;
        this.kenarlikKalinligi = kenarlikKalinligi;
    }

    @Override
    public void ciz() {
        sekil.ciz();
        System.out.println("Şeklin kenarlık kalınlığı " + kenarlikKalinligi + "px");
    }
}
