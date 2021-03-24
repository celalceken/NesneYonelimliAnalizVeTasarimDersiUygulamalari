package cc.ders7.atm;

public class KullaniciHesabi
{
	private int hesapNumarasi;
	private double bakiye;
	private Musteri musteri;

	public KullaniciHesabi(int hesapNumarasi, double bakiye, String adi, String soyadi) {
		this.hesapNumarasi=hesapNumarasi;
		this.bakiye = bakiye;
		this.musteri=new Musteri(adi, soyadi);
	}

	public int getHesapNumarasi() {
		return hesapNumarasi;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
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
