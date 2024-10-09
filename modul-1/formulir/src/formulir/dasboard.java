/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulir;

/**
 *
 * @author pick
 */
public class dasboard extends javax.swing.JFrame {
    
 
    public dasboard(String nama, String kategori, String notelp, String email, String gender) {
        initComponents();
        namaarea2.setEditable(false);
        divisi1area.setEditable(false);
        gender1area.setEditable(false);
        notelp2area.setEditable(false);
        email2area.setEditable(false);
        
       this.namaarea2.setText(nama);         
       this.divisi1area.setText(kategori);   
       this.gender1area.setText(gender);     
       this.notelp2area.setText(notelp);     
       this.email2area.setText(email);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama1 = new javax.swing.JLabel();
        divisi2 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        notelp2 = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        namaarea2 = new javax.swing.JTextField();
        gender1area = new javax.swing.JTextField();
        notelp2area = new javax.swing.JTextField();
        email2area = new javax.swing.JTextField();
        divisi1area = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(67, 56, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA ANGGOTA PANITIA");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Event WeeBoo");

        nama1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nama1.setForeground(new java.awt.Color(255, 255, 255));
        nama1.setText("Nama :");

        divisi2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divisi2.setForeground(new java.awt.Color(255, 255, 255));
        divisi2.setText("Divisi :");

        gender1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gender1.setForeground(new java.awt.Color(255, 255, 255));
        gender1.setText("Jenis Kelamin :");

        notelp2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        notelp2.setForeground(new java.awt.Color(255, 255, 255));
        notelp2.setText("No. Telp :");

        email2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email2.setForeground(new java.awt.Color(255, 255, 255));
        email2.setText("Email :");

        namaarea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaarea2ActionPerformed(evt);
            }
        });

        gender1area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender1areaActionPerformed(evt);
            }
        });

        notelp2area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notelp2areaActionPerformed(evt);
            }
        });

        email2area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2areaActionPerformed(evt);
            }
        });

        divisi1area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisi1areaActionPerformed(evt);
            }
        });

        keluar.setText("simpan");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        batal.setText("kembali");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(nama1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gender1)
                                .addComponent(divisi2)
                                .addComponent(notelp2)
                                .addComponent(email2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(batal)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notelp2area)
                    .addComponent(email2area)
                    .addComponent(namaarea2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisi1area)
                    .addComponent(gender1area))
                .addGap(271, 271, 271))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar)
                .addGap(229, 229, 229))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama1)
                    .addComponent(namaarea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisi2)
                    .addComponent(divisi1area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender1)
                    .addComponent(gender1area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notelp2)
                    .addComponent(notelp2area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email2)
                    .addComponent(email2area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keluar)
                    .addComponent(batal))
                .addContainerGap(2029, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaarea2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaarea2ActionPerformed
        // TODO add your handling code here:
        namaarea2.setText("");
    }//GEN-LAST:event_namaarea2ActionPerformed

    private void gender1areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender1areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender1areaActionPerformed

    private void notelp2areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notelp2areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notelp2areaActionPerformed

    private void email2areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2areaActionPerformed

    private void divisi1areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisi1areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisi1areaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, 
            "Simpan Data Anggota?", "Konfirmasi", 
            javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    }

    }//GEN-LAST:event_keluarActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        form A =new form();
        A.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_batalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JTextField divisi1area;
    private javax.swing.JLabel divisi2;
    private javax.swing.JLabel email2;
    private javax.swing.JTextField email2area;
    private javax.swing.JLabel gender1;
    private javax.swing.JTextField gender1area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel nama1;
    private javax.swing.JTextField namaarea2;
    private javax.swing.JLabel notelp2;
    private javax.swing.JTextField notelp2area;
    // End of variables declaration//GEN-END:variables
}
