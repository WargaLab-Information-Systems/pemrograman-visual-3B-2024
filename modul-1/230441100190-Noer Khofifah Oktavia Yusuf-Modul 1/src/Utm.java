/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

  
public class Utm extends javax.swing.JFrame {

        public Utm(){
            initComponents();
        }
   
void setData(String nama, String tempatlahir, String tanggallahir, String jenisKelamin, String alamat, String NoTelp, String email, String prodi, String fakultas) {
      jTNama.setText(nama);
      jTTempatLahir.setText(tempatlahir);
      jTTanggalLahir.setText(tanggallahir);
      jTJenisKelamin.setText(jenisKelamin);
      jTAlamat.setText(alamat);
      jTNoTlp.setText(NoTelp);
      jTEmail.setText(email);
      jTProdi.setText(prodi);
      jTFakultas.setText(fakultas);
     setVisible(true);
      jTNama.setEditable(false);
      jTTempatLahir.setEditable(false);
      jTTanggalLahir.setEditable(false);
      jTJenisKelamin.setEditable(false);
      jTAlamat.setEditable(false);
      jTNoTlp.setEditable(false);
      jTEmail.setEditable(false);
      jTProdi.setEditable(false);
      jTFakultas.setEditable(false);
      
      setVisible(true);
      
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLNama = new javax.swing.JLabel();
        jLTempatLahir = new javax.swing.JLabel();
        jLTanggalLahir = new javax.swing.JLabel();
        jLJenisKelamin = new javax.swing.JLabel();
        jLAlamat = new javax.swing.JLabel();
        jLNoTelp = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLProdi = new javax.swing.JLabel();
        jLFakultas = new javax.swing.JLabel();
        jBKeluar = new javax.swing.JButton();
        jTNama = new javax.swing.JTextField();
        jTTempatLahir = new javax.swing.JTextField();
        jTTanggalLahir = new javax.swing.JTextField();
        jTJenisKelamin = new javax.swing.JTextField();
        jTAlamat = new javax.swing.JTextField();
        jTNoTlp = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jTProdi = new javax.swing.JTextField();
        jTFakultas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("UNIVERSITAS TRUNOJOYO MADURA");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Jl.Raya Telang, PO.BOX 2 kamal, Bangkalan-madura");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Telp 085950072703");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLNama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLNama.setForeground(new java.awt.Color(255, 255, 255));
        jLNama.setText("Nama :");

        jLTempatLahir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTempatLahir.setForeground(new java.awt.Color(255, 255, 255));
        jLTempatLahir.setText("Tempat Lahir :");

        jLTanggalLahir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLTanggalLahir.setForeground(new java.awt.Color(255, 255, 255));
        jLTanggalLahir.setText("Tanggal Lahir :");

        jLJenisKelamin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLJenisKelamin.setForeground(new java.awt.Color(255, 255, 255));
        jLJenisKelamin.setText("Jenis Kelamin :");

        jLAlamat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLAlamat.setForeground(new java.awt.Color(255, 255, 255));
        jLAlamat.setText("Alamat :");

        jLNoTelp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLNoTelp.setForeground(new java.awt.Color(255, 255, 255));
        jLNoTelp.setText("No.Telp :");

        jLEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLEmail.setText("Email :");

        jLProdi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLProdi.setForeground(new java.awt.Color(255, 255, 255));
        jLProdi.setText("Prodi :");

        jLFakultas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLFakultas.setForeground(new java.awt.Color(255, 255, 255));
        jLFakultas.setText("Fakultas :");

        jBKeluar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jBKeluar.setText("Keluar");
        jBKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKeluarActionPerformed(evt);
            }
        });

        jTNama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNamaActionPerformed(evt);
            }
        });

        jTTempatLahir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTempatLahirActionPerformed(evt);
            }
        });

        jTTanggalLahir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTanggalLahirActionPerformed(evt);
            }
        });

        jTJenisKelamin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTAlamat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTNoTlp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTProdi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTFakultas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTFakultas.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBKeluar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLNama)
                            .addGap(79, 79, 79)
                            .addComponent(jTNama, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLTempatLahir)
                                        .addComponent(jLTanggalLahir)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLAlamat)
                                        .addComponent(jLJenisKelamin)
                                        .addComponent(jLNoTelp)
                                        .addComponent(jLEmail)
                                        .addComponent(jLProdi)
                                        .addComponent(jLFakultas))))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTTempatLahir)
                                .addComponent(jTTanggalLahir)
                                .addComponent(jTJenisKelamin)
                                .addComponent(jTAlamat)
                                .addComponent(jTNoTlp)
                                .addComponent(jTEmail)
                                .addComponent(jTProdi)
                                .addComponent(jTFakultas)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(jLNama)
                                                                    .addComponent(jTNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(19, 19, 19)
                                                                .addComponent(jTTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLTempatLahir))
                                                        .addGap(19, 19, 19)
                                                        .addComponent(jTTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLTanggalLahir))
                                                .addGap(19, 19, 19)
                                                .addComponent(jTJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLJenisKelamin))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLAlamat))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLNoTelp))
                                        .addGap(19, 19, 19)
                                        .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLEmail))
                                .addGap(40, 40, 40))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLProdi)
                                .addComponent(jTProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLFakultas)
                        .addComponent(jTFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jBKeluar)
                .addGap(41, 41, 41))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Al Fariz\\Documents\\semester 3\\itc.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGap(156, 156, 156))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBKeluarActionPerformed

    private void jTTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTanggalLahirActionPerformed

    private void jTNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNamaActionPerformed

    private void jTTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTempatLahirActionPerformed

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
            java.util.logging.Logger.getLogger(Utm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBKeluar;
    private javax.swing.JLabel jLAlamat;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFakultas;
    private javax.swing.JLabel jLJenisKelamin;
    private javax.swing.JLabel jLNama;
    private javax.swing.JLabel jLNoTelp;
    private javax.swing.JLabel jLProdi;
    private javax.swing.JLabel jLTanggalLahir;
    private javax.swing.JLabel jLTempatLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTAlamat;
    public javax.swing.JTextField jTEmail;
    public javax.swing.JTextField jTFakultas;
    public javax.swing.JTextField jTJenisKelamin;
    public javax.swing.JTextField jTNama;
    public javax.swing.JTextField jTNoTlp;
    public javax.swing.JTextField jTProdi;
    public javax.swing.JTextField jTTanggalLahir;
    public javax.swing.JTextField jTTempatLahir;
    // End of variables declaration//GEN-END:variables
}
