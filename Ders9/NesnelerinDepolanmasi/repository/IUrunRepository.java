package cc.ders9.nesnelerindepolanmasi.repository;

import java.util.List;

public interface IUrunRepository {
    Urun ara(int urunNumarasi);
    List<Urun> tumUrunler();
    void kaydet(Urun urun);
    void sil(int urunNumarasi);
}
