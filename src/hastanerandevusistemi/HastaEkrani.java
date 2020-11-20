/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Cankıvanç
 */
public class HastaEkrani extends javax.swing.JFrame {

    DefaultTableModel model;
    VeritabaniIslemleri islemler = new VeritabaniIslemleri();
    GirisSayfasi girisSayfasi = new GirisSayfasi();

    /**
     * Creates new form HastaEkrani
     */
    public HastaEkrani() {
        initComponents();
        model = (DefaultTableModel) doktor_tablo.getModel();
        doktorGörüntüle();
      
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doktor_tablo = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bölüm_arama_combobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cikis_butonu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Randevu Almak istediğiniz Bölümü ve Doktoru Seçin.");

        doktor_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doktor Ad", "Doktor Soyad", "Bölüm"
            }
        ));
        doktor_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doktor_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doktor_tablo);

        arama_cubugu.setName(""); // NOI18N
        arama_cubugu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arama_cubuguMouseClicked(evt);
            }
        });
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Arama :");

        bölüm_arama_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tüm Bölümler", "Kardiyoloji", "Fizik Tedavi", "Üroloji", "Onkoloji", "Psikiyatri" }));
        bölüm_arama_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bölüm_arama_comboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Bölüm Arama :");

        cikis_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cikis_butonu.setText("Çıkış Yap");
        cikis_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_butonuActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Randevu Geçmişi");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(bölüm_arama_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cikis_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bölüm_arama_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(cikis_butonu)
                        .addGap(51, 51, 51))))
        );

        arama_cubugu.getAccessibleContext().setAccessibleParent(arama_cubugu);

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doktor_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doktor_tabloMouseClicked
        int secilensatir = doktor_tablo.getSelectedRow();
        RandevuEkrani randevuEkrani = new RandevuEkrani();
        randevuEkrani.setVisible(true);
        randevuEkrani.getDoktor_ad_alani().setText(model.getValueAt(secilensatir, 0).toString());
        randevuEkrani.getDoktor_soyad_alani().setText(model.getValueAt(secilensatir, 1).toString());
        randevuEkrani.getHastane_bölüm().setText(model.getValueAt(secilensatir, 2).toString());
        randevuEkrani.getHasta_ad_alani().setText(islemler.hastaGönder(GirisSayfasi.kullanici_adi).getAd());
        randevuEkrani.getHasta_soyad_alani().setText(islemler.hastaGönder(GirisSayfasi.kullanici_adi).getSoyad());

    }//GEN-LAST:event_doktor_tabloMouseClicked

    public void dinamikAra(String ara) {

        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        doktor_tablo.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased

        String ara = arama_cubugu.getText();

        dinamikAra(ara);

    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void bölüm_arama_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bölüm_arama_comboboxActionPerformed
         String bölümAra = bölüm_arama_combobox.getSelectedItem().toString();
         if (bölüm_arama_combobox.getSelectedIndex()==0) {
            doktorGörüntüle();
        }else{
             doktorBölümGörüntüle(bölümAra);
         }
         
        
    }//GEN-LAST:event_bölüm_arama_comboboxActionPerformed

    private void arama_cubuguMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arama_cubuguMouseClicked
        String ara = arama_cubugu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguMouseClicked

    private void cikis_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_butonuActionPerformed
        int cevap = JOptionPane.showConfirmDialog(rootPane, "Çıkış yapmak istediğinize emin misiniz?", "Çıkış Yap", JOptionPane.YES_NO_OPTION);
        if (cevap == JOptionPane.YES_OPTION) {
            setVisible(false);
            girisSayfasi.setVisible(true);
        }
       
    }//GEN-LAST:event_cikis_butonuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HastaRandevuListesiEkrani randevuListesiEkrani = new HastaRandevuListesiEkrani();
        randevuListesiEkrani.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void doktorGörüntüle() {

        model.setRowCount(0);

        ArrayList<Doktor> doktorListe = new ArrayList<Doktor>();

        doktorListe = islemler.doktorGönder();

        if (doktorListe != null) {

            for (Doktor doktor : doktorListe) {

                Object[] eklenecek = {doktor.getAd(), doktor.getSoyad(), doktor.getBölüm()};
                model.addRow(eklenecek);
            }
        }

    }

    public void doktorBölümGörüntüle(String bölümAdı) {

        model.setRowCount(0);

        ArrayList<Doktor> doktorBölümListe = new ArrayList<Doktor>();

        doktorBölümListe = islemler.doktorBölümGönder(bölümAdı);

        if (doktorBölümListe != null) {

            for (Doktor doktor : doktorBölümListe) {

                Object[] eklenecek = {doktor.getAd(), doktor.getSoyad(), doktor.getBölüm()};
                model.addRow(eklenecek);
            }
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
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JComboBox<String> bölüm_arama_combobox;
    private javax.swing.JButton cikis_butonu;
    private javax.swing.JTable doktor_tablo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
