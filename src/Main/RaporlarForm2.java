/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeki
 */
public class RaporlarForm2 extends javax.swing.JFrame {

    /**
     * Creates new form RaporlarForm2
     */
    public RaporlarForm2() {
        initComponents();
        cbxIslemler.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxHareketler = new javax.swing.JComboBox<>();
        cbxIslemler = new javax.swing.JComboBox<>();
        btnRaporla = new javax.swing.JButton();
        dtIlk = new com.toedter.calendar.JDateChooser();
        dtSon = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRaporlar = new javax.swing.JTable();
        lblToplamGelirler = new javax.swing.JLabel();
        lblGelirler = new javax.swing.JLabel();
        lblToplamGiderler = new javax.swing.JLabel();
        lblGiderler = new javax.swing.JLabel();
        lblGenelDurum = new javax.swing.JLabel();
        lblDurumBakiye = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ZSG | Cari Hesap Programı - Raporlar");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rapor Filtrele"));

        jLabel1.setText("İLE");

        cbxHareketler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satışlar Hareketleri", "Kasa Hareketleri", "Ödeme Hareketleri" }));
        cbxHareketler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxHareketlerİtemStateChanged(evt);
            }
        });
        cbxHareketler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxHareketlerMouseClicked(evt);
            }
        });

        cbxIslemler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gelen Ödemeler", "Yapılan Ödemeler" }));

        btnRaporla.setText("RAPORLA");
        btnRaporla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaporlaActionPerformed(evt);
            }
        });

        dtIlk.setDateFormatString("yyyy-MM-dd");
        dtIlk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtIlkMouseClicked(evt);
            }
        });

        dtSon.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbxHareketler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dtIlk, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtSon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxIslemler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRaporla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtIlk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(dtSon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(cbxHareketler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxIslemler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaporla))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("RAPOR DETAYLARI"));

        tblRaporlar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRaporlar);

        lblToplamGelirler.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblToplamGelirler.setText("Toplam Gelirler :");

        lblGelirler.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGelirler.setText("0.00TL");

        lblToplamGiderler.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblToplamGiderler.setText("Toplam Giderler :");

        lblGiderler.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGiderler.setText("0.00TL");

        lblGenelDurum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGenelDurum.setText("Genel Durum :");

        lblDurumBakiye.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDurumBakiye.setText("0.00TL Kar-Zarar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblToplamGelirler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGelirler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblToplamGiderler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGiderler)
                        .addGap(18, 18, 18)
                        .addComponent(lblGenelDurum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDurumBakiye)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToplamGelirler)
                    .addComponent(lblGelirler)
                    .addComponent(lblToplamGiderler)
                    .addComponent(lblGiderler)
                    .addComponent(lblGenelDurum)
                    .addComponent(lblDurumBakiye))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String ilkDate = "", sonDate = "";
    private void btnRaporlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaporlaActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ilkDate = sdf.format(dtIlk.getDate());
        sonDate = sdf.format(dtSon.getDate());
        Raporla(ilkDate, sonDate);

    }//GEN-LAST:event_btnRaporlaActionPerformed

    private void dtIlkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtIlkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dtIlkMouseClicked

    private void cbxHareketlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxHareketlerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHareketlerMouseClicked

    private void cbxHareketlerİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxHareketlerİtemStateChanged
        if (cbxHareketler.getSelectedIndex() == 1) {

            cbxIslemler.setEnabled(true);
        } else {

            cbxIslemler.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHareketlerİtemStateChanged

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
            java.util.logging.Logger.getLogger(RaporlarForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaporlarForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaporlarForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaporlarForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaporlarForm2().setVisible(true);
            }
        });
    }
    DBConnection db = new DBConnection();
    int secim, secim2;

    public void Raporla(String ilkDate, String sonDate) {

        if (cbxHareketler.getSelectedIndex() == 0) {
            try {
                System.out.println("ilkDate : " + ilkDate);
                System.out.println("sonDate : " + sonDate);
                String sorguQuery = "Select date(satisTarihi) as satisTarihi , urunAdi,satisMiktar,satisPesinat,satisIskonto,satisToplam,musteriAdi,musteriSoyadi from SatisYonetimi inner join Urunler on SatisYonetimi.urunId = Urunler.urunId inner join Musteriler on SatisYonetimi.musterId = Musteriler.musterId where satisTarihi between date('" + ilkDate + "') and date('" + sonDate + "')";
                System.out.println("sorguQuery : " + sorguQuery);
                ResultSet rs = db.baglan().executeQuery(sorguQuery);
                DefaultTableModel dtm = new DefaultTableModel();

                dtm.addColumn("İşlem Tarihi");
                dtm.addColumn("Müşteri Adı");
                dtm.addColumn("Müşteri Soyadı");
                dtm.addColumn("Satilan Ürün");
                dtm.addColumn("Miktar");
                dtm.addColumn("Peşinat");
                dtm.addColumn("Toplam");
                dtm.addColumn("İskonto");

                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString("satisTarihi"), rs.getString("musteriAdi"), rs.getString("musteriSoyadi"), rs.getString("urunAdi"),
                        rs.getString("satisMiktar"), rs.getString("satisPesinat"),
                        rs.getString("satisToplam"), rs.getString("satisIskonto")});
                }
                tblRaporlar.setModel(dtm);
            } catch (Exception e) {
                System.out.println("raporlama hatası" + e);
            } finally {
                db.dbKapat();
            }
        } else if (cbxHareketler.getSelectedIndex() == 1) {
            if (cbxIslemler.getSelectedIndex() == 0) {
                try {
                    String sorguQuery = "Select date(islemTarihi) as islemTarih , islemOdemeSekli,islemAciklama,islemTutari"
                            + " from KasaIslemleri where islemTarih between date('" + ilkDate + "') and date('" + sonDate + "') and islemTuru = '0'";
                    System.out.println("sorguQuery : " + sorguQuery);
                    ResultSet rs = db.baglan().executeQuery(sorguQuery);
                    DefaultTableModel dtm = new DefaultTableModel();

                    dtm.addColumn("İşlem Tarihi");
                    dtm.addColumn("Ödeme Şekli");
                    dtm.addColumn("Açıklama");
                    dtm.addColumn("Tutar");

                    while (rs.next()) {
                        dtm.addRow(new String[]{rs.getString("islemTarihi"),
                            rs.getString("islemOdemeSekli"), 
                            rs.getString("islemAciklama"), rs.getString("islemTutari"),});
                    }
                    tblRaporlar.setModel(dtm);
                } catch (Exception e) {
                    System.out.println("raporlama hatası" + e);
                } finally {
                    db.dbKapat();
                }
            } else {
                try {
                    String sorguQuery = "Select date(islemTarihi) as islemTarihi , islemOdemeSekli,islemAciklama,islemTutari"
                            + " from KasaIslemleri where islemTarihi between date('" + ilkDate + "') and date('" + sonDate + "') and islemTuru = '1'";
                    System.out.println("sorguQuery : " + sorguQuery);
                    ResultSet rs = db.baglan().executeQuery(sorguQuery);
                    DefaultTableModel dtm = new DefaultTableModel();

                    dtm.addColumn("İşlem Tarihi");
                    dtm.addColumn("Ödeme Şekli");
                    dtm.addColumn("Açıklama");
                    dtm.addColumn("Tutar");

                    while (rs.next()) {
                        dtm.addRow(new String[]{rs.getString("islemTarihi"),
                            rs.getString("islemOdemeSekli"), 
                            rs.getString("islemAciklama"), rs.getString("islemTutari"),});
                    }
                    tblRaporlar.setModel(dtm);
                } catch (Exception e) {
                    System.out.println("raporlama hatası" + e);
                } finally {
                    db.dbKapat();
                }

            }
        } else if (cbxHareketler.getSelectedIndex() == 2) {
             try {
                    String sorguQuery = "Select date(islemTarihi) as islemTarihi , musteriAdi,musteriSoyadi,islemTuru,tahsilatTutar from Tahsilat inner join Musteriler on Musteriler.musterId=Tahsilat.kullaniId where islemTuru = '2' or islemTuru = '1' and islemTarihi between date('" + ilkDate + "') and date('" + sonDate + "')";
                    System.out.println("sorguQuery : " + sorguQuery);
                    ResultSet rs = db.baglan().executeQuery(sorguQuery);
                    DefaultTableModel dtm = new DefaultTableModel();

                    dtm.addColumn("İşlem Tarihi");
                    dtm.addColumn("Müşteri Adı");
                    dtm.addColumn("Müşteri Soyadı");
                    dtm.addColumn("İşlem Türü");
                    dtm.addColumn("Tutar");

                    while (rs.next()) {
                        dtm.addRow(new String[]{rs.getString("islemTarihi"),
                            rs.getString("musteriAdi"), 
                            rs.getString("musteriSoyadi"), rs.getString("islemTuru"),rs.getString("TahsilatTutar")});
                    }
                    tblRaporlar.setModel(dtm);
                } catch (Exception e) {
                    System.out.println("raporlama hatası" + e);
                } finally {
                    db.dbKapat();
                }   
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRaporla;
    private javax.swing.JComboBox<String> cbxHareketler;
    private javax.swing.JComboBox<String> cbxIslemler;
    private com.toedter.calendar.JDateChooser dtIlk;
    private com.toedter.calendar.JDateChooser dtSon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDurumBakiye;
    private javax.swing.JLabel lblGelirler;
    private javax.swing.JLabel lblGenelDurum;
    private javax.swing.JLabel lblGiderler;
    private javax.swing.JLabel lblToplamGelirler;
    private javax.swing.JLabel lblToplamGiderler;
    private javax.swing.JTable tblRaporlar;
    // End of variables declaration//GEN-END:variables
}
