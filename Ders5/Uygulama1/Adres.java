package cc.ders5;

public class Adres {

    private String adresSatiri;
    private String il;

    public Adres(String adresSatiri, String il) {
        this.adresSatiri = adresSatiri;
        this.il = il;
    }

    public String getAdresSatiri() {
        return adresSatiri;
    }

    public void setAdresSatiri(String adresSatiri) {
        this.adresSatiri = adresSatiri;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "adresSatiri='" + adresSatiri + '\'' +
                ", il='" + il + '\'' +
                '}';
    }
}