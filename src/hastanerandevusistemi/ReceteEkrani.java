/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

/**
 *
 * @author Cankıvanç
 */
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReceteEkrani extends javax.swing.JFrame {

    /**
     * Creates new form ReceteEkrani
     */
    public ReceteEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasta_ad_alani = new javax.swing.JTextField();
        hasta_soyad_alani = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        recete_alani = new javax.swing.JTextArea();
        ilac_ad_alani = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        kullanim_talimati_alani = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        recete_butonu = new javax.swing.JButton();
        yazdir_butonu = new javax.swing.JButton();
        cikis_butonu = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hasta_ad_alani.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasta_ad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_ad_alaniActionPerformed(evt);
            }
        });

        hasta_soyad_alani.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasta_soyad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_soyad_alaniActionPerformed(evt);
            }
        });

        recete_alani.setEditable(false);
        recete_alani.setColumns(20);
        recete_alani.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        recete_alani.setRows(5);
        jScrollPane1.setViewportView(recete_alani);

        ilac_ad_alani.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        kullanim_talimati_alani.setColumns(20);
        kullanim_talimati_alani.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kullanim_talimati_alani.setRows(5);
        jScrollPane2.setViewportView(kullanim_talimati_alani);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Hasta Adı           :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Hasta Soyad       :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("İlaç Adı             :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Kullanım Talimatı :");

        recete_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        recete_butonu.setText("Reçete Oluştur");
        recete_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recete_butonuActionPerformed(evt);
            }
        });

        yazdir_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yazdir_butonu.setText("Yazdır");
        yazdir_butonu.setPreferredSize(new java.awt.Dimension(105, 23));
        yazdir_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazdir_butonuActionPerformed(evt);
            }
        });

        cikis_butonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cikis_butonu.setText("Çıkış");
        cikis_butonu.setPreferredSize(new java.awt.Dimension(105, 23));
        cikis_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_butonuActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hasta_soyad_alani)
                            .addComponent(ilac_ad_alani, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hasta_ad_alani)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(recete_butonu)
                        .addGap(46, 46, 46)
                        .addComponent(cikis_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(yazdir_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hasta_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hasta_soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ilac_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cikis_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recete_butonu))))
                .addGap(18, 18, 18)
                .addComponent(yazdir_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hasta_soyad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_soyad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasta_soyad_alaniActionPerformed

    private void hasta_ad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_ad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasta_ad_alaniActionPerformed

    private void recete_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recete_butonuActionPerformed
        String HastaAd = hasta_ad_alani.getText();
        String HastaSoyad = hasta_soyad_alani.getText();
        String Ilac = ilac_ad_alani.getText();
        String KullanimTalimati = kullanim_talimati_alani.getText();
        
        if (HastaAd.equals("") || HastaSoyad.equals("") || Ilac.equals("") || KullanimTalimati.equals("")) {
            mesaj_yazisi.setText("Reçete oluşturulamadı. Lütfen gerekli tüm alanları doldurunuz...");
        } else {
            mesaj_yazisi.setText("Reçeteniz oluşturuldu...");
            recete_alani.setText("");
            recete_alani.append("\t\n\tHASTANE RANDEVU SİSTEMİ\n" + "\t\tREÇETE\n"
                    + "\nHASTA ADI :" + HastaAd
                    + "\n\nHASTA SOYADI :" + HastaSoyad
                    + "\n\nİLAÇ ADI :" + Ilac
                    + "\n\nKULLANIM TALİMATI :" + KullanimTalimati);
        }
    }//GEN-LAST:event_recete_butonuActionPerformed

    private void yazdir_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazdir_butonuActionPerformed
        try {
            recete_alani.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ReceteEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_yazdir_butonuActionPerformed

    private void cikis_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_butonuActionPerformed
        dispose();
    }//GEN-LAST:event_cikis_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(ReceteEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceteEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceteEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceteEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceteEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis_butonu;
    private javax.swing.JTextField hasta_ad_alani;
    private javax.swing.JTextField hasta_soyad_alani;
    private javax.swing.JTextField ilac_ad_alani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea kullanim_talimati_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextArea recete_alani;
    private javax.swing.JButton recete_butonu;
    private javax.swing.JButton yazdir_butonu;
    // End of variables declaration//GEN-END:variables
}