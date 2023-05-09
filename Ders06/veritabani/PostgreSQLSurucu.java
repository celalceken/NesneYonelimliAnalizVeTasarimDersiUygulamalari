package cc.ders7.atm.veritabani;

import cc.ders7.atm.Araclar;
import cc.ders7.atm.IVeritabaniRepository;
import cc.ders7.atm.MusteriHesabi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLSurucu implements IVeritabaniRepository {

    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ATM",
                    "postgres", "LecturePassword");

            System.out.println("Veritabanına bağlandı!");

        } catch (Exception e) {
            System.out.println("Bağlantı girişimi başarısız!");
            e.printStackTrace();
        }
        return conn;
    }

    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {
        MusteriHesabi musteriHesabi =null;

        System.out.println("banka bilgi sistemi kullanıcıyı doğruluyor...");
        Araclar.bekle(2000);
        System.out.println("veritabanına bağlandı (postgresql veritabanı yönetim sistemi) ve kullanıcıyı sorguluyor...");
        Araclar.bekle(2000);

        Connection conn=this.baglan();

        try
        {

            String sql= "SELECT *  FROM \"MusteriHesabi\" WHERE \"hesapNumarasi\"="+ hesapNumarasi+" AND sifre="+ sifre;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //***** Bağlantı sonlandırma *****
            conn.close();

            int hesapNo;
            double bakiye;
            String adi;
            String soyadi;

            while(rs.next())
            {
                hesapNo  = rs.getInt("hesapNumarasi");
                bakiye = rs.getDouble("bakiye");
                adi = rs.getString("adi");
                soyadi = rs.getString("soyadi");

                musteriHesabi = new MusteriHesabi(hesapNo, bakiye, adi, soyadi);
                System.out.println(musteriHesabi);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return musteriHesabi;
    }

    public void hesapGuncelle(MusteriHesabi musteriHesabi) {

        Connection conn=this.baglan();

        try
        {

            String sql= "UPDATE \"KullaniciHesabi\" SET bakiye="+ musteriHesabi.getBakiye() + "WHERE \"hesapNumarasi\"="+ musteriHesabi.getHesapNumarasi();

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            conn.close();

            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("banka bilgi sistemi hesabı güncelledi...");

    }
}
