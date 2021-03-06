/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeki
 */
public class MarkalarForm extends javax.swing.JFrame {

    /**
     * Creates new form MarkalarForm
     */
    public MarkalarForm() {
        initComponents();
        dataGetir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKategoriAdi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKategoriAciklama = new javax.swing.JTextArea();
        btnKategoriKaydet = new javax.swing.JButton();
        btnKayegoriDuzenle = new javax.swing.JButton();
        btnKategoriSil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKategoriler = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ZSG | Cari Hesap Programı - Markalar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Marka İşlemleri"));

        jLabel1.setText("Marka Adı");

        jLabel2.setText("Marka Açıklaması :");

        txtKategoriAciklama.setColumns(20);
        txtKategoriAciklama.setRows(5);
        jScrollPane2.setViewportView(txtKategoriAciklama);

        btnKategoriKaydet.setText("Kaydet");
        btnKategoriKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriKaydetActionPerformed(evt);
            }
        });

        btnKayegoriDuzenle.setText("Düzenle");

        btnKategoriSil.setText("Sil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(txtKategoriAdi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKategoriSil, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(btnKategoriKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKayegoriDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKategoriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKategoriKaydet))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnKayegoriDuzenle)
                        .addGap(18, 18, 18)
                        .addComponent(btnKategoriSil)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Markalar"));

        tblKategoriler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKategoriler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKategorilerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKategoriler);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKategoriKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriKaydetActionPerformed
       String markaAdi=txtKategoriAdi.getText().trim();
        String markaAciklama=txtKategoriAciklama.getText().trim();
        
        if (markaAdi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Kategori adı girin...");
            txtKategoriAdi.requestFocus();
        }
        
        try {
            String kaydetQuery = "insert into markalar values(null,'" + markaAdi + "','" + markaAciklama + "')";
            int sonuc = db.baglan().executeUpdate(kaydetQuery);
            if (sonuc > 0) {
                txtKategoriAdi.setText("");
                txtKategoriAciklama.setText("");
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarısız");
                
            }
        } catch (Exception e) {
            System.err.println("kaydetme hatası : "+e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                JOptionPane.showMessageDialog(rootPane, "Bu marka zaten var...");
            }
        }finally{
            db.dbKapat();
            dataGetir();
        }
        
    }//GEN-LAST:event_btnKategoriKaydetActionPerformed

    private void tblKategorilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKategorilerMouseClicked
        int row = tblKategoriler.getSelectedRow();
        if (row > -1) {
        txtKategoriAdi.setText((String) tblKategoriler.getValueAt(row, 0));
        txtKategoriAciklama.setText((String) tblKategoriler.getValueAt(row, 1));
        btnKategoriSil.setEnabled(true);
        }
    }//GEN-LAST:event_tblKategorilerMouseClicked

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
            java.util.logging.Logger.getLogger(MarkalarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkalarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkalarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkalarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkalarForm().setVisible(true);
            }
        });
    }
    DBConnection db=new DBConnection();
    public void dataGetir(){
        try {
            String markaQuery = "select *from markalar";
            ResultSet rs=db.baglan().executeQuery(markaQuery);
            DefaultTableModel dtm=new DefaultTableModel();
            dtm.addColumn("Marka ID");
            dtm.addColumn("Marka Adı");
            dtm.addColumn("Marka Açıklama");
            
            
            while (rs.next()) {                
                dtm.addRow(new String[] {rs.getString("markaId"),rs.getString("markaAdi"),rs.getString("markaAciklama")});
            }
            tblKategoriler.setModel(dtm);
            
            
        } catch (Exception e) {
            System.err.println("okuma hatası...");
        }finally{
            db.dbKapat();
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKategoriKaydet;
    private javax.swing.JButton btnKategoriSil;
    private javax.swing.JButton btnKayegoriDuzenle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKategoriler;
    private javax.swing.JTextArea txtKategoriAciklama;
    private javax.swing.JTextField txtKategoriAdi;
    // End of variables declaration//GEN-END:variables
}
