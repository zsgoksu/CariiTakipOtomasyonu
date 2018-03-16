/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Paint;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Zeki
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        labelDoldur();
        grafikCiz();
    }

    CariHesaplarForm cariForm = new CariHesaplarForm();
    HesapAyarlariForm ayarlarForm = new HesapAyarlariForm();
    KasaIslemleriForm kasaForm = new KasaIslemleriForm();
    RaporlarForm2 raporForm = new RaporlarForm2();
    SatisYonetimi satisForm = new SatisYonetimi(-1);
    UrunYonetimiForm urunForm = new UrunYonetimiForm();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCariHesaplar = new javax.swing.JButton();
        btnSatisYonetim = new javax.swing.JButton();
        btnUrunYonetim = new javax.swing.JButton();
        btnRaporlar = new javax.swing.JButton();
        btnHesapAyarlari = new javax.swing.JButton();
        btnKasaIslemleri = new javax.swing.JButton();
        btnKullaniciDegis = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblKasaDurumu = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblStokToplam = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblBugunkuSatis = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZSG | Cari Hesap Programı");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCariHesaplar.setText("CARİ HESAPLAR");
        btnCariHesaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariHesaplarActionPerformed(evt);
            }
        });

        btnSatisYonetim.setText("SATIŞ YÖNETİMİ");
        btnSatisYonetim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisYonetimActionPerformed(evt);
            }
        });

        btnUrunYonetim.setText("ÜRÜN YÖNETİMİ");
        btnUrunYonetim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunYonetimActionPerformed(evt);
            }
        });

        btnRaporlar.setText("RAPORLAR");
        btnRaporlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaporlarActionPerformed(evt);
            }
        });

        btnHesapAyarlari.setText("HESAP AYARLARI");
        btnHesapAyarlari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHesapAyarlariActionPerformed(evt);
            }
        });

        btnKasaIslemleri.setText("KASA İŞLEMLERİ");
        btnKasaIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasaIslemleriActionPerformed(evt);
            }
        });

        btnKullaniciDegis.setText("Kullanıcı Değiştir");
        btnKullaniciDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciDegisActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(2, 188, 141));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Kasa Durumu");

        lblKasaDurumu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblKasaDurumu.setText("0,00 TL");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kasaicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblKasaDurumu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblKasaDurumu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(239, 111, 108));

        jLabel4.setBackground(new java.awt.Color(239, 111, 108));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stok Bakiyesi");

        lblStokToplam.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStokToplam.setText("0 ADET");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stokicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addComponent(lblStokToplam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStokToplam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(65, 139, 202));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Bugünkü Satışlar");

        lblBugunkuSatis.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBugunkuSatis.setText("0,00 TL");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kasa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblBugunkuSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBugunkuSatis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pnlChart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlChartLayout = new javax.swing.GroupLayout(pnlChart);
        pnlChart.setLayout(pnlChartLayout);
        pnlChartLayout.setHorizontalGroup(
            pnlChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlChartLayout.setVerticalGroup(
            pnlChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCariHesaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSatisYonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUrunYonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRaporlar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHesapAyarlari, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKasaIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(btnKullaniciDegis)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCariHesaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSatisYonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUrunYonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRaporlar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHesapAyarlari, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnKasaIslemleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnKullaniciDegis))
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1342, 854));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSatisYonetimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisYonetimActionPerformed
        satisForm.setVisible(true);
    }//GEN-LAST:event_btnSatisYonetimActionPerformed

    private void btnRaporlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaporlarActionPerformed
        raporForm.setVisible(true);
    }//GEN-LAST:event_btnRaporlarActionPerformed

    private void btnCariHesaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariHesaplarActionPerformed
        cariForm.setVisible(true);
    }//GEN-LAST:event_btnCariHesaplarActionPerformed

    private void btnUrunYonetimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunYonetimActionPerformed
        urunForm.setVisible(true);
    }//GEN-LAST:event_btnUrunYonetimActionPerformed

    private void btnHesapAyarlariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHesapAyarlariActionPerformed
        ayarlarForm.setVisible(true);
    }//GEN-LAST:event_btnHesapAyarlariActionPerformed

    private void btnKasaIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKasaIslemleriActionPerformed
        kasaForm.setVisible(true);
    }//GEN-LAST:event_btnKasaIslemleriActionPerformed

    private void btnKullaniciDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciDegisActionPerformed
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKullaniciDegisActionPerformed

    public void labelDoldur() {
        DBConnection db2 = new DBConnection();
        DBConnection db3 = new DBConnection();
        try {
            String urunlerQuery = "select sum(tahsilatTutar) as toplamGelir from tahsilat where date(islemTarihi)=date('now') and islemTuru='0'";
            ResultSet rs = db2.baglan().executeQuery(urunlerQuery);
            lblBugunkuSatis.setText(rs.getString("toplamGelir") + " TL");

        } catch (Exception e) {
            System.err.println("satis okuma hatası...");
        } finally {
            db2.dbKapat();
        }
        try {
            String urunlerQuery = "select sum(urunStok) as toplamstok from urunler";
            ResultSet rs = db2.baglan().executeQuery(urunlerQuery);
            lblStokToplam.setText("Toplam Ürün Stoğu :" + rs.getString("toplamStok") + " Adet");

        } catch (Exception e) {
            System.err.println("stok okuma hatası...");
        } finally {
            db2.dbKapat();
        }
        try {
            String urunlerQuery = "select sum(tahsilatTutar) as toplamGelir from tahsilat where date(islemTarihi)=date('now') and islemTuru='0'";
            String urunlerQuery2 = "select sum(tahsilatTutar) as toplamGelir from tahsilat where date(islemTarihi)=date('now') and islemTuru='0'";
            ResultSet rs = db2.baglan().executeQuery(urunlerQuery);

            ResultSet rs2 = db3.baglan().executeQuery(urunlerQuery2);
            lblKasaDurumu.setText(rs.getString("toplamGelir") + " TL");

        } catch (Exception e) {
            System.err.println("satis okuma hatası...");
        } finally {
            db2.dbKapat();
            db3.dbKapat();
        }
    }

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    public void kisitla(String yetki) {
        switch (yetki) {

            case "0":
                btnHesapAyarlari.setVisible(false);
                btnRaporlar.setVisible(false);
                btnKasaIslemleri.setVisible(false);
                break;
            case "2":
                break;
            case "1":
                btnHesapAyarlari.setVisible(false);
                break;
            default:
                break;
        }
    }

    public void grafikCiz() {
        DBConnection db = new DBConnection();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String reportDate = sdf.format(date);
        System.out.println("reportDate :" + reportDate);
        XYSeries series = new XYSeries("7 Günlük Satış Grafiği");
        try {
            db.baglan();
            for (int i = 0; i < 6; i++) {
                cal.add(Calendar.DAY_OF_MONTH, -1);
                date = cal.getTime();
                reportDate = sdf.format(date);
                String Vericek = "select sum(tahsilatTutar) as toplamGelir from tahsilat where date(islemTarihi)=date('" + reportDate + "') and islemTuru='0'";
                ResultSet rs = db.baglan().executeQuery(Vericek);
                
                int tarih = date.getDay();
                series.add(tarih, rs.getInt("toplamGelir"));
                db.dbKapat();
            }
            db.dbKapat();

        } catch (Exception e) {
        } finally {
            db.dbKapat();
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(null, null, null, dataset, PlotOrientation.VERTICAL, true, false, false);
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setDomainZoomable(true);

        pnlChart.setLayout(new BorderLayout());
        pnlChart.add(chartpanel, BorderLayout.NORTH);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariHesaplar;
    private javax.swing.JButton btnHesapAyarlari;
    private javax.swing.JButton btnKasaIslemleri;
    private javax.swing.JButton btnKullaniciDegis;
    private javax.swing.JButton btnRaporlar;
    private javax.swing.JButton btnSatisYonetim;
    private javax.swing.JButton btnUrunYonetim;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBugunkuSatis;
    private javax.swing.JLabel lblKasaDurumu;
    private javax.swing.JLabel lblStokToplam;
    private javax.swing.JPanel pnlChart;
    // End of variables declaration//GEN-END:variables

}
