package envanter;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ATAMAIDARI extends javax.swing.JFrame {

    String il = "";
    String ilce = "";
    String subeID = "";
//    DefaultComboBoxModel dcsube = new DefaultComboBoxModel();
//    DefaultComboBoxModel dcdil = new DefaultComboBoxModel();
//    DefaultComboBoxModel dcdilce = new DefaultComboBoxModel();
//    DefaultComboBoxModel dcilce = new DefaultComboBoxModel();
//     DefaultComboBoxModel illerdc = new DefaultComboBoxModel();

    public ATAMAIDARI() {
        initComponents();
        idariTabloGetir();
        illerComboGetir();
        ilcelerComboGetir();
        SubelerComboGetir();
        idariTabloDuzenleGetir();
        DuzenleilcelerComboGetir();
        DuzenleSubelerComboGetir();
        DuzenleİllerComboGetir();
        subeadibul();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("İDS ATAMA"));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ADI SOYADI:");

        jLabel2.setText("                                          ...SORUMLU OLDUĞU....");

        jLabel3.setText("ŞEHİR:");

        jLabel4.setText("İLÇE:");

        jLabel5.setText("ŞUBE:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2İtemStateChanged(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/envanter/atama.png"))); // NOI18N
        jButton1.setText("ŞUBEYE ATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/envanter/yonetici (2).png"))); // NOI18N
        jButton3.setText("İDS EKLEME EKRANI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("İDARİ İŞLER SORUMLUSU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1)
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(46, 46, 46))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ATAMA DÜZENLEME"));

        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("İDS DÜZENLEME"));

        jLabel12.setText("ŞUBE:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5İtemStateChanged(evt);
            }
        });

        jLabel11.setText("İLÇE:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4İtemStateChanged(evt);
            }
        });

        jLabel10.setText("ŞEHİR:");

        jLabel9.setText("                                          ...SORUMLU OLDUĞU....");

        jLabel8.setText("ADI SOYADI:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/envanter/duzenle.png"))); // NOI18N
        jButton2.setText("DÜZENLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("İDARİ İŞLER SORUMLUSU");

        jButton4.setText("Kişinin Atamasını Kaldır");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)))
                .addGap(155, 209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(80, 80, 80))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(732, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String idsID = "";
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        idsID = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged
        ilcelerComboGetir();
    }//GEN-LAST:event_jComboBox1İtemStateChanged

    private void jComboBox2İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2İtemStateChanged
        SubelerComboGetir();
    }//GEN-LAST:event_jComboBox2İtemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        subeIdBul();
        subeadibul();
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Atanacak Kişiyi Seçiniz..");
        } else if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şehir Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen İlçe Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else if (jComboBox3.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şube Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            try {
                DB db = new DB();
                int sonuc = db.baglan().executeUpdate("update subeler set sube_ids='" + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "' where sube_id='" + subeID + "'");
////                int sonucY = db.baglan().executeUpdate("insert into ids(ids_sub_id) values ('"+subeID+"') ");

                int sonucM = db.baglan().executeUpdate("update ids set ids_sub_id='" + subeID + "' where ids_id='" + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'");

                if (sonuc > 0 && sonucM > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Şubeye Atandı..");
                    idariTabloGetir();
                    idariTabloDuzenleGetir();
                    SubelerComboGetir();
                    jTextField1.setText("");
                    illerComboGetir();
                    ilcelerComboGetir();

                }
            } catch (Exception e) {
                System.err.println("atama hatası.." + e);

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EKLEMEIDARI EKLEME = new EKLEMEIDARI();
        EKLEME.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4İtemStateChanged
        DuzenleilcelerComboGetir();
    }//GEN-LAST:event_jComboBox4İtemStateChanged

    private void jComboBox5İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5İtemStateChanged
        DuzenleSubelerComboGetir();
    }//GEN-LAST:event_jComboBox5İtemStateChanged
    String idsAtamaDuzenle = "";
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        idsAtamaDuzenle = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        jTextField2.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        subeadibul();

        duzenlesubeIdBul();
        illerComboGetir();
        SubelerComboGetir();
        ilcelerComboGetir();
        subeDuzenleSubeIDbul();
        DB db = new DB();
        String bosVeri = null;
        if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Düzenlenecek Kişiyi Seçiniz..");
        } else if (jComboBox4.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şehir Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else if (jComboBox5.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen İlçe Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else if (jComboBox6.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Şube Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            try {
                int sonucN = db.baglan().executeUpdate("update subeler set sube_ids=null where sube_id='" + subeDuzenleID + "'");
                int sonuc = db.baglan().executeUpdate("update subeler set sube_ids='" + idsAtamaDuzenle + "' where sube_id='" + duzenleSubeID + "'");

////                int sonucY = db.baglan().executeUpdate("insert into ids(ids_sub_id) values ('"+subeID+"') ");
//                int sonucz = db.baglan().executeUpdate("update ids set ids_sub_id='"+subeID+"'");
                int sonucM = db.baglan().executeUpdate("update ids set ids_sub_id='" + duzenleSubeID + "' where ids_id='" + idsAtamaDuzenle + "'");

                if (sonuc > 0 && sonucM > 0) {

                    JOptionPane.showMessageDialog(rootPane, "İDS Güncellendi..");
                    idariTabloDuzenleGetir();
                    jTextField2.setText("");

                    jComboBox4.setSelectedIndex(0);
                    jComboBox5.setSelectedIndex(0);
                    jComboBox6.setSelectedIndex(0);

                }

            } catch (Exception e) {
                System.err.println("Güncelleme Hatası.." + e);
            }
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        subeadibul();

        duzenlesubeIdBul();
        illerComboGetir();
        SubelerComboGetir();
        ilcelerComboGetir();
        subeDuzenleSubeIDbul();
        DB db = new DB();
        String bosVeri = null;
        if(jTextField2.getText().equals(""))
        {JOptionPane.showMessageDialog(rootPane, "Tablodan Ataması kaldırılacak Kişiyi Seçiniz");}
        else {try {
            int sonucN = db.baglan().executeUpdate("update subeler set sube_ids=null where sube_id='" + subeDuzenleID + "'");
            int sonucM = db.baglan().executeUpdate("update ids set ids_sub_id=null where ids_id='" + idsAtamaDuzenle + "'");
            
            
            if (sonucN > 0 && sonucM > 0) {

                JOptionPane.showMessageDialog(rootPane, "Kişinin Şube Ataması Kaldırıldı ...");
                idariTabloDuzenleGetir();
                idariTabloGetir();

                jTextField2.setText("");

            }

        } catch (Exception e) {
            System.err.println("Güncelleme Hatası.." + e);
        
    }//GEN-LAST:event_jButton4ActionPerformed
        }}
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
            java.util.logging.Logger.getLogger(ATAMAIDARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATAMAIDARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATAMAIDARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATAMAIDARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATAMAIDARI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void idariTabloGetir() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID");
        table.addColumn("ADI");
//        table.addColumn("SOYADI");

        try {
            DB db = new DB();
            String a = "select * from ids";
            ResultSet rs = db.baglan().executeQuery(a);
            while (rs.next()) {
                String kontrol = rs.getString("ids_sub_id");
                if (kontrol == null) {
                    table.addRow(new String[]{rs.getString("ids_id"), rs.getString("ids_adi") + " " + rs.getString("ids_soyadi")});
                }

            }
            jTable1.setModel(table);
        } catch (Exception e) {
            System.err.println("Tablo Getirme Hatası..");
        }

    }

    private void ilcelerComboGetir() {

        il = jComboBox1.getSelectedItem().toString();
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select ilceler.ilce_adi as ilceadi from ilceler left JOIN sehirler on ilceler.il_id=sehirler.sehir_id where sehirler.sehir_adi='" + il + "'");
            dc.addElement("Lütfen İlçe Seçimi Yapınız");
            while (rs.next()) {
                dc.addElement(rs.getString("ilceadi"));
            }
            jComboBox2.setModel(dc);
        } catch (Exception e) {
        }

    }

    private void SubelerComboGetir() {

        ilce = jComboBox2.getSelectedItem().toString();
        DefaultComboBoxModel dcsube = new DefaultComboBoxModel();

        try {

            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select subeler.sube_ids as subeids,subeler.sube_adi as subeadi,subeler.sube_id as subeid from subeler LEFT JOIN ilceler on ilceler.il_id=subeler.sube_sehir_id LEFT JOIN sehirler on ilceler.il_id=sehirler.sehir_id where ilceler.ilce_adi='" + ilce + "' AND subeler.sube_ilce_id=ilceler.ilce_id");

            dcsube.addElement("Lütfen Şube Seçimi Yapınız");
            while (rs.next()) {
                String kontrol2 = rs.getString("subeids");
                if (kontrol2 == null) {
                    dcsube.addElement(rs.getString("subeadi"));
                }
            }
            jComboBox3.setModel(dcsube);
//            remove(jComboBox3.getSelectedIndex());

        } catch (Exception e) {
        }
    }
    String idariatamaSubesi = "";

    public void subeidsata() {

        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select sube_adi from subeler where sube_id='" + subeID + "'");
            while (rs.next()) {
                idariatamaSubesi = rs.getString("sube_adi");
                System.out.println("deneme id :" + idariatamaSubesi);
            }

        } catch (Exception e) {
            System.err.println("SubeID çekme Getirme Hatası.." + e);
        }
        System.out.println("Sube ID si sss : " + idariatamaSubesi);
    }

    private void illerComboGetir() {

        DefaultComboBoxModel illerdc = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select sehir_adi from sehirler");
            illerdc.addElement("Lütfen Şehir Seçimi Yapınız");
            while (rs.next()) {
                illerdc.addElement(rs.getString("sehir_adi"));
            }
            jComboBox1.setModel(illerdc);
        } catch (Exception e) {
        }
    }

    public void subeIdBul() {

        System.out.println("asdasd : " + jComboBox3.getSelectedItem().toString());
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select sube_id from subeler where sube_adi='" + jComboBox3.getSelectedItem().toString() + "'");
            while (rs.next()) {
                subeID = rs.getString("sube_id");
                System.out.println("deneme id :" + subeID);
            }

        } catch (Exception e) {
            System.err.println("SubeID çekme Getirme Hatası.." + e);
        }
        System.out.println("Sube ID si sss : " + subeID);
    }

    private void idariTabloDuzenleGetir() {
        subeadibul();
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("ID");
        table.addColumn("ADI");
//        table.addColumn("SOYADI");
        table.addColumn("SORUMLU OLDUĞU ŞUBE");
//        table.addColumn("SORUMLU OLDUĞU ŞEHİR");
//        table.addColumn("SORUMLU OLDUĞU ŞUBE");
//        table.addColumn("SOYADI");

        try {
            DB db = new DB();
            String a = "select * from ids LEFT JOIN subeler on subeler.sube_id=ids.ids_sub_id";
//            String b="SELECT  * from subeler left join ids on subeler.sube_ids=ids.ids_sub_id";

            ResultSet rs = db.baglan().executeQuery(a);

            while (rs.next()) {
                String kontrol = rs.getString("subeler.sube_adi");
                if (kontrol != null) {
                    table.addRow(new String[]{rs.getString("ids_id"), rs.getString("ids_adi") + " " + rs.getString("ids_soyadi"), rs.getString("subeler.sube_adi")});
                }

            }
            jTable2.setModel(table);
        } catch (Exception e) {
            System.err.println("Tablo Getirme Hatası..");
        }
    }

    private void DuzenleilcelerComboGetir() {
        il = jComboBox4.getSelectedItem().toString();
        DefaultComboBoxModel dcilce = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select ilceler.ilce_adi as ilceadi from ilceler left JOIN sehirler on ilceler.il_id=sehirler.sehir_id where sehirler.sehir_adi='" + il + "'");
            dcilce.addElement("Lütfen İlçe Seçimi Yapınız");
            while (rs.next()) {

                dcilce.addElement(rs.getString("ilceadi"));
            }
            jComboBox5.setModel(dcilce);
        } catch (Exception e) {
        }
    }

    private void DuzenleSubelerComboGetir() {
        ilce = jComboBox5.getSelectedItem().toString();
        DefaultComboBoxModel dcdilce = new DefaultComboBoxModel();
        try {

            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select subeler.sube_adi as subeadi,subeler.sube_id as subeid from subeler LEFT JOIN ilceler on ilceler.il_id=subeler.sube_sehir_id LEFT JOIN sehirler on ilceler.il_id=sehirler.sehir_id where ilceler.ilce_adi='" + ilce + "' AND subeler.sube_ilce_id=ilceler.ilce_id ");

            dcdilce.addElement("Lütfen Şube Seçimi Yapınız");
            while (rs.next()) {
                dcdilce.addElement(rs.getString("subeadi"));

            }
            jComboBox6.setModel(dcdilce);

        } catch (Exception e) {
        }
    }

    private void DuzenleİllerComboGetir() {

        DefaultComboBoxModel dcdil = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select sehir_adi from sehirler");
            dcdil.addElement("Lütfen Şehir Seçimi Yapınız");
            while (rs.next()) {
                dcdil.addElement(rs.getString("sehir_adi"));
            }
            jComboBox4.setModel(dcdil);
        } catch (Exception e) {
        }
    }
    String duzenleSubeID = "";

    public void duzenlesubeIdBul() {

        System.out.println("asdasd : " + jComboBox6.getSelectedItem().toString());
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select sube_id from subeler where sube_adi='" + jComboBox6.getSelectedItem().toString() + "'");
            while (rs.next()) {
                duzenleSubeID = rs.getString("sube_id");
                System.out.println("deneme id :" + duzenleSubeID);
            }

        } catch (Exception e) {
            System.err.println("SubeID çekme Getirme Hatası.." + e);
        }
        System.out.println("Sube ID si sss : " + duzenleSubeID);

    }
    String subeadi = "";

    public void subeadibul() {
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select* from subeler where sube_adi='" + jComboBox3.getSelectedItem().toString() + "'");
            rs.next();
            subeadi = rs.getString("sube_adi");

        } catch (Exception e) {
        }
    }
    String subeDuzenleID = "";

    public void subeDuzenleSubeIDbul() {
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("select* from subeler where sube_adi='" + jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString() + "'");
            rs.next();
            subeDuzenleID = rs.getString("sube_id");

        } catch (Exception e) {
        }
    }

//    public void atanmistablogetir() {
//        try {
//            DB db = new DB();
//            String query = "select * from subeler inner  join ids on subeler.sube_ids=ids.ids_sub_id ";
//            ResultSet rs = db.baglan().executeQuery(query);
//            rs.next();
//
//        } catch (Exception e) {
//        }
//
//    }
}
