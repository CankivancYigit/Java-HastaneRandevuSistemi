/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;



public class Hasta {
    
    private int Id;
    private String Ad;
    private String Soyad;
    private String kullaniciAdi;
    private String parola;

    public Hasta(String Ad, String Soyad) {
        this.Ad = Ad;
        this.Soyad = Soyad;
    }

    public Hasta(int Id, String Ad, String Soyad, String kullaniciAdi, String parola) {
        this.Id = Id;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }
    
    

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    
    
}



