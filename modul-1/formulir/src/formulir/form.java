package formulir;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class form extends javax.swing.JFrame {
    public form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        waifu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        formulir = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        categori = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        notelp = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        namaArea = new javax.swing.JTextField();
        notelpArea = new javax.swing.JTextField();
        emailArea = new javax.swing.JTextField();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        perpustakaan = new javax.swing.JLabel();
        setuju = new javax.swing.JCheckBox();
        daftar = new javax.swing.JButton();
        profil = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        kategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        right.setBackground(new java.awt.Color(0, 102, 102));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        waifu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/108_by_dinocozero_d9epeb3.png"))); // NOI18N
        waifu.setText("jLabel10");

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(waifu, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(waifu))
        );

        jPanel1.add(right);
        right.setBounds(0, 0, 400, 500);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 500));

        formulir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        formulir.setForeground(new java.awt.Color(0, 102, 102));
        formulir.setText("FORMULIR PENDAFTARAN");

        nama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nama.setText("Nama :");

        categori.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categori.setText("Divisi :");

        gender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gender.setText("Jenis Kelamin :");

        notelp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        notelp.setText("No. Tlp. :");

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setText("Email :");

        namaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaAreaActionPerformed(evt);
            }
        });

        emailArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAreaActionPerformed(evt);
            }
        });

        buttonGroup1.add(laki);
        laki.setText("Laki - Laki");
        laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(perempuan);
        perempuan.setText("Perempuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        perpustakaan.setBackground(new java.awt.Color(0, 102, 102));
        perpustakaan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        perpustakaan.setForeground(new java.awt.Color(34, 123, 148));
        perpustakaan.setText("Panitia Event WeeBoo");

        setuju.setText("Saya Telah Mengisi Data Dengan Benar");
        setuju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setujuActionPerformed(evt);
            }
        });

        daftar.setBackground(new java.awt.Color(0, 102, 102));
        daftar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daftar.setForeground(new java.awt.Color(255, 255, 255));
        daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/row.png"))); // NOI18N
        daftar.setText("Simpan");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-profile.png"))); // NOI18N

        reset.setBackground(new java.awt.Color(153, 0, 0));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(153, 153, 153));
        batal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/out.png"))); // NOI18N
        batal.setText("Keluar");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Event Division", "Public Realtionship", "Media Creative", "Logistic", "F&B" }));
        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
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
                        .addComponent(formulir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(categori)
                            .addComponent(nama)
                            .addComponent(gender)
                            .addComponent(notelp)
                            .addComponent(email)
                            .addComponent(batal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notelpArea, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailArea, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(laki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perempuan))
                            .addComponent(setuju)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kategori, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(namaArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(daftar)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(profil)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(perpustakaan)
                        .addGap(118, 118, 118))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(profil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formulir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perpustakaan)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama)
                    .addComponent(namaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categori)
                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(laki)
                    .addComponent(perempuan))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notelp)
                    .addComponent(notelpArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(setuju)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftar)
                    .addComponent(reset)
                    .addComponent(batal))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAreaActionPerformed

    private void lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

    private void namaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaAreaActionPerformed

    private void setujuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setujuActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed

       String nama = namaArea.getText();
       String categori = kategori.getSelectedItem().toString();
       String notelp = notelpArea.getText();
       String email = emailArea.getText();
       String gender = "";
       
    if (!setuju.isSelected()) {
        JOptionPane.showMessageDialog(this, "setuju terlebih dahulu", "Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
        return; 
    }
         
    if (laki.isSelected()) {
        gender = "Laki-Laki";
    } else if (perempuan.isSelected()) {
        gender = "Perempuan";
    }
    
      if (gender.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pilih jenis kelamin Anda!", "Terjadi Kesalahan", JOptionPane.WARNING_MESSAGE);
        return; 
    }
    
       if (nama.isEmpty() || categori.isEmpty() || gender.isEmpty() || notelp.isEmpty() || email.isEmpty()){
           JOptionPane.showMessageDialog(this, "masukkan data yang lengkap!","Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
    } else {
           
        dasboard hasil = new dasboard(nama, categori, notelp, email, gender);
        hasil.setVisible(true);
        dispose();
          
       }
    }//GEN-LAST:event_daftarActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        namaArea.setText("");
        notelpArea.setText("");
        emailArea.setText("");
        setuju.setSelected(false);
        buttonGroup1.clearSelection();
        kategori.setSelectedIndex(-1);
    }//GEN-LAST:event_resetActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, 
            "Apakah Anda yakin ingin keluar?", "Konfirmasi", 
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_batalActionPerformed

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel categori;
    private javax.swing.JButton daftar;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailArea;
    private javax.swing.JLabel formulir;
    private javax.swing.JLabel gender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JRadioButton laki;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField namaArea;
    private javax.swing.JLabel notelp;
    private javax.swing.JTextField notelpArea;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JLabel perpustakaan;
    private javax.swing.JLabel profil;
    private javax.swing.JButton reset;
    private javax.swing.JPanel right;
    private javax.swing.JCheckBox setuju;
    private javax.swing.JLabel waifu;
    // End of variables declaration//GEN-END:variables
}
