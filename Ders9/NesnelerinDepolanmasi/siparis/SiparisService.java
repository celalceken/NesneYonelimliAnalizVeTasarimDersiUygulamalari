package cc.ders9.nesnelerindepolanmasi.siparis;

public class SiparisService {
    private ISiparisRepository siparisRepository;

    public SiparisService(ISiparisRepository siparisRepository) {
        this.siparisRepository = siparisRepository;
    }

    public void siparisiKaydet(Siparis siparis){
        System.out.println("sipariş kaydediliyor");
        siparisRepository.siparisiKaydet(siparis);
    }

}
