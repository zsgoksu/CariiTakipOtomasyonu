/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CariHesaplarForm extends javax.swing.JFrame {

    DBConnection db = new DBConnection();

    /**
     * Creates new form CariHesaplarForm
     */
    public CariHesaplarForm() {
        initComponents();
        dataGetir();
        islemGecmisi();

    }

    public void FormKapat() {
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHesaplar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMusteriler = new javax.swing.JTable();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        pnlHareketler = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHesapHareketleri = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        lblDurum = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnKaydet = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        lblKadi = new javax.swing.JLabel();
        lblKsoyadi = new javax.swing.JLabel();
        lblKtelefon = new javax.swing.JLabel();
        lblKadres = new javax.swing.JLabel();
        lblKmail = new javax.swing.JLabel();
        txtKAdi = new javax.swing.JTextField();
        txtKSoyadi = new javax.swing.JTextField();
        txtKTelefon = new javax.swing.JTextField();
        txtKmail = new javax.swing.JTextField();
        txtKAdres = new javax.swing.JTextField();
        btnSatisYap = new javax.swing.JButton();
        btnOdemeAl = new javax.swing.JButton();
        btnDuzelt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ZSG | Cari Hesap Programı - Cari Hesaplar");
        setResizable(false);

        pnlHesaplar.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesaplar"));

        tblMusteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblMusteriler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusterilerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMusterilerMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblMusteriler);

        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAraKeyPressed(evt);
            }
        });

        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });
        btnAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlHesaplarLayout = new javax.swing.GroupLayout(pnlHesaplar);
        pnlHesaplar.setLayout(pnlHesaplarLayout);
        pnlHesaplarLayout.setHorizontalGroup(
            pnlHesaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesaplarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlHesaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(pnlHesaplarLayout.createSequentialGroup()
                        .addComponent(txtAra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlHesaplarLayout.setVerticalGroup(
            pnlHesaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHesaplarLayout.createSequentialGroup()
                .addGroup(pnlHesaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlHareketler.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesap Hareketleri"));

        tblHesapHareketleri.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHesapHareketleri);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Hesap Bakiyesi :");

        lblBakiye.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblBakiye.setForeground(new java.awt.Color(204, 0, 51));
        lblBakiye.setText("NULL");

        javax.swing.GroupLayout pnlHareketlerLayout = new javax.swing.GroupLayout(pnlHareketler);
        pnlHareketler.setLayout(pnlHareketlerLayout);
        pnlHareketlerLayout.setHorizontalGroup(
            pnlHareketlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHareketlerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBakiye)
                .addGap(26, 26, 26))
        );
        pnlHareketlerLayout.setVerticalGroup(
            pnlHareketlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHareketlerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHareketlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDurum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHareketlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblBakiye))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesap Ayarları"));

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.setEnabled(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        lblKadi.setText("Adı :");

        lblKsoyadi.setText("Soyadı :");

        lblKtelefon.setText("Telefon :");

        lblKadres.setText("Adres :");

        lblKmail.setText("E-posta :");

        btnSatisYap.setText("Satış Yap");
        btnSatisYap.setEnabled(false);
        btnSatisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisYapActionPerformed(evt);
            }
        });

        btnOdemeAl.setText("Ödeme Al");
        btnOdemeAl.setEnabled(false);
        btnOdemeAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdemeAlActionPerformed(evt);
            }
        });

        btnDuzelt.setText("Düzenlemeyi Kaydet");
        btnDuzelt.setEnabled(false);
        btnDuzelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzeltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKadres)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSatisYap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOdemeAl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtKAdres)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKmail)
                            .addComponent(lblKtelefon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKmail)
                            .addComponent(txtKTelefon)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKadi)
                            .addComponent(lblKsoyadi))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtKAdi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKaydet)
                                .addGap(18, 18, 18)
                                .addComponent(btnDuzelt)
                                .addGap(18, 18, 18)
                                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtKSoyadi))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaydet)
                    .addComponent(btnSil)
                    .addComponent(btnDuzelt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKadi)
                    .addComponent(txtKAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKsoyadi)
                    .addComponent(txtKSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKtelefon)
                    .addComponent(txtKTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKmail)
                    .addComponent(txtKmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKadres)
                    .addComponent(txtKAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSatisYap, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnOdemeAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlHesaplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlHareketler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHesaplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlHareketler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        String kAdi = txtKAdi.getText();
        String kSoyadi = txtKSoyadi.getText();
        String kTelefon = txtKTelefon.getText();
        String kMail = txtKmail.getText();
        String kAdres = txtKAdres.getText();

        if (kAdi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri ismini girin...");
            txtKAdi.requestFocus();
        } else if (kSoyadi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri Soyadını girin...");
            txtKSoyadi.requestFocus();
        } else if (kTelefon.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri telefonunu girin...");
            txtKTelefon.requestFocus();
        } else if (kAdres.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri adresini girin...");
            txtKAdres.requestFocus();
        }

        try {
            String kaydetQuery = "insert into musteriler values(null,'" + kAdi + "','" + kSoyadi + "','" + kTelefon + "','" + kMail + "','" + kAdres + "')";
            int sonuc = db.baglan().executeUpdate(kaydetQuery);
            if (sonuc > 0) {
                txtKAdi.setText("");
                txtKAdres.setText("");
                txtKSoyadi.setText("");
                txtKTelefon.setText("");
                txtKmail.setText("");
                lblDurum.setText("Durum : Kayıt Başarılı...");
            } else {
                lblDurum.setText("Durum : Kayıt Başarısız oldu...");
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");
            }

        } catch (SQLException ex) {
            System.err.println("Yazma Hatası : " + ex);
            if (ex.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                JOptionPane.showMessageDialog(rootPane, "Aynı telefon numarası ile kayıt yapılamaz !");
            }
        } finally {
            db.dbKapat();
        }
        dataGetir();
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void tblMusterilerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusterilerMousePressed

    }//GEN-LAST:event_tblMusterilerMousePressed

    int kid = -1;
    
    private void tblMusterilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusterilerMouseClicked
        int row = tblMusteriler.getSelectedRow();
        if (row > -1) {
            kid = idList.get(row);
            txtKAdi.setText((String) tblMusteriler.getValueAt(row, 0));
            txtKSoyadi.setText((String) tblMusteriler.getValueAt(row, 1));
            txtKTelefon.setText((String) tblMusteriler.getValueAt(row, 2));
            txtKmail.setText((String) tblMusteriler.getValueAt(row, 3));
            txtKAdres.setText((String) tblMusteriler.getValueAt(row, 4));
            btnSil.setEnabled(true);
            btnSatisYap.setEnabled(true);
            btnOdemeAl.setEnabled(true);
            btnDuzelt.setEnabled(true);
            btnKaydet.setEnabled(false);
            System.out.println(kid);
        }else{
            btnKaydet.setEnabled(true);
            btnSil.setEnabled(false);
            btnSatisYap.setEnabled(false);
            btnOdemeAl.setEnabled(false);
            btnDuzelt.setEnabled(false);
            txtKAdi.setText("");
            txtKSoyadi.setText("");
            txtKAdres.setText("");
            txtKSoyadi.setText("");
            txtKTelefon.setText("");
            txtKmail.setText("");
        }
        islemGecmisi();
        
    }//GEN-LAST:event_tblMusterilerMouseClicked

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        dataAra();
    }//GEN-LAST:event_btnAraActionPerformed

    private void btnAraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAraKeyPressed


    }//GEN-LAST:event_btnAraKeyPressed

    private void btnDuzeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzeltActionPerformed
        String kAdi = txtKAdi.getText();
        String kSoyadi = txtKSoyadi.getText();
        String kTelefon = txtKTelefon.getText();
        String kMail = txtKmail.getText();
        String kAdres = txtKAdres.getText();

        if (kAdi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri ismini girin...");
            txtKAdi.requestFocus();
        } else if (kSoyadi.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri Soyadını girin...");
            txtKSoyadi.requestFocus();
        } else if (kTelefon.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri telefonunu girin...");
            txtKTelefon.requestFocus();
        } else if (kAdres.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri adresini girin...");
            txtKAdres.requestFocus();
        }

        try {
            String duzenleQuery = "update musteriler set musteriadi = '" + kAdi + "', "
                    + "musterisoyadi = '" + kSoyadi + "', musterimail = '" + kMail + "', "
                    + "musteriTelefon = '" + kTelefon + "',musteriAdres ='" + kAdres + "' where musterid = '" + kid + "'";
            int sonuc = db.baglan().executeUpdate(duzenleQuery);
            if (sonuc > 0) {
                txtKAdi.setText("");
                txtKAdres.setText("");
                txtKSoyadi.setText("");
                txtKTelefon.setText("");
                txtKmail.setText("");
                lblDurum.setText("Durum : Düzenleme Başarılı...");
                btnSil.setEnabled(false);
                btnSatisYap.setEnabled(false);
                btnOdemeAl.setEnabled(false);
                btnDuzelt.setEnabled(false);
                btnKaydet.setEnabled(true);
            } else {
                lblDurum.setText("Durum : Düzenleme Başarısız oldu...");
                JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı");
            }

        } catch (SQLException ex) {
            System.err.println("Yazma Hatası : " + ex);

        } finally {
            db.dbKapat();
        }
        dataGetir();
    }//GEN-LAST:event_btnDuzeltActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        
        if (kid == -1) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız");
        } else {
            try {
                String silQuery = "delete from musteriler where musterid = '" + kid + "' ";
                int silSonuc = db.baglan().executeUpdate(silQuery);
                if (silSonuc > 0) {
                    db.dbKapat();
                    dataGetir();
                    JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı");
                    txtKAdi.setText("");
                    txtKAdres.setText("");
                    txtKSoyadi.setText("");
                    txtKTelefon.setText("");
                    txtKmail.setText("");
                    btnSil.setEnabled(false);
                    btnSatisYap.setEnabled(false);
                    btnOdemeAl.setEnabled(false);
                    btnDuzelt.setEnabled(false);
                    btnKaydet.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Silme hatası !");
                }
            } catch (Exception e) {
                System.err.println("Silme hatası : " + e);
            } finally {
                db.dbKapat();
            }
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnSatisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisYapActionPerformed
        SatisYonetimi sYonetimi=new SatisYonetimi(kid);
        sYonetimi.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnSatisYapActionPerformed

    private void btnOdemeAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdemeAlActionPerformed
        TahsilatForm tYonetimi=new TahsilatForm(kid);
        tYonetimi.setVisible(true);
    }//GEN-LAST:event_btnOdemeAlActionPerformed

    private void txtAraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyPressed
        
    }//GEN-LAST:event_txtAraKeyPressed

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
            java.util.logging.Logger.getLogger(CariHesaplarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CariHesaplarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CariHesaplarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CariHesaplarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CariHesaplarForm().setVisible(true);
            }
        });
    }
    ArrayList<Integer> idList = new ArrayList<>();
    String islemturu="";
    int islemDegeri;
    double bakiye;
    public void dataGetir() {
        try {
            String musteriQuery = "select *from musteriler ";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("E-posta");
            dtm.addColumn("Adres");

            while (rs.next()) {
                idList.add(rs.getInt("musterId"));
                dtm.addRow(new String[]{rs.getString("musteriAdi"), rs.getString("musteriSoyadi"), rs.getString("musteriTelefon"), rs.getString("musteriMail"), rs.getString("musteriAdres")});
            }
            tblMusteriler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        } finally {
            db.dbKapat();
        }
    }
    public void islemGecmisi(){
        try {
            String musteriQuery = "select *from tahsilat where kullaniId= '"+kid+"' ";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            DefaultTableModel dtm = new DefaultTableModel();
            bakiye=0;
            dtm.addColumn("İşlem NO");
            dtm.addColumn("İşlem Türü");
            dtm.addColumn("Tutar");
            if(kid>0){
            while (rs.next()) {
                double geciciDeger=Double.parseDouble(rs.getString("tahsilatTutar"));
                islemDegeri=Integer.parseInt(rs.getString("islemTuru"));
                if(islemDegeri==0){
                    islemturu ="Ürün Satışı";
                    bakiye-=geciciDeger;
                }else if(islemDegeri==1){
                    islemturu ="Peşin Alınan";
                    bakiye+=geciciDeger;
                }else{
                    islemturu ="Yapılan Ödeme";
                    bakiye+=geciciDeger;
                }
                dtm.addRow(new String[]{rs.getString("tahsilatId"), islemturu , rs.getString("tahsilatTutar")});
            }
            }
            tblHesapHareketleri.setModel(dtm);
            String KalanBakiye=bakiye+" TL";
            lblBakiye.setText(KalanBakiye);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        } finally {
            db.dbKapat();
        }
        
    }
    public void dataAra() {
        try {
            String aranan = txtAra.getText();
            String musteriQuery2 = "select *from musteriler where musteriAdi='" + aranan + "' or musteriSoyadi='" + aranan + "' or "
                    + "musteriTelefon='" + aranan + "' ";
            ResultSet rs = db.baglan().executeQuery(musteriQuery2);
            DefaultTableModel dtm = new DefaultTableModel();

            dtm.addColumn("Adı");
            dtm.addColumn("Soyadı");
            dtm.addColumn("Telefon");
            dtm.addColumn("E-posta");
            dtm.addColumn("Adres");

            while (rs.next()) {
                idList.add(rs.getInt("musterId"));
                dtm.addRow(new String[]{rs.getString("musteriAdi"), rs.getString("musteriSoyadi"), rs.getString("musteriTelefon"), rs.getString("musteriMail"), rs.getString("musteriAdres")});
            }
            tblMusteriler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        } finally {
            db.dbKapat();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnDuzelt;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnOdemeAl;
    private javax.swing.JButton btnSatisYap;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JLabel lblKadi;
    private javax.swing.JLabel lblKadres;
    private javax.swing.JLabel lblKmail;
    private javax.swing.JLabel lblKsoyadi;
    private javax.swing.JLabel lblKtelefon;
    private javax.swing.JPanel pnlHareketler;
    private javax.swing.JPanel pnlHesaplar;
    private javax.swing.JTable tblHesapHareketleri;
    private javax.swing.JTable tblMusteriler;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtKAdi;
    private javax.swing.JTextField txtKAdres;
    private javax.swing.JTextField txtKSoyadi;
    private javax.swing.JTextField txtKTelefon;
    private javax.swing.JTextField txtKmail;
    // End of variables declaration//GEN-END:variables
}
