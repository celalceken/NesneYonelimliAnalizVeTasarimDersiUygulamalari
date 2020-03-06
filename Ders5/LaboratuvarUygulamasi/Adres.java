package ders3.uygulama1;

public class Adres {

    private String adresSatiri;
    private String adresSatiri2;
    private String il;

    public String getAdresSatiri() {
        return adresSatiri;
    }

    public String getAdresSatiri2() {
        return adresSatiri2;
    }

    public String getIl() {
        return il;
    }

    public void setAdresSatiri(String adresSatiri) {
        this.adresSatiri = adresSatiri;
    }

    public void setAdresSatiri2(String adresSatiri2) {
        this.adresSatiri2 = adresSatiri2;
    }

    public void setIl(String il) { this.il = il;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "adresSatiri='" + adresSatiri + '\'' +
                ", adresSatiri2='" + adresSatiri2 + '\'' +
                ", il='" + il + '\'' +
                '}';
    }
}