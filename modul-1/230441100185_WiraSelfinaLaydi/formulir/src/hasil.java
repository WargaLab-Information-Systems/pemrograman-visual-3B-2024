public class hasil extends javax.swing.JFrame {
    String nama;
    String tempat;
    String jeniskelamin;
    String alamat;
    String notelp;
    String email;
    String prodi;
    String fakultas;

    public hasil(String nama, String tempatlahir, String jeniskelamin, String alamat, String notelp, String email, String prodi, String fakultas) {
        initComponents();
        this.nama = nama;
        this.tempat = tempatlahir;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
        this.prodi = prodi;
        this.fakultas = fakultas;
        jtnama1.setText(nama);
        jttl1.setText(tempatlahir);
        jtjeniskelamin1.setText(jeniskelamin);
        jtalamat1.setText(alamat);
        jtHP1.setText(notelp);
        jtemail1.setText(email);
        jtprodi1.setText(prodi);
        jfakultas1.setText(fakultas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlnama1 = new javax.swing.JLabel();
        jltempatlahir = new javax.swing.JLabel();
        jljeniskelamin1 = new javax.swing.JLabel();
        jlalamat1 = new javax.swing.JLabel();
        jlHP = new javax.swing.JLabel();
        jlemail1 = new javax.swing.JLabel();
        jlprodi1 = new javax.swing.JLabel();
        jlfakultas1 = new javax.swing.JLabel();
        jbkeluar = new javax.swing.JButton();
        jtnama1 = new javax.swing.JTextField();
        jttl1 = new javax.swing.JTextField();
        jtjeniskelamin1 = new javax.swing.JTextField();
        jtalamat1 = new javax.swing.JTextField();
        jtHP1 = new javax.swing.JTextField();
        jtemail1 = new javax.swing.JTextField();
        jtprodi1 = new javax.swing.JTextField();
        jfakultas1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("UNIVERSITAS ENAM HARI MADURA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("JL. Raya Telang, PO. Box 2 Kamal, Bangkalan-Madura");

        jLabel3.setText("Telp : (031) 3011146, Fax. (031) 3011506");

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jlnama1.setForeground(new java.awt.Color(255, 255, 255));
        jlnama1.setText("Nama :");

        jltempatlahir.setForeground(new java.awt.Color(255, 255, 255));
        jltempatlahir.setText("Tempat Lahir :");

        jljeniskelamin1.setForeground(new java.awt.Color(255, 255, 255));
        jljeniskelamin1.setText("Jenis Kelamin");

        jlalamat1.setForeground(new java.awt.Color(255, 255, 255));
        jlalamat1.setText("Alamat :");

        jlHP.setForeground(new java.awt.Color(255, 255, 255));
        jlHP.setText("No. Telp :");

        jlemail1.setForeground(new java.awt.Color(255, 255, 255));
        jlemail1.setText("Email :");

        jlprodi1.setForeground(new java.awt.Color(255, 255, 255));
        jlprodi1.setText("Prodi :");

        jlfakultas1.setForeground(new java.awt.Color(255, 255, 255));
        jlfakultas1.setText("Fakultas :");

        jbkeluar.setText("Keluar");
        jbkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbkeluarActionPerformed(evt);
            }
        });

        jtnama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnama1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jltempatlahir)
                                    .addComponent(jljeniskelamin1)))
                            .addComponent(jlalamat1)
                            .addComponent(jlHP)
                            .addComponent(jlemail1)
                            .addComponent(jlprodi1)
                            .addComponent(jlfakultas1)
                            .addComponent(jlnama1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtnama1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(jttl1)
                            .addComponent(jtjeniskelamin1)
                            .addComponent(jtalamat1)
                            .addComponent(jtHP1)
                            .addComponent(jtemail1)
                            .addComponent(jtprodi1)
                            .addComponent(jfakultas1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbkeluar)))
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlnama1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jtnama1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jttl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jltempatlahir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jljeniskelamin1)
                            .addComponent(jtjeniskelamin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlalamat1)
                            .addComponent(jtalamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlHP)
                            .addComponent(jtHP1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlemail1)
                            .addComponent(jtemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtprodi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlprodi1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfakultas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlfakultas1))))
                .addGap(18, 18, 18)
                .addComponent(jbkeluar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbkeluarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbkeluarActionPerformed

    private void jtnama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnama1ActionPerformed
    }//GEN-LAST:event_jtnama1ActionPerformed

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
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasil("","","","","","", "", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbkeluar;
    private javax.swing.JTextField jfakultas1;
    private javax.swing.JLabel jlHP;
    private javax.swing.JLabel jlalamat1;
    private javax.swing.JLabel jlemail1;
    private javax.swing.JLabel jlfakultas1;
    private javax.swing.JLabel jljeniskelamin1;
    private javax.swing.JLabel jlnama1;
    private javax.swing.JLabel jlprodi1;
    private javax.swing.JLabel jltempatlahir;
    private javax.swing.JTextField jtHP1;
    private javax.swing.JTextField jtalamat1;
    private javax.swing.JTextField jtemail1;
    private javax.swing.JTextField jtjeniskelamin1;
    private javax.swing.JTextField jtnama1;
    private javax.swing.JTextField jtprodi1;
    private javax.swing.JTextField jttl1;
    // End of variables declaration//GEN-END:variables
}
