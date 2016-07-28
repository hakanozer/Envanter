package envanterteklif;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class TeklifGonderimi extends javax.swing.JFrame {

    //Global Değişkenler ...
    public static Map<String, String> teklifAciklama = new HashMap<String, String>();
    public static String teklifID = null;
    public static String teklifAdi = null;
    public static String urunTuru = null;
    Boolean teklifSilinmeKontrol=false;
    public TeklifGonderimi(GraphicsConfiguration gc) {
        super(gc);
    }
   

    public TeklifGonderimi() {
        initComponents();

        metaphaseEditor2.setVisible(false);
        jTextField1.setEnabled(false);
        jTextField1.setText("");
        jTextField1.setEditable(false);
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jLabel3.setForeground(Color.BLUE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        metaphaseEditor2 = new com.metaphaseeditor.MetaphaseEditor();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teklif Gönderme");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Firmadan Teklif Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        metaphaseEditor2.setEditorToolTipText("null");
        metaphaseEditor2.setMaximumSize(new java.awt.Dimension(700, 500));
        metaphaseEditor2.setMinimumSize(new java.awt.Dimension(700, 500));
        metaphaseEditor2.setOpaque(true);
        metaphaseEditor2.setPreferredSize(new java.awt.Dimension(700, 500));
        metaphaseEditor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                metaphaseEditor2KeyReleased(evt);
            }
        });

        jButton2.setText("Teklif Oluştur");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Teklif ID : ");

        jLabel2.setText("Teklif Adı(Ürün Adı) : ");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel3.setText("Durum :  İşlem Bekleniyor ....");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lütfen Seçiminizi Yapınız ...", "Zimmet", "Demirbaş" }));

        jLabel4.setText("Lütfen Ürün Türünü Seçiniz                             :");

        jButton3.setText("Hazırlanan Teklifi Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Teklifi Onaya Gönder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                    .addComponent(metaphaseEditor2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(metaphaseEditor2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FirmadanTeklifEkleme firmadanTeklifEkleme = new FirmadanTeklifEkleme();
        firmadanTeklifEkleme.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void metaphaseEditor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_metaphaseEditor2KeyReleased

    }//GEN-LAST:event_metaphaseEditor2KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Teklif Oluşturmak İçin Teklif Adını Giriniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
            jTextField2.requestFocus();
        } else if (jComboBox1.getSelectedItem().equals("Lütfen Seçiminizi Yapınız ...")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Ürün Türü Seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
            jTextField1.setText("");

        } else {
            jComboBox1.setEnabled(false);
            try {
                urunTuru = jComboBox1.getSelectedItem().toString();
                DB db = new DB();
                String bos = "";
                int sonuc = db.baglan().executeUpdate("insert into tekliflistesi values(null,'" + jTextField2.getText() + "', '" + bos + "',now(),null);");
                if (sonuc > 0) {
                    jButton1.setEnabled(true);
                    jButton2.setEnabled(false);
                    jTextField2.setEnabled(false);
                    jLabel3.setText("Durum :  Teklif oluşturuldu ...");
                    jButton3.setEnabled(true);
                    teklifAdi = jTextField2.getText();
                    teklifSilinmeKontrol=true;

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Teklif Oluşturma işlemi başarısız ...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Teklif Oluşturma işlemi başarısız ...");
            }

        }
        teklifListesiIDCek();
        jTextField1.setText(teklifID);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField2KeyPressed
    public void firmateklifisil() {
        DB db = new DB();
        try {

            int sonuc = db.baglan().executeUpdate("delete from teklifler where teklif_tekliflistesi_id=" + TeklifGonderimi.teklifID);

            if (sonuc > 0) {
                teklifSilinmeKontrol=true;
                TeklifGonderimi.teklifAciklama.clear();

            }

        } catch (Exception e) {
            System.err.println("Eklenen Firma Silme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }

    public void firmaTeklifListesisil() {
        DB db = new DB();
        try {

            int sonuc = db.baglan().executeUpdate("delete from tekliflistesi where tekliflistesi_id=" + teklifID);

            if (sonuc > 0) {
                JOptionPane.showMessageDialog(rootPane, "Hazırlanan Teklif Silindi ve Eklenen Firma Teklifleri silindi ...");
                TeklifGonderimi.teklifAciklama.clear();

            }

        } catch (Exception e) {
            System.err.println("Hazırlanan Teklif Silme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Hazırlanan Teklifi ve Eklenen Firma Tekliflerini silmek istediğinizden emin misiniz ? ?", "Eklenen Firma Tekliflerini Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (sonkarar == 0) {
            firmateklifisil();
            firmaTeklifListesisil();
            metaphaseEditor2.setVisible(false);
            jTextField1.setEnabled(false);
            jTextField1.setText("");
            jTextField1.setEditable(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(true);
            jButton3.setEnabled(false);
            jComboBox1.setEnabled(true);
            jTextField2.setEnabled(true);
            jButton4.setEnabled(false);
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            teklifID = "";
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (teklifSilinmeKontrol) {
        jButton3ActionPerformed(null);    
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DB db = new DB();
        try {

            int sonuc = db.baglan().executeUpdate("update tekliflistesi set tekliflistesi_aciklama='" + metaphaseEditor2.getDocument() + "' where tekliflistesi_id=" + teklifID);
            if (sonuc > 0) {
                JOptionPane.showMessageDialog(rootPane, "Teklifi Onaya Gönderme İşlemi Başarılı ...");
                teklifSilinmeKontrol=false;
                metaphaseEditor2.setVisible(false);
                jTextField1.setEnabled(false);
                jTextField1.setText("");
                jTextField1.setEditable(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                jButton3.setEnabled(false);
                jComboBox1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField2.setText("");
                jComboBox1.setSelectedIndex(0);
                jLabel3.setText("Durum :  İşlem Bekleniyor ....");
                jLabel3.setForeground(Color.BLUE);
                teklifID = "";
                jButton4.setEnabled(false);
            }

        } catch (Exception e) {
            System.err.println("Personel Düzenleme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }//GEN-LAST:event_jButton4ActionPerformed
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
            java.util.logging.Logger.getLogger(TeklifGonderimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeklifGonderimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeklifGonderimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeklifGonderimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeklifGonderimi().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public static com.metaphaseeditor.MetaphaseEditor metaphaseEditor2;
    // End of variables declaration//GEN-END:variables
public void teklifListesiIDCek() {
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select tekliflistesi_id from tekliflistesi where tekliflistesi_adi='" + jTextField2.getText() + "'");
            while (rs.next()) {
                teklifID = rs.getString("tekliflistesi_id");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Teklif Listesi ID getirme Hatası ", "Uyarı", JOptionPane.OK_OPTION, null);
        }
    }
}
