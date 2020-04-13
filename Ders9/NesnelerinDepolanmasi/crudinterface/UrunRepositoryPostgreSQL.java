package cc.ders9.nesnelerindepolanmasi.crudinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UrunRepositoryPostgreSQL implements IUrunRepository {

    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ETicaret",
                    "postgres", "LecturePassword");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Urun ara(int urunNumarasi){
        System.out.println("ürün aranıyor...");
        Urun urun=null;

        String sql= "SELECT *  FROM \"Urun\" WHERE \"urunNo\"="+urunNumarasi;

        Connection conn=this.baglan();
        try{
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

                urun=new Urun(urunNo, adi, birimFiyati, stokMiktari);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return urun;
    }



    public List<Urun> tumUrunler(){

        System.out.println("ürünleri getiriyor...");
        List<Urun> urunler=new ArrayList<Urun>();
        String sql= "SELECT *  FROM \"Urun\"";

        Connection conn=this.baglan();

        try{
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


    public void kaydet(Urun urun){
        System.out.println("ürünü kaydediyor..."+urun);
        //String sql= "INSERT INTO  \"Urun\" (\"urunNo\",\"adi\",\"birimFiyati\",\"stokMiktari\") VALUES("+urun.getUrunNo()+",\'"+urun.getAdi()+"\',"+urun.getBirimFiyati()+","+urun.getStokMiktari()+")";

        String sql= "INSERT INTO  \"Urun\" (\"adi\",\"birimFiyati\",\"stokMiktari\") VALUES(\'"+urun.getAdi()+"\',"+urun.getBirimFiyati()+","+urun.getStokMiktari()+")";

        Connection conn=this.baglan();

        try
        {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            //***** Bağlantı sonlandırma *****
            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void sil(int urunNumarasi){
        System.out.println("ürün siliniyor...");

        String sql= "DELETE FROM \"Urun\" WHERE \"urunNo\"="+urunNumarasi;

        Connection conn=this.baglan();
        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            //***** Bağlantı sonlandırma *****
            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}
