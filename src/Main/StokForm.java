package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StokForm extends javax.swing.JFrame {

    
    public StokForm() {
        initComponents();
        dataGetir();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUrunler = new javax.swing.JTable();
        lblUrunBarkodF = new javax.swing.JLabel();
        lblUrunAdiT = new javax.swing.JLabel();
        lblEklenecekStok = new javax.swing.JLabel();
        btnEkle = new javax.swing.JButton();
        lblUrunBarkod = new javax.swing.JLabel();
        lblUrunAdi = new javax.swing.JLabel();
        txtEklencekStok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ZSG | Cari Hesap Programı - Stok Ekle");
        setResizable(false);

        txtAra.setText("Ürün Ara...");
        txtAra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAraFocusGained(evt);
            }
        });

        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        tblUrunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUrunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUrunlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUrunler);

        lblUrunBarkodF.setText("Ürün Barkod:");

        lblUrunAdiT.setText("Ürün Adı :");

        lblEklenecekStok.setText("Eklenecek Stok :");

        btnEkle.setText("Ekle");
        btnEkle.setEnabled(false);
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        lblUrunBarkod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblUrunAdi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEkle, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUrunAdiT)
                            .addComponent(lblUrunBarkodF)
                            .addComponent(lblEklenecekStok))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblUrunBarkod, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                                .addComponent(lblUrunAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEklencekStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrunBarkodF)
                    .addComponent(lblUrunBarkod))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrunAdiT)
                    .addComponent(lblUrunAdi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEklenecekStok)
                    .addComponent(txtEklencekStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEkle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAraFocusGained
        txtAra.setText("");
    }//GEN-LAST:event_txtAraFocusGained

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        dataAra();
    }//GEN-LAST:event_btnAraActionPerformed
    int ubarkod=-1,mevcutStok=0;
    private void tblUrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUrunlerMouseClicked
        int row = tblUrunler.getSelectedRow();
        if (row > -1) {
            ubarkod=Integer.parseInt((String)tblUrunler.getValueAt(row, 0)) ;
            mevcutStok=Integer.parseInt((String) tblUrunler.getValueAt(row, 2));
            lblUrunBarkod.setText((String) tblUrunler.getValueAt(row, 0));
            lblUrunAdi.setText((String) tblUrunler.getValueAt(row, 1));
            btnEkle.setEnabled(true);
            
            System.out.println(ubarkod);
        }
    }//GEN-LAST:event_tblUrunlerMouseClicked

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        DBConnection db2=new DBConnection();
        int toplamStok=mevcutStok+Integer.parseInt(txtEklencekStok.getText());
        try {
            String duzenleQuery = "update urunler set urunStok ='" + toplamStok + "' where urunBarkod = '" + ubarkod + "'";
            int sonuc = db2.baglan().executeUpdate(duzenleQuery);
            if (sonuc > 0) {
                txtEklencekStok.setText("0");
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarısız");

            }

        } catch (SQLException ex) {
            System.err.println("Yazma Hatası : " + ex);

        } finally {
            db.dbKapat();
            dataGetir();
        }
    }//GEN-LAST:event_btnEkleActionPerformed
    DBConnection db=new DBConnection();
    String aranan="";
    public void dataAra(){
        try {
            aranan = txtAra.getText();
            String urunlerQuery = "select urunbarkod , urunadi, urunStok from urunler where urunbarkod='"+aranan+"'"
                    + "or urunAdi='"+aranan+"' or urunKategori = '"+aranan+"' or urunMarka='"+aranan+"'";

            ResultSet rs = db.baglan().executeQuery(urunlerQuery);

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Barkod");
            dtm.addColumn("Ürün Adı");
            dtm.addColumn("Stok");
            

            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi"),  rs.getString("urunStok")});
            }
            tblUrunler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası...");
        } finally {
            db.dbKapat();
        }
    }
    public void dataGetir(){
        try {
            String urunlerQuery = "select urunbarkod , urunadi, urunStok from urunler";

            ResultSet rs = db.baglan().executeQuery(urunlerQuery);

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Barkod");
            dtm.addColumn("Ürün Adı");
            dtm.addColumn("Stok");

            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi"), rs.getString("urunStok")});
            }
            tblUrunler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası...");
        } finally {
            db.dbKapat();
        }
    }
    
    
    
   
    public static void main(String args[]) {
        

       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StokForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnEkle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEklenecekStok;
    private javax.swing.JLabel lblUrunAdi;
    private javax.swing.JLabel lblUrunAdiT;
    private javax.swing.JLabel lblUrunBarkod;
    private javax.swing.JLabel lblUrunBarkodF;
    private javax.swing.JTable tblUrunler;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtEklencekStok;
    // End of variables declaration//GEN-END:variables

}
