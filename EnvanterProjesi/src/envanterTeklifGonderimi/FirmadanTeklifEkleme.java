package envanterteklif;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FirmadanTeklifEkleme extends javax.swing.JFrame {

    String firmaID = "";
    String aciklamaSon = null;
    Map<String, String> teklifAciklama2 = new HashMap<String, String>();
    

    public FirmadanTeklifEkleme() {
        initComponents();
        jTextField1.setEnabled(false);
        jTextField1.setText(TeklifGonderimi.teklifAdi);
        jComboBox2.setSelectedItem((Object) TeklifGonderimi.urunTuru);
        jComboBox2.setEnabled(false);

        firmaCombobox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Firmalardan Teklif Ekleme");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Teklif Adı");

        jLabel2.setText("Teklif veren Firma");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel3.setText("Teklif Ürün Adedi");

        jLabel4.setText("Teklif Açıklama");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("Ürün Birim Fiyatı (TL)");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lütfen Seçiminizi Yapınız ...", "Zimmet", "Demirbaş" }));
        jComboBox2.setToolTipText("");

        jLabel7.setText("Ürün Türü");

        jButton1.setText("Teklif Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Firma Teklif İşlemi Sonu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jScrollPane1)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Firma Teklif İşlemi Sonu(Firma Teklif Kaydı) YAPMADAN çıkmak istediğinizden emin misiniz ?", "Eklenen Firma Tekliflerini Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (sonkarar == 0) {
            firmateklifisil();
        }
    }//GEN-LAST:event_formWindowClosing
    public void firmateklifisil() {
        DB db = new DB();
        try {

            int sonuc = db.baglan().executeUpdate("delete from teklifler where teklif_tekliflistesi_id=" + TeklifGonderimi.teklifID);

            if (sonuc > 0) {
                JOptionPane.showMessageDialog(rootPane, "Eklenen Firma Teklifleri Silindi ...");
                TeklifGonderimi.teklifAciklama.clear();

            }

        } catch (Exception e) {
            System.err.println("Kategori Silme Hatası : " + e);
        } finally {
            db.kapat();
        }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextArea1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else if (jComboBox1.getSelectedItem().equals("Lütfen Seçiminizi Yapınız ...")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Teklif Veren Firma Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            firmaIDBulma();
            String teklifKontrol = "";
            ArrayList<String> teklifsilinecekID=new ArrayList<String>();
            try {
                DB db = new DB();
                int sonuc = db.baglan().executeUpdate("insert into teklifler values(null,'" + jTextField1.getText() + "', '" + TeklifGonderimi.teklifID + "','" + firmaID + "','" + jTextArea1.getText() + "','" + jTextField2.getText() + "','" + jTextField3.getText() + "','Onay Bekliyor','" + jComboBox2.getSelectedItem().toString() + "',now());");
                if (sonuc > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Firmadan Teklif Ekleme işlemi başarılı ...");
                    TeklifGonderimi.teklifAciklama.put((jComboBox1.getSelectedItem().toString() + " isimli Firmanın " + jTextField1.getText() + " isimli teklif için teklifi "), jTextField3.getText() + " TL");
                    teklifAciklama2.put((jComboBox1.getSelectedItem().toString() + " isimli Firmanın " + jTextField1.getText() + " isimli teklif için teklifi "), jTextField3.getText() + " TL");
                    jTextField3.setText("");
                    jComboBox1.setSelectedIndex(0);
                    jTextField3.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Firmadan Teklif Ekleme işlemi başarısız ...");
                }
            } catch (Exception e) {
                System.out.println("Firmadan Teklif Ekleme Hatası : " + e);
                JOptionPane.showMessageDialog(rootPane, "Firmadan Teklif Ekleme başarısız ...");
            }

             ////////////////TeklifKontrolü////////////////////////
            firmaIDBulma();
            DB db = new DB();
            try {
                
                ResultSet rs = db.baglan().executeQuery("select * from teklifler where teklif_firma_id='" + firmaID + "' and teklif_tekliflistesi_id=" + TeklifGonderimi.teklifID);

                while (rs.next()) {
                    if(rs.next()){
                    teklifKontrol = "1";
                    rs.previous();}
                    teklifsilinecekID.add(rs.getString("teklif_id"));
                }
                if (!rs.next()) {
                    teklifKontrol = "";
                }

            } catch (Exception e) {
            } finally {
                db.kapat();
            }

            /////////////////////Kontrol Sonrası Güncellenen Teklifi Silme//////////////////////
            if (teklifKontrol.equals("1")) {
              db = new DB();
            try {

                int sonuc = db.baglan().executeUpdate("delete from teklifler where teklif_id=" +teklifsilinecekID.get(teklifsilinecekID.size()-1));

                if (sonuc > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Firma Teklifi Güncellendi ...");
                    teklifsilinecekID.clear();

                }

            } catch (Exception e) {
                System.err.println("Kategori Silme Hatası : " + e);
            } finally {
                db.kapat();
            }  
            }
            

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TeklifGonderimi.metaphaseEditor2.setVisible(true);
        TeklifGonderimi.metaphaseEditor2.setDocument(String.valueOf(TeklifGonderimi.teklifAciklama).replace("{", "").replace("}", "") + "\n");
        TeklifGonderimi.jButton4.setEnabled(true);
        TeklifGonderimi.jLabel3.setText("Durum :  Teklif Hazırlandı Açıklama Ekleyip Onaya Gönderebilirsiniz ");
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField3KeyPressed

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
            java.util.logging.Logger.getLogger(FirmadanTeklifEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirmadanTeklifEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirmadanTeklifEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirmadanTeklifEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirmadanTeklifEkleme().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
public void firmaCombobox() {
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        DB db = new DB();
        try {
            ResultSet rs = db.baglan().executeQuery("select firma_adi from firmalar");
            dc.addElement("Lütfen Seçiminizi Yapınız ...");
            while (rs.next()) {
                dc.addElement(rs.getString("firma_adi"));

            }
            jComboBox1.setModel(dc);
        } catch (Exception e) {
        } finally {
            db.kapat();
        }
    }

    public void firmaIDBulma() {
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        DB db = new DB();
        try {
            ResultSet rs = db.baglan().executeQuery("select firma_id from firmalar where firma_adi='" + jComboBox1.getSelectedItem().toString() + "'");

            while (rs.next()) {
                firmaID = rs.getString("firma_id");
            }

        } catch (Exception e) {
        } finally {
            db.kapat();
        }
    }
}
