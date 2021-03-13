package cc.ders7.atm;

public class KullaniciHesabi
{
	private double bakiye;
	private Musteri musteri;

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public KullaniciHesabi(int bakiye, Musteri musteri)
	{
		this.bakiye=bakiye;
		this.musteri=musteri;

	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	@Override
	public String toString() {
		return "KullaniciHesabi{" + "adi:"+ musteri.getAd()+"soyadi:"+musteri.getSoyad()+
				"bakiye=" + bakiye +
				'}';
	}
}
