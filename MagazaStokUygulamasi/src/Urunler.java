
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Urunler {
    
    DbHelper helper = new DbHelper();
    
    private int urun_kodu;
    private int stok_miktari;
    private String urun_adi;
    private String urun_marka;
    private String urun_model;
    private float urun_fiyat;
    
    
   

    public Urunler(int urun_kodu, int stok_miktari, String urun_adi, String urun_marka, String urun_model, float urun_fiyat) {
        this.urun_kodu = urun_kodu;
        this.stok_miktari = stok_miktari;
        this.urun_adi = urun_adi;
        this.urun_marka = urun_marka;
        this.urun_model = urun_model;
        this.urun_fiyat = urun_fiyat;
    }

    

    public int getUrun_kodu() {                
        return urun_kodu;
    }

    public void setUrun_kodu(int urun_kodu) {
        this.urun_kodu = urun_kodu;
    }

    public int getStok_miktari() {
        return stok_miktari;
    }

    public void setStok_miktari(int stok_miktari) {
        this.stok_miktari = stok_miktari;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public float getUrun_fiyat() {
        return urun_fiyat;
    }

    public void setUrun_fiyat(float urun_fiyat) {
        this.urun_fiyat = urun_fiyat;
    }
    
     public String getUrun_marka() {
        return urun_marka;
    }

    public void setUrun_marka(String urun_marka) {
        this.urun_marka = urun_marka;
    }

    public String getUrun_model() {
        return urun_model;
    }

    public void setUrun_model(String urun_model) {
        this.urun_model = urun_model;
    }
   
    
}
