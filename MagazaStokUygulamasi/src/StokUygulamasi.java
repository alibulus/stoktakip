

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class StokUygulamasi extends javax.swing.JFrame {
DbHelper helper = new DbHelper();
UrunManager urunmanager = new UrunManager();
    /**
     * Creates new form StokUygulamasi
     */satis s = new satis();
    public StokUygulamasi() {
        initComponents();
        
        helper.getConnection();  //getConnection();       ////////////////////////////////////////////////////////////       ////////////////////////////////////////////////////////////
        urunleri_tabloya_aktar(); /*program açıldığında direkt veirler gelsin diye.*/
        
        
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        urun_kodu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        stok_miktari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        urun_adi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        urun_marka = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        btn_guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_ekle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        urun_model = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        urun_fiyat = new javax.swing.JTextField();
        btn_satis = new javax.swing.JButton();
        btn_yenile = new javax.swing.JButton();
        tf_ara = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ürün Kodu:");

        urun_kodu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urun_kodu.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ürün Stoğu:");

        stok_miktari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ürün Adı:");

        urun_adi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marka : ");

        urun_marka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kod", "Stok", "Ad", "Marka", "Model", "Fiyat"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        btn_guncelle.setText("GÜNCELLE");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_sil.setText("SİL");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_cikis.setText("ÇIKIŞ");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_ekle.setText("EKLE");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Model : ");

        urun_model.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fiyat : ");

        urun_fiyat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_satis.setText("SATIŞ");
        btn_satis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satisActionPerformed(evt);
            }
        });

        btn_yenile.setText("Yenile");
        btn_yenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yenileActionPerformed(evt);
            }
        });

        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel6)))
                    .addComponent(btn_satis, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(urun_fiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(urun_adi)
                        .addComponent(urun_kodu)
                        .addComponent(stok_miktari)
                        .addComponent(urun_marka, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(urun_model, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_yenile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_yenile)
                    .addComponent(tf_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(urun_kodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(stok_miktari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(urun_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(urun_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(urun_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(urun_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_satis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
if (kontrolEt() == true) {
    try {

        
        Connection cn = helper.getConnection();       ////////////////////////////////////////////////////////////
        
        PreparedStatement ps = cn.prepareStatement("insert into stokyeni (stok_miktari,urun_adi,urun_marka,urun_model,urun_fiyat) values (?,?,?,?,?)");
                ps.setString(1, stok_miktari.getText());
                ps.setString(2, urun_adi.getText());
                ps.setString(3, urun_marka.getText());
                ps.setString(4, urun_model.getText());
                ps.setString(5, urun_fiyat.getText());
                ps.executeUpdate();
                urunleri_tabloya_aktar();
                
                JOptionPane.showMessageDialog(null, "Ürün Eklendii");
                stok_miktari.setText("");
                urun_adi.setText("");
                urun_marka.setText("");
                        
    } catch (Exception e) {
        e.printStackTrace();

    }  
}
else {
    JOptionPane.showMessageDialog(null, "Boş Değer Tanımlanamaz!!");
}
    
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        try {
            Connection cn = helper.getConnection();       ////////////////////////////////////////////////////////////
 
            PreparedStatement ps = cn.prepareStatement("update stokyeni SET stok_miktari=?, urun_adi=?, urun_marka=?, urun_model=?, urun_fiyat=? WHERE urun_kodu=?");
            /**/
            /*BURADA SADECE ÜRÜN KODU GİRİP DE GÜNCELLEME YAPABİLİYOSUN. BEN İSTİYORUM Kİ LİSTEDE GÜNCELLEMEK İSTEDİĞİM ELEMANA TIKLAYAYIM, 
            İSTEDİĞİM DEĞERLERİNİ YAZAYIM ÖYLE GÜNCELLEYEYİM.*/
            /**/
            ps.setString(1, stok_miktari.getText());
            ps.setString(2, urun_adi.getText());
            ps.setString(3, urun_marka.getText());  /// fiyat yerine hep marka girilmiş ya
            ps.setString(4, urun_model.getText());
            ps.setString(5, urun_fiyat.getText());
            ps.setInt(6, Integer.valueOf(urun_kodu.getText()));
            ps.executeUpdate();
            urunleri_tabloya_aktar();
                JOptionPane.showMessageDialog(null, "Ürün Güncellendi.");
                urun_kodu.setText("");
                stok_miktari.setText("");
                urun_adi.setText("");      //bu temizleme işlemini bir fonksiyona atayabiliriz.
                urun_marka.setText("");
                urun_model.setText("");
                urun_fiyat.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        if (!urun_kodu.equals("")) {
            try {
                Connection cn = helper.getConnection();       ////////////////////////////////////////////////////////////
                PreparedStatement ps = cn.prepareStatement("delete from stokyeni where urun_kodu=?");
                ps.setInt(1, Integer.parseInt(urun_kodu.getText()));
                ps.executeUpdate();
                urunleri_tabloya_aktar();
                JOptionPane.showMessageDialog(null, "Ürün Silindi.");
                urun_kodu.setText("");
                stok_miktari.setText("");
                urun_adi.setText("");
                urun_marka.setText(""); 
                urun_model.setText("");
                urun_fiyat.setText("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Silinecek ürün kodu girilmedi.");
        }      
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int index = tablo.getSelectedRow();
        try {
            urunGoster(index);  //tabloya mouse ile tıklandığında ürün göster.
   s.urunGoster(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tabloMouseClicked

    private void btn_satisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satisActionPerformed
        //satis s = new satis();
        s.setVisible(true);
        s.pack();
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  
        
//bu ikinci frame'i kapattığımızda birincinin de kapanmamasını sağlıyor.
    }//GEN-LAST:event_btn_satisActionPerformed

    private void btn_yenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yenileActionPerformed
        urunleri_tabloya_aktar();
    }//GEN-LAST:event_btn_yenileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection cn = helper.getConnection();
            String sql = "select * from stokyeni where urun_adi=? or urun_marka=? or urun_model=?";
            PreparedStatement ps;
            ResultSet rs;
            ps = cn.prepareStatement(sql);
            ps.setString(1, tf_ara.getText());
            ps.setString(2, tf_ara.getText());
            ps.setString(3, tf_ara.getText());
            rs = ps.executeQuery();
            System.out.println("sql kodu gönderildi.");
            
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Ürün Bulundu");
                System.out.println("if bloğuna girdi");
                urun_adi.setText(rs.getString("urun_adi"));
                urun_marka.setText(rs.getString("urun_marka"));
                urun_model.setText(rs.getString("urun_model"));
                urun_kodu.setText(rs.getString("urun_kodu"));
                stok_miktari.setText(rs.getString("stok_miktari"));
                urun_fiyat.setText(rs.getString("urun_fiyat"));
            }
            
            else {
                JOptionPane.showMessageDialog(null, "Ürün BULUNAMADI");
            }
                         
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    boolean kontrolEt(){
        if (stok_miktari.getText()==null || urun_adi.getText()==null || urun_marka.getText()==null) {
            return false;
        }
        else 
            return true;
    }
    
    
     void urunleri_tabloya_aktar() {
        try {
            ArrayList<Urunler> list = urunmanager.getUrunler();
            DefaultTableModel model = (DefaultTableModel)tablo.getModel();
                model.setRowCount(0);
            Object[] satir = new Object[6];
                for (int i = 0; i<list.size() ; i++) {
                satir[0] = list.get(i).getUrun_kodu();
                satir[1] = list.get(i).getStok_miktari();
                satir[2] = list.get(i).getUrun_adi();
                satir[3] = list.get(i).getUrun_marka();
                satir[4] = list.get(i).getUrun_model();
                satir[5] = list.get(i).getUrun_fiyat();
                model.addRow(satir);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    void urunGoster(int index) {
        try {
            urun_kodu.setText(Integer.toString(urunmanager.getUrunler().get(index).getUrun_kodu()));
            stok_miktari.setText(Integer.toString(urunmanager.getUrunler().get(index).getStok_miktari()));
            urun_adi.setText(urunmanager.getUrunler().get(index).getUrun_adi());
            urun_marka.setText(urunmanager.getUrunler().get(index).getUrun_marka());
            urun_model.setText(urunmanager.getUrunler().get(index).getUrun_model());
            urun_fiyat.setText(Float.toString(urunmanager.getUrunler().get(index).getUrun_fiyat()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_satis;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_yenile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stok_miktari;
    private static javax.swing.JTable tablo;
    private javax.swing.JTextField tf_ara;
    private javax.swing.JTextField urun_adi;
    private javax.swing.JTextField urun_fiyat;
    private javax.swing.JTextField urun_kodu;
    private javax.swing.JTextField urun_marka;
    private javax.swing.JTextField urun_model;
    // End of variables declaration//GEN-END:variables
}










