/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import java.sql.Date;

/**
 *
 * @author Cankıvanç
 */
public class Randevu {
    
    
    private Date Tarih;
    private String Saat;
    private String HastaAd;
    private String HastaSoyad;
    private String DoktorAd;
    private String DoktorSoyad;
    private String Bölüm;

    public Randevu(Date Tarih, String Saat, String HastaAd, String HastaSoyad) {
        this.Tarih = Tarih;
        this.Saat = Saat;
        this.HastaAd = HastaAd;
        this.HastaSoyad = HastaSoyad;
    
}

    public Randevu(Date Tarih, String Saat, String DoktorAd, String DoktorSoyad, String Bölüm) {
        this.Tarih = Tarih;
        this.Saat = Saat;
        this.DoktorAd = DoktorAd;
        this.DoktorSoyad = DoktorSoyad;
        this.Bölüm = Bölüm;
    }

    
    public String getDoktorAd() {
        return DoktorAd;
    }

    public String getDoktorSoyad() {
        return DoktorSoyad;
    }

    public String getBölüm() {
        return Bölüm;
    }

    
    public Date getTarih() {
        return Tarih;
    }

    public String getSaat() {
        return Saat;
    }

    public String getHastaAd() {
        return HastaAd;
    }

    public String getHastaSoyad() {
        return HastaSoyad;
    }

    
}





