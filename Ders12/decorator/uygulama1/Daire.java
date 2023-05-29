package cc.nyat.ders12.decorator.uygulama1;

class Daire implements ISekil {
    private int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public void ciz() {
        System.out.println("Daire çiziliyor ( yarıçapı: " + yaricap+" cm)");
    }
}
