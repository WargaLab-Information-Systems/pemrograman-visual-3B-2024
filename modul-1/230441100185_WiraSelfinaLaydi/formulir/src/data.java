
import javax.swing.ButtonGroup;

public class data extends javax.swing.JFrame {    
    public data() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlformulir = new javax.swing.JLabel();
        jlutm = new javax.swing.JLabel();
        jlalamatutm = new javax.swing.JLabel();
        jlnotelp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlnama = new javax.swing.JLabel();
        jltempatlahir = new javax.swing.JLabel();
        jljeniskelamin = new javax.swing.JLabel();
        jlalamat = new javax.swing.JLabel();
        jlhp = new javax.swing.JLabel();
        jlemail = new javax.swing.JLabel();
        jlprodi = new javax.swing.JLabel();
        jlfakultas = new javax.swing.JLabel();
        jtnama = new javax.swing.JTextField();
        jtttl = new javax.swing.JTextField();
        jtalamat = new javax.swing.JTextField();
        jtHP = new javax.swing.JTextField();
        jtemail = new javax.swing.JTextField();
        jtprodi = new javax.swing.JTextField();
        jcfakultas = new javax.swing.JComboBox<>();
        jrlaki = new javax.swing.JRadioButton();
        jrperempuan = new javax.swing.JRadioButton();
        jcekbox = new javax.swing.JCheckBox();
        batal = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jlformulir.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jlformulir.setText("FORMULIR PENDAFTARAN MAHASISWA");

        jlutm.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jlutm.setText("UNIVERSITAS ENAM HARI MADURA");

        jlalamatutm.setText("JL. Raya Telang, PO. Box 2 Kamal, Bangkalan-Madura");

        jlnotelp.setText("Telp : (031) 3011146, Fax. (031) 3011506");

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jlnama.setForeground(new java.awt.Color(255, 255, 255));
        jlnama.setText("Nama :");

        jltempatlahir.setForeground(new java.awt.Color(255, 255, 255));
        jltempatlahir.setText("Tempat Lahir :");

        jljeniskelamin.setForeground(new java.awt.Color(255, 255, 255));
        jljeniskelamin.setText("Jenis Kelamin :");

        jlalamat.setForeground(new java.awt.Color(255, 255, 255));
        jlalamat.setText("Alamat :");

        jlhp.setForeground(new java.awt.Color(255, 255, 255));
        jlhp.setText("No. Telp :");

        jlemail.setForeground(new java.awt.Color(255, 255, 255));
        jlemail.setText("Email :");

        jlprodi.setForeground(new java.awt.Color(255, 255, 255));
        jlprodi.setText("Prodi :");

        jlfakultas.setForeground(new java.awt.Color(255, 255, 255));
        jlfakultas.setText("Fakultas :");

        jtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnamaActionPerformed(evt);
            }
        });

        jtttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtttlActionPerformed(evt);
            }
        });

        jcfakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Teknik", "FISIP", "Pertanian", "Keislaman", "Pendidikan", "Ekonomi&Bisnis" }));
        jcfakultas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcfakultasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcfakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcfakultasActionPerformed(evt);
            }
        });

        jeniskelamin.add(jrlaki);
        jrlaki.setForeground(new java.awt.Color(255, 255, 255));
        jrlaki.setText("Laki-laki");
        jrlaki.setActionCommand("");

        jeniskelamin.add(jrperempuan);
        jrperempuan.setForeground(new java.awt.Color(255, 255, 255));
        jrperempuan.setText("Perempuan");
        jrperempuan.setActionCommand("");
        jrperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrperempuanActionPerformed(evt);
            }
        });

        jcekbox.setForeground(new java.awt.Color(255, 255, 255));
        jcekbox.setText("Data Yang Saya Masukkan Sudah Benar.");
        jcekbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcekboxActionPerformed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlnama)
                            .addGap(51, 51, 51)
                            .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jltempatlahir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtttl))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jljeniskelamin)
                                .addComponent(jlalamat)
                                .addComponent(jlhp)
                                .addComponent(jlemail)
                                .addComponent(jlprodi)
                                .addComponent(jlfakultas))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtalamat)
                                .addComponent(jtHP)
                                .addComponent(jtemail)
                                .addComponent(jtprodi)
                                .addComponent(jcfakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jrlaki)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrperempuan))))
                        .addComponent(Simpan, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(batal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reset))
                        .addComponent(jcekbox)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnama)
                    .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jltempatlahir)
                    .addComponent(jtttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jljeniskelamin)
                    .addComponent(jrlaki)
                    .addComponent(jrperempuan))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlalamat)
                    .addComponent(jtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlhp)
                    .addComponent(jtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlemail)
                    .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlprodi)
                    .addComponent(jtprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlfakultas)
                    .addComponent(jcfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcekbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batal)
                    .addComponent(Reset)
                    .addComponent(Simpan))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jlformulir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jlutm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jlnotelp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jlalamatutm)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlformulir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlutm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlalamatutm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlnotelp))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrperempuanActionPerformed
    }//GEN-LAST:event_jrperempuanActionPerformed
    private void jtttlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtttlActionPerformed
    }//GEN-LAST:event_jtttlActionPerformed
    private void jcfakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcfakultasActionPerformed
    }//GEN-LAST:event_jcfakultasActionPerformed
    private void jcfakultasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcfakultasAncestorAdded
    }//GEN-LAST:event_jcfakultasAncestorAdded
    private void jcekboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcekboxActionPerformed
    }//GEN-LAST:event_jcekboxActionPerformed
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(jrlaki);
        genderGroup.add(jrperempuan);
        
        jtnama.setText("");
        jtttl.setText("");
        jtalamat.setText("");
        genderGroup.clearSelection();
        jtHP.setText("");
        jtemail.setText("");
        jtprodi.setText("");
        jcfakultas.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed
    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        String nama = jtnama.getText();
        String ttl = jtttl.getText();
         if (nama.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "isi data terlebih dahulu!");
            return;
        }
        if (ttl.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "isi data terlebih dahulu!");
            return;
    }
        String jeniskelamin;
        if (jrlaki.isSelected() == true){
            jeniskelamin = "Laki-laki";
        } else if (jrperempuan.isSelected() == true){
            jeniskelamin = "Perempuan";
        } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Jenis kelamin harus diisi!");
        return;
        }
        String alamat = jtalamat.getText();
        String hp = jtHP.getText();
        String email = jtemail.getText();
        String prodi = jtprodi.getText();
        if (alamat.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "isi data terlebih dahulu!");
        return;
    }
    if (hp.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "isi data terlebih dahulu!");
        return;
    }
    if (email.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "isi data terlebih dahulu!");
        return;
    }
    if (prodi.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "isi data terlebih dahulu!");
        return;
    }
        String fakultas;
        if (jcfakultas.getSelectedIndex() == 1){
            fakultas = "Teknik";
        } else if (jcfakultas.getSelectedIndex() == 2){
            fakultas = "FISIP";
        } else if (jcfakultas.getSelectedIndex() == 3){
            fakultas = "Pertanian";
        }else if (jcfakultas.getSelectedIndex() == 4){
            fakultas = "Keislaman";
        }else if (jcfakultas.getSelectedIndex() == 5){
            fakultas = "Pendidikan";
        }else if (jcfakultas.getSelectedIndex() == 6){
            fakultas = "Ekonomi&Bisnis";
        } else {
           javax.swing.JOptionPane.showMessageDialog(this, "Fakultas harus dipilih!");
        return; 
        }
        String checkbox;
        if (jcekbox.isSelected() == true){
            checkbox = "";
        } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Checkbox harus dicentang!");
        return;
        }
        hasil hsl = new hasil(nama, ttl ,jeniskelamin, alamat, hp, email, prodi, fakultas);
        hsl.setVisible(true);
        dispose();   
    }//GEN-LAST:event_SimpanActionPerformed
    private void jtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnamaActionPerformed
    }//GEN-LAST:event_jtnamaActionPerformed
    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_batalActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton Simpan;
    private javax.swing.JButton batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcekbox;
    private javax.swing.JComboBox<String> jcfakultas;
    private javax.swing.ButtonGroup jeniskelamin;
    private javax.swing.JLabel jlalamat;
    private javax.swing.JLabel jlalamatutm;
    private javax.swing.JLabel jlemail;
    private javax.swing.JLabel jlfakultas;
    private javax.swing.JLabel jlformulir;
    private javax.swing.JLabel jlhp;
    private javax.swing.JLabel jljeniskelamin;
    private javax.swing.JLabel jlnama;
    private javax.swing.JLabel jlnotelp;
    private javax.swing.JLabel jlprodi;
    private javax.swing.JLabel jltempatlahir;
    private javax.swing.JLabel jlutm;
    private javax.swing.JRadioButton jrlaki;
    private javax.swing.JRadioButton jrperempuan;
    private javax.swing.JTextField jtHP;
    private javax.swing.JTextField jtalamat;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtnama;
    private javax.swing.JTextField jtprodi;
    private javax.swing.JTextField jtttl;
    // End of variables declaration//GEN-END:variables
}
