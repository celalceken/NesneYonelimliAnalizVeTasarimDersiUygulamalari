package cc.ders9.nesnelerindepolanmasi.repository;

import java.util.List;

public class UrunService {

    IUrunRepository urunRepository;

    public UrunService(IUrunRepository urunRepository) {
        this.urunRepository = urunRepository;
    }

    public Urun ara(int urunNumarasi) {
        System.out.println("ürün aranıyor...");
        return urunRepository.ara(urunNumarasi);
    }

    public List<Urun> tumUrunler() {
        System.out.println("ürünleri getiriyor...");
        return urunRepository.tumUrunler();
    }

    public void kaydet(Urun urun) {
        System.out.println("ürünü kaydediyor..."+urun);
        urunRepository.kaydet(urun);
    }

    public void sil(int urunNumarasi) {
        System.out.println("ürün siliniyor...");
        urunRepository.sil(urunNumarasi);
    }
}
