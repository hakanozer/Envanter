package sehir;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class sehir extends javax.swing.JFrame {

    ArrayList<String> als = new ArrayList<>();
    public sehir() {
        initComponents();
        dataGetir();
        comboDoldur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Düzenle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        secim = jComboBox1.getSelectedItem().toString();
        if(secim.equals(jTextField1.getText())){
            JOptionPane.showMessageDialog(rootPane, "Düzenleme yapmadınız");
        }else if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Boş bırakamazsınız");
        }else{
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            Session sesi = sf.openSession();
            Transaction tr = sesi.beginTransaction();
            
            List ls = sesi.createSQLQuery("Select sehir_id from sehirler where sehir_adi='"+secim+"'").list();
            int a = 0;
            for (Object l : ls ){
               a=(int) l;
            }
            
            Sehirler shr = new Sehirler(a);
            shr.setSehirAdi(jTextField1.getText());
            shr.setSehirTarih(new Date());
            sesi.update(shr);
            tr.commit();
            sesi.close();
            dataGetir();
            comboDoldur();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    int id = 0;
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        id = jComboBox1.getSelectedIndex();
        jTextField1.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    String secim = "";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesi = sf.openSession();
        Transaction tr = sesi.beginTransaction();
        Sehirler sehir = new Sehirler();
        if (!jTextField1.getText().equals("")) {
            sehir.setSehirAdi(jTextField1.getText());
            sehir.setSehirTarih(new Date());
            int kontrol = (int) sesi.save(sehir);
            if (kontrol > 0) {
                JOptionPane.showMessageDialog(this, "kayıt basarıyla eklenmiştir");
                jTextField1.setText("");
            }
            tr.commit();
            sesi.close();
            dataGetir();
            comboDoldur();
        } else {
            JOptionPane.showMessageDialog(rootPane, "boş bırakamazsınız");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesi = sf.openSession();
        Transaction tr = sesi.beginTransaction();
        String id = als.get(jTable1.getSelectedRow());
        if(!id.equals("")){
        Sehirler sehir = new Sehirler(Integer.parseInt(id));
        int k = JOptionPane.showConfirmDialog(rootPane, "Silmek istediğinizden emin misiniz _?","Silme Uyarısı !",JOptionPane.YES_NO_OPTION);
        if(k==0)
            sesi.delete(sehir);
        jTextField1.setText("");
        tr.commit();
        sesi.close();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Silinicek Şehiri Tablodan seçiniz.");
        }
        dataGetir();
        comboDoldur();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void dataGetir() {
        als.clear();
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesi = sf.openSession();

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("sehirid");
        dt.addColumn("sehir adı");
        dt.addColumn("tarih");

        List<Sehirler> ls = sesi.createQuery("from Sehirler").list();
        for (Sehirler sehir : ls) {
            dt.addRow(new Object[]{sehir.getSehirId(), sehir.getSehirAdi(), sehir.getSehirTarih()});
            als.add(sehir.getSehirId().toString());
        }
        jTable1.setModel(dt);
        sesi.close();
    }
    
    private void comboDoldur() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sesi = sf.openSession();
        DefaultComboBoxModel cb= new DefaultComboBoxModel();
        cb.addElement("seciniz:");
        List<Sehirler> ls = sesi.createQuery("from Sehirler").list();
        for (Sehirler sehir : ls) {
            cb.addElement(sehir.getSehirAdi());
        }
        jComboBox1.setModel(cb);
        sesi.close();
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sehir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
