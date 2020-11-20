package hastanerandevusistemi;

public class Doktor {

    private int Id;
    private String Ad;
    private String Soyad;
    private String Bölüm;
    private String KullaniciAdi;
    private String Parola;

    public Doktor(int Id, String Ad, String Soyad, String Bölüm, String KullaniciAdi, String Parola) {
        this.Id = Id;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bölüm = Bölüm;
        this.KullaniciAdi = KullaniciAdi;
        this.Parola = Parola;
    }

    public Doktor(String Ad, String Soyad, String Bölüm) {

        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bölüm = Bölüm;
    }

    public Doktor(String Ad, String Soyad) {

        this.Ad = Ad;
        this.Soyad = Soyad;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getBölüm() {
        return Bölüm;
    }

    public void setBölüm(String Bölüm) {
        this.Bölüm = Bölüm;
    }

    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }
}



