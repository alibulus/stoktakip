import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbHelper {
   
    
    public com.mysql.jdbc.Connection getConnection() {
        try {
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/stokuygulamasi?useUnicode=true&characterEncoding=utf8","root","");
            System.out.println("VERİTABANI BAĞLANTISI BAŞARILIIII");
            return cn;
        } catch (SQLException ex) {
            Logger.getLogger(StokUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("VERİTABANI BAĞLANTISI FAİİLL BAŞARISIZZZZZZ BAŞARISIZZZ    XXXXX");
       return null;
        }
    }
    
    
}



