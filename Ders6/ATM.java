/**  ATM sınıfı işlemlerin başlatıldığı modüldür.
 *
 * @ author	Celal Çeken
 */
package cc.ders7.atm;

import cc.ders7.atm.veritabani.PostgreSQLSurucu;
import cc.ders7.atm.veritabani.SanalVeritabaniSurucu;

public class ATM
{
	private final IEkran ekran;
	private final ITusTakimi tusTakimi;
	private final IParaBolmesi paraBolmesi;
	private final IKartBolmesi kartBolmesi;

	private static final int BAKIYE_GORUNTULE = 1;
	private static final int PARA_CEKME = 2;
	private static final int PARA_YATIRMA = 3;
	private static final int CIKIS = 4;

	public ATM() {
		ekran=new Ekran();
		tusTakimi=new TusTakimi();
		paraBolmesi=new ParaBolmesi();
		kartBolmesi=new KartBolmesi();
	}

	public void basla() {
		ekran.mesajGoruntule("Lütfen kartınızı bölmeye takınız...");
		Araclar.bekle();
		int hesapNumarasi=this.kartDogrulama();
		if(hesapNumarasi!=0){
			ekran.mesajGoruntule("şifreniz");
			int sifre= tusTakimi.veriAl();
			//IBankaBilgiSistemi bankaBilgiSistemi=new BankaBilgiSistemi(new PostgreSQLSurucu());
			IBankaBilgiSistemi bankaBilgiSistemi=new BankaBilgiSistemi(new SanalVeritabaniSurucu());
			MusteriHesabi musteriHesabi = this.kullaniciDogrula(hesapNumarasi, sifre, bankaBilgiSistemi);
			//MusteriHesabi musteriHesabi = bankaBilgiSistemi.kullaniciDogrula(hesapNumarasi, sifre);
			if (musteriHesabi != null){
				ekran.mesajGoruntule("Kullanıcı doğrulama işlemi başarılı...:"+ musteriHesabi);
				islemSecimi(bankaBilgiSistemi, musteriHesabi);
			} else{
				ekran.mesajGoruntule("hesabınız doğrulanamadı");
				kartBolmesi.kartCikart();
			}
		} else{
			ekran.mesajGoruntule("Kartınız doğrulanamadı");
			kartBolmesi.kartCikart();
		}
	}

	private int kartDogrulama(){
		return kartBolmesi.kartAl();
	}

	private MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre, IBankaBilgiSistemi bankaBilgiSistemi){
		// doğrulanamama durumunda tekrar şifre girilmesi, 3 kez hatalı  ise kartın yutulması
		// işlemleri burada ele alınmalı
		return bankaBilgiSistemi.kullaniciDogrula(hesapNumarasi,sifre);
	}
	private void islemSecimi(IBankaBilgiSistemi bankaBilgiSistemi, MusteriHesabi musteriHesabi){
		int secim;
		 do{
		 	secim=anaMenuyuGoster();
		 	ekran.ekranTemizle();
			switch (secim) {
				case BAKIYE_GORUNTULE:
					Islem bakiyeGoruntuleme=new BakiyeGoruntuleme(ekran, tusTakimi, musteriHesabi);
					bakiyeGoruntuleme.islemYap();
					break;
				case PARA_CEKME:
					Islem paraCekme=new ParaCekme(bankaBilgiSistemi, ekran, tusTakimi, musteriHesabi, paraBolmesi);
					paraCekme.islemYap();
					break;

				case PARA_YATIRMA:
					Islem paraYatirma=new ParaYatirma(bankaBilgiSistemi, ekran, tusTakimi, musteriHesabi, paraBolmesi);
					paraYatirma.islemYap();
					break;

				case CIKIS:
					ekran.mesajGoruntule("Çıkılıyor");
					kartBolmesi.kartCikart();
					break;
				default:
					ekran.mesajGoruntule("1-4 arasında bir sayı girmelisiniz");
			}
		}while(secim!=4);
	}

	private int anaMenuyuGoster()
	{
		ekran.mesajGoruntule("**********************************************");
		ekran.mesajGoruntule("Ana Menu");
		ekran.mesajGoruntule("1-Bakiye Görüntüle");
		ekran.mesajGoruntule("2-Para Çek");
		ekran.mesajGoruntule("3-Para Yatır");
		ekran.mesajGoruntule("4-Cikis");
		ekran.mesajGoruntule("Seciminiz:");
		ekran.mesajGoruntule("**********************************************");
		return tusTakimi.veriAl();
	}
}
