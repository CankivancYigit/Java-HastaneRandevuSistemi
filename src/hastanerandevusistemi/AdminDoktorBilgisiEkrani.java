/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Cankıvanç
 */
public class AdminDoktorBilgisiEkrani extends javax.swing.JFrame {

    VeritabaniIslemleri islemler = new VeritabaniIslemleri();
    DefaultTableModel model;

    /**
     * Creates new form AdminDoktorBilgisiEkrani
     */
    public AdminDoktorBilgisiEkrani() {
        initComponents();
        model = (DefaultTableModel) doktor_tablosu.getModel();
        doktorTümBilgiGörüntüle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doktor_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        doktor_ad_alani = new javax.swing.JTextField();
        doktor_soyad_alani = new javax.swing.JTextField();
        doktor_bölüm_alani = new javax.swing.JTextField();
        doktor_kullanici_adi_alani = new javax.swing.JTextField();
        doktor_parola_alani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        doktor_ekle_butonu = new javax.swing.JButton();
        doktor_güncelle_butonu = new javax.swing.JButton();
        doktor_sil_butonu = new javax.swing.JButton();
        cikis_butonu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        doktor_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doktor ID", "Doktor Ad", "Doktor Soyad", "Doktor Bölüm", "Doktor Kullanıcı Adı", "Doktor Parola"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doktor_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doktor_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doktor_tablosu);
        if (doktor_tablosu.getColumnModel().getColumnCount() > 0) {
            doktor_tablosu.getColumnModel().getColumn(0).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(1).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(2).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(3).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(4).setResizable(false);
            doktor_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Doktor Ad                 :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Doktor Soyad            :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Doktor Bölüm            :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Doktor Kullanıcı Adı     :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Doktor Parola            :");

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        doktor_ekle_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doktor_ekle_butonu.setText("Yeni Doktor Ekle");
        doktor_ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktor_ekle_butonuActionPerformed(evt);
            }
        });

        doktor_güncelle_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doktor_güncelle_butonu.setText("Doktor Güncelle");
        doktor_güncelle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktor_güncelle_butonuActionPerformed(evt);
            }
        });

        doktor_sil_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doktor_sil_butonu.setText("Doktor Sil");
        doktor_sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktor_sil_butonuActionPerformed(evt);
            }
        });

        cikis_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cikis_butonu.setText("Çıkış Yap");
        cikis_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_butonuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Arama :");

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arama_cubugu))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(18, 18, 18)
                                                            .addComponent(doktor_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addGap(18, 18, 18)
                                                            .addComponent(doktor_soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(doktor_bölüm_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(doktor_kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(doktor_parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doktor_güncelle_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doktor_ekle_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doktor_sil_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cikis_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doktor_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doktor_soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doktor_bölüm_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doktor_kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(doktor_ekle_butonu)
                        .addGap(18, 18, 18)
                        .addComponent(doktor_güncelle_butonu)
                        .addGap(18, 18, 18)
                        .addComponent(doktor_sil_butonu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(doktor_parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(cikis_butonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased

        String ara = arama_cubugu.getText();
        dinamikAra(ara);

    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void doktor_ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktor_ekle_butonuActionPerformed
        mesaj_yazisi.setText("");

        String doktorAd = doktor_ad_alani.getText();
        String doktorSoyad = doktor_soyad_alani.getText();
        String doktorBölüm = doktor_bölüm_alani.getText();
        String doktorKullaniciAdi = doktor_kullanici_adi_alani.getText();
        String doktorParola = doktor_parola_alani.getText();

        if (doktorAd.equals("") || doktorSoyad.equals("") || doktorBölüm.equals("") || doktorKullaniciAdi.equals("") || doktorParola.equals("")) {
            mesaj_yazisi.setText("Doktor eklenemedi. Lütfen bütün alanları doldurunuz...");
        } else {
            islemler.doktorEkle(doktorAd, doktorSoyad, doktorBölüm, doktorKullaniciAdi, doktorParola);
            doktorTümBilgiGörüntüle();
            mesaj_yazisi.setText("Yeni doktor eklendi...");
            doktor_ad_alani.setText("");
            doktor_soyad_alani.setText("");
            doktor_bölüm_alani.setText("");
            doktor_kullanici_adi_alani.setText("");
            doktor_parola_alani.setText("");
        }

    }//GEN-LAST:event_doktor_ekle_butonuActionPerformed

    private void doktor_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doktor_tablosuMouseClicked
        int selectedRow = doktor_tablosu.getSelectedRow();

        doktor_ad_alani.setText(model.getValueAt(selectedRow, 1).toString());
        doktor_soyad_alani.setText(model.getValueAt(selectedRow, 2).toString());
        doktor_bölüm_alani.setText(model.getValueAt(selectedRow, 3).toString());
        doktor_kullanici_adi_alani.setText(model.getValueAt(selectedRow, 4).toString());
        doktor_parola_alani.setText(model.getValueAt(selectedRow, 5).toString());

    }//GEN-LAST:event_doktor_tablosuMouseClicked

    private void doktor_güncelle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktor_güncelle_butonuActionPerformed

        String doktorAd = doktor_ad_alani.getText();
        String doktorSoyad = doktor_soyad_alani.getText();
        String doktorBölüm = doktor_bölüm_alani.getText();
        String doktorKullaniciAdi = doktor_kullanici_adi_alani.getText();
        String doktorParola = doktor_parola_alani.getText();

        int selectedRow = doktor_tablosu.getSelectedRow();

        if (selectedRow == -1) {

            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Kayıtlı doktor bulunmamaktadır...");
            } else {
                mesaj_yazisi.setText("Lütfen güncellenecek bir kişi seçin...");
            }
        } else {

            int doktorID = (int) model.getValueAt(selectedRow, 0);
            islemler.doktorGüncelle(doktorID, doktorAd, doktorSoyad, doktorBölüm, doktorKullaniciAdi, doktorParola);
            doktorTümBilgiGörüntüle();
            mesaj_yazisi.setText("Doktor bilgisi başarıyla güncellendi...");
            doktor_ad_alani.setText("");
            doktor_soyad_alani.setText("");
            doktor_bölüm_alani.setText("");
            doktor_kullanici_adi_alani.setText("");
            doktor_parola_alani.setText("");
        }

    }//GEN-LAST:event_doktor_güncelle_butonuActionPerformed

    private void doktor_sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktor_sil_butonuActionPerformed
        mesaj_yazisi.setText("");

        int selectedRow = doktor_tablosu.getSelectedRow();

        if (selectedRow == -1) {

            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Kayıtlı doktor bulunmamaktadır...");
            } else {
                mesaj_yazisi.setText("Lütfen silinecek bir kişi seçin...");
            }
        } else {
            int doktorID = (int) model.getValueAt(selectedRow, 0);
            islemler.doktorSil(doktorID);
            doktorTümBilgiGörüntüle();
            mesaj_yazisi.setText("Doktor bilgisi başarıyla silindi...");
            doktor_ad_alani.setText("");
            doktor_soyad_alani.setText("");
            doktor_bölüm_alani.setText("");
            doktor_kullanici_adi_alani.setText("");
            doktor_parola_alani.setText("");
        }
    }//GEN-LAST:event_doktor_sil_butonuActionPerformed

    private void cikis_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_butonuActionPerformed
        dispose();
        doktor_ad_alani.setText("");
        doktor_soyad_alani.setText("");
        doktor_bölüm_alani.setText("");
        doktor_kullanici_adi_alani.setText("");
        doktor_parola_alani.setText("");
        mesaj_yazisi.setText("");
    }//GEN-LAST:event_cikis_butonuActionPerformed

    /**
     * @param args the command line arguments
     */
    public void doktorTümBilgiGörüntüle() {

        model.setRowCount(0);

        ArrayList<Doktor> doktorListe = new ArrayList<Doktor>();

        doktorListe = islemler.doktorTümBilgiGönder();

        if (doktorListe != null) {

            for (Doktor doktor : doktorListe) {

                Object[] eklenecek = {doktor.getId(), doktor.getAd(), doktor.getSoyad(), doktor.getBölüm(), doktor.getKullaniciAdi(), doktor.getParola()};
                model.addRow(eklenecek);
            }
        }
    }

    public void dinamikAra(String ara) {

        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        doktor_tablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
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
            java.util.logging.Logger.getLogger(AdminDoktorBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDoktorBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDoktorBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDoktorBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDoktorBilgisiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton cikis_butonu;
    private javax.swing.JTextField doktor_ad_alani;
    private javax.swing.JTextField doktor_bölüm_alani;
    private javax.swing.JButton doktor_ekle_butonu;
    private javax.swing.JButton doktor_güncelle_butonu;
    private javax.swing.JTextField doktor_kullanici_adi_alani;
    private javax.swing.JTextField doktor_parola_alani;
    private javax.swing.JButton doktor_sil_butonu;
    private javax.swing.JTextField doktor_soyad_alani;
    private javax.swing.JTable doktor_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    // End of variables declaration//GEN-END:variables
}
