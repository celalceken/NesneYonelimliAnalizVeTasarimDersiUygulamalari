package cc.ders12.singleton;

public class Uygulama {
    public static void main(String [] args){
            LogYoneticisi.getInstance("Log.txt").dosyayaYaz("[WARNING]:uyari mesajı 1");
    }
}
