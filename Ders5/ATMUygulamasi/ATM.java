package cc.ders3.myatm;



public class ATM
{

	private boolean userAuthenticated;
	private IEkran ekran;
	private ITusTakimi tusTakimi;
	private IParaBolmesi paraBolmesi;
	private IKartBolmesi kartBolmesi;


	// constants corresponding to main menu options
	private static final int BAKIYE_GORUNTULE = 1;
	private static final int PARA_CEKME = 2;
	private static final int PARA_YATIRMA = 3;
	private static final int CIKIS = 4;



	public ATM() 
	{	userAuthenticated=false;
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
				//bankaBilgiSistemi.hesapGuncelle(kullaniciHesabi);
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

	/*public void	run()
	{

		while (!userAuthenticated)
		{
			screen.displayMessage("Hoş Geldiniz...");

			authenticateUser();
		}

		performTransection();


	}

	private void authenticateUser()
	{
		screen.displayMessage("Hesap No:");
		int accountNumber=keypad.getInput();
		screen.displayMessage("PIN:");
		int pin=keypad.getInput();
		bd=new BankDatabase();	
		userAuthenticated=bd.authenticateUser(accountNumber,pin);
		if(!userAuthenticated)
			screen.displayMessage("gecersiz hesapno ya da pn yeniden deneyiniz");

	}

	private void performTransection()
	{	Transaction currentTransaction=null;
		boolean userExited=false;
		while(!userExited)
		{
			int mainMenuSelection=displayMainMenu();
	
			switch(mainMenuSelection)
			{
			case BALANCE_INQUIRY: 
			case WITHDRAWAL: 
			case DEPOSIT:
	
				// initialize as new object of chosen type
				currentTransaction = createTransaction( mainMenuSelection );
	
				currentTransaction.execute(); // execute transaction
				break; 
			case EXIT:
				screen.displayMessage("Çıkılıyor");
				userExited=true;
				break;
			default:
				screen.displayMessage("1-4 arası değer giriniz...");		
			}
	
		}
	}

	private Transaction createTransaction( int type )
	{
		Transaction temp = null; // temporary Transaction variable

		// determine which type of Transaction to create     
		switch ( type )
		{
			case BALANCE_INQUIRY: // create new BalanceInquiry transaction
				temp = new BalanceInquiry(bd,screen);break;
			case WITHDRAWAL: // create new Withdrawal transaction
				temp = new Withdrawal(bd,screen,keypad);break;
				
			case DEPOSIT: // create new Deposit transaction
				temp = new Deposit(bd,screen,keypad);break;
		} // end switch

		return temp; // return the newly created object
	} // end method createTransaction	

	private int displayMainMenu()
	{
		//	screen.cls();
		screen.displayMessage("Ana Menu");
		screen.displayMessage("1-Hesap Görüntüle");
		screen.displayMessage("2-Para Cek");
		screen.displayMessage("3-Para Yatir");
		screen.displayMessage("4-Cikis");
		screen.displayMessage("Seciminiz:");
		return keypad.getInput();
	}*/


}
