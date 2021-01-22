
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class UrunManager {
    DbHelper helper = new DbHelper();
    
    
    ArrayList<Urunler>getUrunler() {
        
        ArrayList<Urunler> urun_listesi = new ArrayList();
        Connection cn = helper.getConnection(); 
        String sorgu = "SELECT * FROM stokyeni";
        Statement st;
        try {
            ResultSet rs;
            st = cn.createStatement();
            rs=st.executeQuery(sorgu);
            Urunler s;
                while (rs.next()) {
                    s = new Urunler(rs.getInt("urun_kodu"), rs.getInt("stok_miktari"), rs.getString("urun_adi"), rs.getString("urun_marka"), rs.getString("urun_model"), Float.parseFloat(rs.getString("urun_fiyat"))); /*bauda belki sorun olabiir.*/
                    urun_listesi.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return urun_listesi;
    }
    
}
