package cc.ders12.observer;


public class KullaniciHesabi
{
	private int hesapNumarasi;
	private double bakiye;
	ISubject publisher;


	public KullaniciHesabi(int hesapNumarasi, double bakiye, ISubject publisher) {
		this.hesapNumarasi=hesapNumarasi;
		this.bakiye = bakiye;
		this.publisher = publisher;
	}

	public int getHesapNumarasi() {
		return hesapNumarasi;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
		publisher.notify("{\"hesapNo\":"+this.hesapNumarasi+",\"bakiye\":"+bakiye+"}");
	}

}
