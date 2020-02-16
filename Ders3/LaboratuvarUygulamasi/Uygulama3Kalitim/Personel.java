package ders1.uygulama3;

public class Personel {
        private String ad;
        private int tc;
        public Personel(String ad,int tc)
        {
            this.setAd(ad);
            this.setTc(tc);
        }
        public String getAd() {
            return ad;
        }
        public void setAd(String ad) {
            this.ad = ad;
        }
        public int getTc() {
            return tc;
        }
        public void setTc(int tc) {
            this.tc = tc;
        }
        public String print()
        {
            return "ad : "+getAd()+"\ntc : "+getTc();
        }
    }




