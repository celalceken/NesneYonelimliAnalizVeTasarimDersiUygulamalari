package cc.ders7.atm.veritabani;

/***** Veritabanı sürücüsü *****/
import java.sql.*;

public class Uygulama {

    public static void main(String[] args)
    {
        try
        {   /***** Bağlantı kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ATM",
                    "postgres", "LecturePassword");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");


            String sql= "SELECT *  FROM \"Musteri\"";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            /***** Bağlantı sonlandırma *****/
            conn.close();

            int musteriNo;
            String adi;
            String soyadi;

            while(rs.next())
            {
                /***** Kayda ait alan değerlerini değişkene ata *****/
                musteriNo  = rs.getInt("id");
                adi = rs.getString("adi");
                soyadi = rs.getString("soyadi");

                /***** Ekrana yazdır *****/
                System.out.print("Sıra No:"+ musteriNo);
                System.out.print(", Adı:" + adi);
                System.out.println(", Soyadı:" + soyadi);
            }

            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
