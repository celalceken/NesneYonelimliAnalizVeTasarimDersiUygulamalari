package cc.ders12.facade.uygulama1.siparis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UrunPostgreSQLSurucu implements IUrunVeritabaniServisi {



    public List<Urun> urunListele() {

        System.out.println("veritabanına bağlandı ve ürünleri sorguluyor...");
        List<Urun> urunler=new ArrayList<Urun>();

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ETicaret",
                    "postgres", "LecturePassword");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");



            String sql= "SELECT *  FROM \"Urun\"";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //***** Bağlantı sonlandırma *****
            conn.close();

            int urunNo;
            String adi;
            int birimFiyati;
            int stokMiktari;

            String soyadi;

            while(rs.next())
            {
                urunNo  = rs.getInt("urunNo");
                adi = rs.getString("adi");
                birimFiyati  = rs.getInt("birimFiyati");
                stokMiktari  = rs.getInt("stokMiktari");

                urunler.add(new Urun(urunNo, adi, birimFiyati, stokMiktari));
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return urunler;
    }

}
