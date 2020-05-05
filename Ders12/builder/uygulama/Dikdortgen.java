package cc.ders12.builder.uygulama;

public class Dikdortgen {

    private float uzunluk;
    private float genislik;
    private String renk;
    Koordinat koordinat;

    private Dikdortgen(DikdortgenBuilder builder) {

        this.uzunluk = builder.uzunluk;
        this.genislik = builder.genislik;
        this.renk = builder.renk;
        this.koordinat = builder.koordinat;
    }

    public Koordinat getKoordinat() {
        return koordinat;
    }

    public void setKoordinat(Koordinat koordinat) {
        this.koordinat = koordinat;
    }

    public float getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(float uzunluk) {
        this.uzunluk = uzunluk;
    }

    public float getGenislik() {
        return genislik;
    }

    public void setGenislik(float genislik) {
        this.genislik = genislik;
    }

    public double alanHesapla(){
        return this.uzunluk*this.genislik;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                ", renk='" + renk + '\'' +
                ", koordinat=" + koordinat +
                '}';
    }

    public static class DikdortgenBuilder
    {
        private float uzunluk;
        private float genislik;
        private String renk;
        Koordinat koordinat;

        public DikdortgenBuilder(float uzunluk, float genislik) {
            this.uzunluk = uzunluk;
            this.genislik = genislik;
        }
        public DikdortgenBuilder renk (String renk) {
            this.renk = renk;
            return this;
        }
        public DikdortgenBuilder koordinat (int x, int y) {
            this.koordinat = new Koordinat(x,y);
            return this;
        }

        //Return the finally consrcuted Dikdortgen object
        public Dikdortgen build() {

            return new Dikdortgen(this);
        }

    }
}
