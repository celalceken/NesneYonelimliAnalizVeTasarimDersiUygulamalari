package cc.nyat.ders12.decorator.uygulama1;

class Dikdortgen implements ISekil {
    private int genislik;
    private int yukseklik;

    public Dikdortgen(int genislik, int yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    @Override
    public void ciz() {
        System.out.println("Dikdörtgen çiziliyor ( "+ genislik +" X "+ yukseklik +" cm)" );
    }
}
