package cc.ders7.atm;


public class ATM
{
	private IEkran ekran;
	private ITusTakimi tusTakimi;
	private IParaBolmesi paraBolmesi;
	private IKartBolmesi kartBolmesi;


	// ana menu seçenekleri
	private static final int BAKIYE_GORUNTULE = 1;
	private static final int PARA_CEKME = 2;
	private static final int PARA_YATIRMA = 3;
	private static final int CIKIS = 4;



	public ATM() 
	{	
		ekran=new Ekran();
		tusTakimi=new TusTakimi();
		paraBolmesi=new ParaBolmesi();
		kartBolmesi=new KartBolmesi();
	}

	public void basla() {
		ekran.mesajGoruntule("Lütfen kartınızı takınız...");
		if(kartDogrulama()){
			ekran.mesajGoruntule("şifreniz");
			int sifre= tusTakimi.veriAl();
			IBankaBilgiSistemi bankaBilgiSistemi=new BankaBilgiSistemi();
			KullaniciHesabi kullaniciHesabi= kullaniciDogrulama(1, sifre, bankaBilgiSistemi);
			if (kullaniciHesabi!=null){
				ekran.mesajGoruntule(kullaniciHesabi.toString());
				islemSecimi(bankaBilgiSistemi, kullaniciHesabi);
				
			} else{
				ekran.mesajGoruntule("doğrulanamadı");

			}

		} else{
			ekran.mesajGoruntule("Kartınız doğrulanamadı");
			kartBolmesi.kartCikart();
		}



	}
	private boolean kartDogrulama(){
		kartBolmesi.kartAl();
		return kartBolmesi.kartDogrula();
	}

	private KullaniciHesabi kullaniciDogrulama(int hesapNumarasi, int sifre, IBankaBilgiSistemi bankaBilgiSistemi){
		return bankaBilgiSistemi.kullaniciDogrula(hesapNumarasi,sifre);

	}

	private void islemSecimi(IBankaBilgiSistemi bankaBilgiSistemi, KullaniciHesabi kullaniciHesabi){
		int secim;
		 do{
		 	secim=anaMenuyuGoster();
			switch (secim) {
				case BAKIYE_GORUNTULE:
					ekran.mesajGoruntule("bakiyeniz" + kullaniciHesabi.getBakiye());
					break;
				case PARA_CEKME:
					ekran.mesajGoruntule("para çekme işlemini seçtiniz");
					IIslem paraCekme=new ParaCekme(bankaBilgiSistemi, ekran, tusTakimi, kullaniciHesabi, paraBolmesi);
					paraCekme.islemYap();
					break;

				case PARA_YATIRMA:
					ekran.mesajGoruntule("para yatırma");
					break;


				case CIKIS:
					ekran.mesajGoruntule("Çıkılıyor");
					break;
				default:
					ekran.mesajGoruntule("1-4 arasında bir sayı girmelisiniz");
			}
		}while(secim!=4);
	}

	private int anaMenuyuGoster()
	{
		ekran.mesajGoruntule("******************************************");
		ekran.mesajGoruntule("Ana Menu");
		ekran.mesajGoruntule("1-Bakiye Görüntüle");
		ekran.mesajGoruntule("2-Para Çek");
		ekran.mesajGoruntule("3-Para Yatır");
		ekran.mesajGoruntule("4-Cikis");
		ekran.mesajGoruntule("Seciminiz:");
		ekran.mesajGoruntule("******************************************");

		return tusTakimi.veriAl();
	}

}
