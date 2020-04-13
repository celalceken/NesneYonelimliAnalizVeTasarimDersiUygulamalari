package cc.ders9.nesnelerindepolanmasi.siparis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class SiparisPostgreSQLSurucu implements ISiparisVeritabaniServisi {
    @Override
    public void siparisiKaydet(Siparis siparis) {

        List<SiparisKalemi> siparisKalemleri=siparis.getSiparisKalemleri();

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ETicaret",
                    "postgres", "LecturePassword");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");

            // Siparis bilgilerini Siparis tablosuna ekle
            String sql= "INSERT INTO  \"Siparis\" (\"siparisNo\",\"musteriNo\") VALUES("+siparis.getSiparisNo()+",1) ";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            for(SiparisKalemi siparisKalemi:siparisKalemleri) {
                //System.out.println("VT den:" + siparis.getSiparisNo() + "-" + siparisKalemi.getUrun().getUrunNo() + "-" + siparisKalemi.getSiparisBirimFiyati() + "-" + siparisKalemi.getMiktar());
                // Siparis Kalemlerini  SiparisKalemi tablosuna ekle
                sql= "INSERT INTO  \"SiparisKalemi\" (\"siparisNo\",\"urunNo\",\"siparisBirimFiyati\",\"miktar\" ) VALUES("+siparis.getSiparisNo()+","+siparisKalemi.getUrun().getUrunNo()+","+siparisKalemi.getSiparisBirimFiyati()+","+siparisKalemi.getMiktar()+") ";

                stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            }
            //***** Bağlantı sonlandırma *****
            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
