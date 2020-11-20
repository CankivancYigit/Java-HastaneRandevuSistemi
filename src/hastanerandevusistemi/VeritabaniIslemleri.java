/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cankıvanç
 */
public class VeritabaniIslemleri {

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public VeritabaniIslemleri() {

        //jdbc:mysql://localhost:3306/hastanerandevu
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + Veritabani.db_ismi + "?useUnicode=true&characterEncoding=utf8&useSSL=false";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("driver bulunamadi.");
        }

        try {
            con = (Connection) DriverManager.getConnection(url, Veritabani.kullaniciadi, Veritabani.parola);
            //System.out.println("baglanti basarili");
        } catch (SQLException ex) {
            //System.out.println("baglanti basarisiz");
        }

    }

    public boolean hastaGiris(String kullaniciAdi, String parola) {

        String sorgu = "Select * From hasta where hastakullanıcıadı = ? and hastaparola = ?";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next() == false) {

                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean doktorGiris(String kullaniciAdi, String parola) {

        String sorgu = "Select * From doktor where doktorkullanıcıadı = ? and doktorparola = ?";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next() == false) {

                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void hastaKayıt(String hastaAd, String hastaSoyad, String kullaniciAdi, String parola) {

        String sorgu = "Insert into hasta (hastaad,hastasoyad,hastakullanıcıadı,hastaparola) VALUES (?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, hastaAd);
            preparedStatement.setString(2, hastaSoyad);
            preparedStatement.setString(3, kullaniciAdi);
            preparedStatement.setString(4, parola);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Doktor> doktorGönder() {

        ArrayList<Doktor> cikti = new ArrayList<Doktor>();

        try {

            statement = con.createStatement();
            String sorgu = "Select doktorad ,doktorsoyad ,doktorbölüm from doktor";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {

                String doktorAd = rs.getString("doktorad");
                String doktorSoyad = rs.getString("doktorsoyad");
                String doktorBölüm = rs.getString("doktorbölüm");

                cikti.add(new Doktor(doktorAd, doktorSoyad, doktorBölüm));

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList<Doktor> doktorTümBilgiGönder() {

        ArrayList<Doktor> cikti = new ArrayList<Doktor>();

        try {

            statement = con.createStatement();
            String sorgu = "Select iddoktor, doktorad, doktorsoyad, doktorbölüm, doktorkullanıcıadı, doktorparola from doktor";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int doktorID = rs.getInt("iddoktor");
                String doktorAd = rs.getString("doktorad");
                String doktorSoyad = rs.getString("doktorsoyad");
                String doktorBölüm = rs.getString("doktorbölüm");
                String doktorKullaniciAdi = rs.getString("doktorkullanıcıadı");
                String doktorParola = rs.getString("doktorparola");

                cikti.add(new Doktor(doktorID, doktorAd, doktorSoyad, doktorBölüm, doktorKullaniciAdi, doktorParola));

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void doktorEkle(String doktorAd, String doktorSoyad, String doktorBölüm, String doktorKullaniciAdi, String doktorParola) {

        String sorgu = "Insert into doktor (doktorad,doktorsoyad,doktorbölüm,doktorkullanıcıadı,doktorparola) VALUES (?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, doktorAd);
            preparedStatement.setString(2, doktorSoyad);
            preparedStatement.setString(3, doktorBölüm);
            preparedStatement.setString(4, doktorKullaniciAdi);
            preparedStatement.setString(5, doktorParola);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void doktorGüncelle(int doktorID, String doktorAd, String doktorSoyad, String doktorBölüm, String doktorKullaniciAdi, String doktorParola) {

        String sorgu = "Update doktor set doktorad = ? , doktorsoyad = ? , doktorbölüm = ? , doktorkullanıcıadı = ? , doktorparola = ? where iddoktor = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, doktorAd);
            preparedStatement.setString(2, doktorSoyad);
            preparedStatement.setString(3, doktorBölüm);
            preparedStatement.setString(4, doktorKullaniciAdi);
            preparedStatement.setString(5, doktorParola);
            preparedStatement.setInt(6, doktorID);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void doktorSil(int doktorID) {

        String sorgu = "Delete from doktor where iddoktor = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, doktorID);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Hasta> hastaTümBilgiGönder() {

        ArrayList<Hasta> cikti = new ArrayList<Hasta>();

        try {

            statement = con.createStatement();
            String sorgu = "Select idhasta, hastaad, hastasoyad, hastakullanıcıadı, hastaparola from hasta";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int hastaID = rs.getInt("idhasta");
                String hastaAd = rs.getString("hastaad");
                String hastaSoyad = rs.getString("hastasoyad");
                String hastaKullaniciAdi = rs.getString("hastakullanıcıadı");
                String hastaParola = rs.getString("hastaparola");

                cikti.add(new Hasta(hastaID, hastaAd, hastaSoyad, hastaKullaniciAdi, hastaParola));

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void hastaEkle(String hastaAd, String hastaSoyad, String hastaKullaniciAdi, String hastaParola) {

        String sorgu = "Insert into hasta (hastaad,hastasoyad,hastakullanıcıadı,hastaparola) VALUES (?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, hastaAd);
            preparedStatement.setString(2, hastaSoyad);
            preparedStatement.setString(3, hastaKullaniciAdi);
            preparedStatement.setString(4, hastaParola);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hastaGüncelle(int hastaID, String hastaAd, String hastaSoyad, String hastaKullaniciAdi, String hastaParola) {

        String sorgu = "Update hasta set hastaad = ? , hastasoyad = ? , hastakullanıcıadı = ? , hastaparola = ? where idhasta = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, hastaAd);
            preparedStatement.setString(2, hastaSoyad);
            preparedStatement.setString(3, hastaKullaniciAdi);
            preparedStatement.setString(4, hastaParola);
            preparedStatement.setInt(5, hastaID);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hastaSil(int hastaID) {

        String sorgu = "Delete from hasta where idhasta = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, hastaID);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Doktor> doktorBölümGönder(String bölümAdı) {

        ArrayList<Doktor> cikti = new ArrayList<Doktor>();

        String sorgu = "Select doktorad ,doktorsoyad ,doktorbölüm from doktor where doktorbölüm = ? ";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, bölümAdı);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String doktorAd = rs.getString("doktorad");
                String doktorSoyad = rs.getString("doktorsoyad");
                String doktorBölüm = rs.getString("doktorbölüm");

                cikti.add(new Doktor(doktorAd, doktorSoyad, doktorBölüm));

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public Hasta hastaGönder(String kullaniciAdi) {

        Hasta hasta = null;
        String sorgu = "Select hastaad , hastasoyad From hasta where hastakullanıcıadı = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, GirisSayfasi.kullanici_adi);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String hastaAd = rs.getString("hastaad");
                String hastaSoyad = rs.getString("hastasoyad");
                hasta = new Hasta(hastaAd, hastaSoyad);
            }

            return hasta;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void randevuOlustur(String hastaAd, String hastaSoyad, String doktorAd, String doktorSoyad, String bölüm, String tarih, String saat) {

        String sorgu = "Insert into randevu (hastaad,hastasoyad,doktorad,doktorsoyad,bölüm,tarih,saat) VALUES (?,?,?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, hastaAd);
            preparedStatement.setString(2, hastaSoyad);
            preparedStatement.setString(3, doktorAd);
            preparedStatement.setString(4, doktorSoyad);
            preparedStatement.setString(5, bölüm);
            preparedStatement.setString(6, tarih);
            preparedStatement.setString(7, saat);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //RandevuSorgula metodu, randevunun aynı doktora, aynı tarih ve aynı saatte alınıp alınmadığını sorgular.
    public boolean randevuSorgula(String doktorAd, String doktorSoyad, String tarih, String saat) {

        try {
            statement = con.createStatement();
            String sorgu = "Select doktorad, doktorsoyad, tarih, saat from randevu";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {

                String yeniDoktorAd = rs.getString("doktorad");
                String yeniDoktorSoyad = rs.getString("doktorsoyad");
                String yeniTarih = rs.getString("tarih");
                String yeniSaat = rs.getString("saat");

                if (yeniDoktorAd.matches(doktorAd) && yeniDoktorSoyad.matches(doktorSoyad) && yeniTarih.matches(tarih) && yeniSaat.matches(saat)) {
                    return false;
                } 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public String doktorAdGönder(String kullaniciAdi) {

        //Doktor doktor = null;
        String doktorAd = null;
        String sorgu = "Select doktorad From doktor where doktorkullanıcıadı = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                doktorAd = rs.getString("doktorad");
                //doktor = new Doktor(doktorAd, doktorSoyad);
            }

            return doktorAd;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public String doktorSoyadGönder(String kullaniciAdi) {

        //Doktor doktor = null;
        String doktorSoyad = null;
        String sorgu = "Select doktorsoyad From doktor where doktorkullanıcıadı = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                doktorSoyad = rs.getString("doktorsoyad");
                //doktor = new Doktor(doktorAd, doktorSoyad);
            }

            return doktorSoyad;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    //randevuGönder metodu doktor ekranında bulunan randevuGörüntüle metodundan çağırılıyor.
    public ArrayList<Randevu> randevuGönder(String doktorAd, String doktorSoyad) {

        ArrayList<Randevu> randevuListesi = new ArrayList<Randevu>();
        Randevu randevu = null;
        String sorgu = "SELECT tarih, saat, hastaad, hastasoyad FROM randevu WHERE doktorad = ? AND doktorsoyad = ? ";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, doktorAd);
            preparedStatement.setString(2, doktorSoyad);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Date tarih = rs.getDate("tarih");
                String saat = rs.getString("saat");
                String hastaAd = rs.getString("hastaad");
                String hastaSoyad = rs.getString("hastasoyad");

                randevu = new Randevu(tarih, saat, hastaAd, hastaSoyad);
                randevuListesi.add(randevu);

            }

            return randevuListesi;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList<Randevu> hastarandevuGönder(String hastaAd, String hastaSoyad) {

        ArrayList<Randevu> randevuListesi = new ArrayList<Randevu>();
        Randevu randevu = null;
        String sorgu = "SELECT tarih, saat, doktorad, doktorsoyad,bölüm FROM randevu WHERE hastaad = ? AND hastasoyad = ? ";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, hastaAd);
            preparedStatement.setString(2, hastaSoyad);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Date tarih = rs.getDate("tarih");
                String saat = rs.getString("saat");
                String doktorAd = rs.getString("doktorad");
                String doktorSoyad = rs.getString("doktorsoyad");
                String bölüm = rs.getString("bölüm");

                randevu = new Randevu(tarih, saat, doktorAd, doktorSoyad, bölüm);
                randevuListesi.add(randevu);

            }

            return randevuListesi;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}




