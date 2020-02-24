package ders2.uygulama1;

public class YaziciSurucusu implements YaziciArayuzu {

    private YaziciArayuzu yazici;

    public YaziciSurucusu(YaziciArayuzu yazici) {
        this.yazici = yazici;
    }

    public void ac() {
        yazici.ac();
    }

    public void yazdir(String mesaj) {
        yazici.yazdir(mesaj);
    }

    public void kapat() {
        yazici.kapat();
    }
}