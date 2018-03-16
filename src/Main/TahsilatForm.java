package Main;

import Main.DBConnection;
import Main.DBConnection;
import static Main.SatisYonetimi.db;
import static Main.SatisYonetimi.kid;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TahsilatForm extends javax.swing.JFrame {

    int id = -1;

    public TahsilatForm(int id) {
        this.id = id;
        initComponents();
        musteriBilgisi(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMusteriAdSoyad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMusteriBakiye = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtOdenecekTutar = new javax.swing.JTextField();
        btnOdemeAl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari Bilgileri"));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Adı  Soyadı :");

        lblMusteriAdSoyad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMusteriAdSoyad.setForeground(new java.awt.Color(0, 0, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Kalan Bakiye :");

        lblMusteriBakiye.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMusteriBakiye.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMusteriAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMusteriBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMusteriAdSoyad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblMusteriBakiye))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Bilgileri"));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Ödenecek Tutar :");

        btnOdemeAl.setText("Ödemeyi Kaydet");
        btnOdemeAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdemeAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOdenecekTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOdemeAl)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOdenecekTutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOdemeAl)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOdemeAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdemeAlActionPerformed

        try {
            String pIslemTuru = "2";
            String alinanOdeme =txtOdenecekTutar.getText();
            String aKaydetQuery = "insert into Tahsilat values(null,'" + id + "','" + pIslemTuru + "','" + alinanOdeme + "',datetime('now'))";
            int sonuc = db.baglan().executeUpdate(aKaydetQuery);

            if (sonuc > 0 ) {
                JOptionPane.showMessageDialog(rootPane, "Satış tamamlandı...");
                System.out.println("ödeme alindi");
                this.dispose();
            }

        } catch (SQLException ex) {
            System.err.println("Satış ekleme Hatası : " + ex);

        } finally {
            db.dbKapat();
        }
    }//GEN-LAST:event_btnOdemeAlActionPerformed
    DBConnection db = new DBConnection();

    public void musteriBilgisi(int id) {
        lblMusteriBakiye.setText("0 TL");
        if (id != -1) {
            DBConnection dbb = new DBConnection();
            DBConnection dbbb = new DBConnection();
            try {
                String q = "select *from musteriler where musterid = '" + id + "'";
                String bakiyeQuery = "select sum(tahsilatTutar) as toplamPesinat from Tahsilat where (islemTuru ='1' or islemTuru='2') and kullaniId='" + id + "'";
                String bakiyeQuery2 = "select sum(tahsilatTutar) as toplamSatis from Tahsilat where islemTuru ='0' and kullaniId='" + id + "'";

                ResultSet rs = db.baglan().executeQuery(q);
                ResultSet rsBakiye = dbb.baglan().executeQuery(bakiyeQuery);
                ResultSet rsBakiye2 = dbbb.baglan().executeQuery(bakiyeQuery2);

                if (rs.next()) {
                    String mAdSoyad = rs.getString("musteriadi") + " " + rs.getString("musteriSoyadi");
                    lblMusteriAdSoyad.setText(mAdSoyad);

                }

                if (rsBakiye2.next()) {

                    double sPesinatToplam = Double.parseDouble(rsBakiye.getString("toplamPesinat"));
                    double mBakiye = Double.parseDouble(rsBakiye2.getString("toplamSatis"));
                    double mBakiyeToplam = mBakiye - sPesinatToplam;
                    lblMusteriBakiye.setText(mBakiyeToplam + " TL");

                } else {
                    lblMusteriBakiye.setText("");
                }

            } catch (Exception e) {
                System.out.println("musteri bilgisi okuma hatası : " + e);
            } finally {
                db.dbKapat();
                dbb.dbKapat();
                dbbb.dbKapat();
            }
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
            java.util.logging.Logger.getLogger(TahsilatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TahsilatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TahsilatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TahsilatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TahsilatForm(-1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOdemeAl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMusteriAdSoyad;
    private javax.swing.JLabel lblMusteriBakiye;
    private javax.swing.JTextField txtOdenecekTutar;
    // End of variables declaration//GEN-END:variables

}
