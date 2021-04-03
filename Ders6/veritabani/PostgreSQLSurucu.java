package cc.ders7.atm.veritabani;

import cc.ders7.atm.Araclar;
import cc.ders7.atm.IBankaBilgiSistemi;
import cc.ders7.atm.MusteriHesabi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLSurucu implements IBankaBilgiSistemi {

    public MusteriHesabi kullaniciDogrula(int hesapNumarasi, int sifre) {
        MusteriHesabi musteriHesabi =null;

        System.out.println("banka bilgi sistemi kullanıcıyı doğruluyor...");
        Araclar.bekle(2000);
        System.out.println("veritabanına bağlandı (postgresql veritabanı yönetim sistemi) ve kullanıcıyı sorguluyor...");
        Araclar.bekle(2000);

        //veritabani.baglan(hesapNumarasi, sifre);

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ATM",
                    "LectureUser", "LecturePassword");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");


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

                /*System.out.print("Hesap No:"+ hesapNo);
                System.out.print(", Bakiye:" + bakiye);
                System.out.println("Adi:" + adi);
                System.out.println(", Soyadı:" + soyadi);*/

                musteriHesabi = new MusteriHesabi(hesapNo, bakiye, adi, soyadi);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return musteriHesabi;
    }

    public void hesapGuncelle(MusteriHesabi musteriHesabi) {

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ATM",
                    "postgres", "LecturePassword");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");


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
