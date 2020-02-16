package ders1.uygulama3;


public class Ogrenci extends Personel {
    private int okul_no;

    public Ogrenci(String ad,int tc,int okul_no)
    {
        super(ad,tc);
        this.okul_no=okul_no;
    }
    public int getOkul_no() {
        return okul_no;
    }
    public void setOkul_no(int okul_no) {
        this.okul_no = okul_no;
    }
    @Override
    public String print()
    {
        return super.print()+"\nokul no : "+getOkul_no();
    }
}

