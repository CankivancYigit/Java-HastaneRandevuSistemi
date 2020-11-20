//Cankıvanç Yiğit N17136358 Bitirme Projesi
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastanerandevusistemi;

import javax.swing.JOptionPane;

/**
 *
 * @author Cankıvanç
 */
public class GirisSayfasi extends javax.swing.JFrame {

    VeritabaniIslemleri islemler = new VeritabaniIslemleri();

    public static String kullanici_adi, doktor_kullanici_adi;

    /**
     * Creates new form LoginSayfasi
     */
    public GirisSayfasi() {
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

        hasta_giris = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        parola_alanı = new javax.swing.JPasswordField();
        kayit_ol = new javax.swing.JButton();
        Mesaj_yazisi = new javax.swing.JLabel();
        doktor_giris = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasta_giris.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasta_giris.setText("Hasta Girişi");
        hasta_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_girisActionPerformed(evt);
            }
        });
        getContentPane().add(hasta_giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 89, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Parola        :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 89, -1));

        kullanici_adi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adi_alaniActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici_adi_alani, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, -1));
        getContentPane().add(parola_alanı, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, -1));

        kayit_ol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kayit_ol.setText("Kayıt Ol");
        kayit_ol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_olActionPerformed(evt);
            }
        });
        getContentPane().add(kayit_ol, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 130, 30));

        Mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Mesaj_yazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 226, 420, 28));

        doktor_giris.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doktor_giris.setText("Doktor Girişi");
        doktor_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktor_girisActionPerformed(evt);
            }
        });
        getContentPane().add(doktor_giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("HASTANE RANDEVU SİSTEMİ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 360, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_adi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adi_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanici_adi_alaniActionPerformed

    private void hasta_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_girisActionPerformed
        Mesaj_yazisi.setText("");

        kullanici_adi = kullanici_adi_alani.getText();
        String parola = new String(parola_alanı.getPassword());

        boolean girisbasarili = islemler.hastaGiris(kullanici_adi, parola);

        if (girisbasarili) {
            HastaEkrani hastaEkrani = new HastaEkrani();
            hastaEkrani.setVisible(true);
            kullanici_adi_alani.setText("");
            parola_alanı.setText("");
            this.setVisible(false);
        } else {

            Mesaj_yazisi.setText("Giriş Başarısız.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_hasta_girisActionPerformed

    private void kayit_olActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_olActionPerformed
        KayitSayfasi kayitSayfasi = new KayitSayfasi();
        kayitSayfasi.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_olActionPerformed

    private void doktor_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktor_girisActionPerformed
        Mesaj_yazisi.setText("");

        doktor_kullanici_adi = kullanici_adi_alani.getText();
        String parola = new String(parola_alanı.getPassword());

        boolean girisbasarili = islemler.doktorGiris(doktor_kullanici_adi, parola);

        if (girisbasarili) {
            //Mesaj_yazisi.setText("Giriş Başarılı. Hoşgeldiniz Doktor " + doktor_kullanici_adi);
            DoktorEkrani doktorEkrani = new DoktorEkrani();
            doktorEkrani.setVisible(true);
            kullanici_adi_alani.setText("");
            parola_alanı.setText("");
            this.setVisible(false);
        } else {
            //doktor girisinde kullanıcı adı ve parola admin olarak girilirse admin sayfasına giris yapılır. 
            if (doktor_kullanici_adi.equals("admin") && parola.equals("admin")) {
                AdminEkrani adminEkrani = new AdminEkrani();
                adminEkrani.setVisible(true);
                this.setVisible(false);
            } else {
                Mesaj_yazisi.setText("Giriş Başarısız.");
            }
        }
    }//GEN-LAST:event_doktor_girisActionPerformed

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
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mesaj_yazisi;
    private javax.swing.JButton doktor_giris;
    private javax.swing.JButton hasta_giris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton kayit_ol;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JPasswordField parola_alanı;
    // End of variables declaration//GEN-END:variables
}
