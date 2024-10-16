package pendaftaran;
import javax.swing.JOptionPane; 
import javax.swing.JTextField; 
import javax.swing.ButtonGroup;

public class Daftar extends javax.swing.JFrame {

    public Daftar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Nama = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        TTL = new javax.swing.JLabel();
        Hobi = new javax.swing.JLabel();
        Usia = new javax.swing.JLabel();
        Kota = new javax.swing.JLabel();
        PC = new javax.swing.JLabel();
        Telfon = new javax.swing.JLabel();
        Deskripsi = new javax.swing.JLabel();
        IsiNama = new javax.swing.JTextField();
        IsiTTL = new javax.swing.JTextField();
        UsiaIsi = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        IsiHobi = new javax.swing.JTextField();
        IsiTelfon = new javax.swing.JTextField();
        jRadioPerempuan = new javax.swing.JRadioButton();
        jRadioTidak = new javax.swing.JRadioButton();
        jRadioLakiLaki = new javax.swing.JRadioButton();
        Tema = new javax.swing.JLabel();
        jCheckBoxFantasy = new javax.swing.JCheckBox();
        jCheckBoxFurry = new javax.swing.JCheckBox();
        jCheckBoxCyberpunk = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        IsiDeskripsi = new javax.swing.JTextArea();
        Riset = new javax.swing.JButton();
        Daftar = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioIya = new javax.swing.JRadioButton();
        jCheckBoxKerajaan = new javax.swing.JCheckBox();
        IsiKota = new javax.swing.JTextField();
        Setuju = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Nama.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Nama.setText("NAMA                                    :");

        Gender.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Gender.setText("GENDER                                :");

        TTL.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        TTL.setText("TEMPAT/TGL LAHIR            :");

        Hobi.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Hobi.setText("HOBI/KELEBIHAN                :");

        Usia.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Usia.setText("USIA SAAT INI                      :");

        Kota.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Kota.setText("ASAL KOTA                           :");

        PC.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        PC.setText("APA ANDA MEMILIKI PC    :");

        Telfon.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Telfon.setText("NO. TELFON                          :");

        Deskripsi.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Deskripsi.setText("DESKRIPSIKAN DIRI ANDA :");

        IsiNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiNamaActionPerformed(evt);
            }
        });

        IsiTTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiTTLActionPerformed(evt);
            }
        });

        UsiaIsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18 Tahun", "19 Tahun", "20 Tahun", "21+ Tahun" }));
        UsiaIsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsiaIsiMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel14.setText("Keterangan: Max Usia 25 Tahun");

        IsiHobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiHobiActionPerformed(evt);
            }
        });

        IsiTelfon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiTelfonActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioPerempuan);
        jRadioPerempuan.setText("PEREMPUAN");

        buttonGroup2.add(jRadioTidak);
        jRadioTidak.setText("TIDAK");
        jRadioTidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTidakActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioLakiLaki);
        jRadioLakiLaki.setText("LAKI-LAKI");
        jRadioLakiLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioLakiLakiActionPerformed(evt);
            }
        });

        Tema.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Tema.setText("TEMA YANG ANDA SUKA   :");

        jCheckBoxFantasy.setText("FANTASY");

        jCheckBoxFurry.setText("FURRY");
        jCheckBoxFurry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFurryActionPerformed(evt);
            }
        });

        jCheckBoxCyberpunk.setText("CYBERPUNK");
        jCheckBoxCyberpunk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCyberpunkActionPerformed(evt);
            }
        });

        IsiDeskripsi.setColumns(20);
        IsiDeskripsi.setRows(5);
        IsiDeskripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiDeskripsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(IsiDeskripsi);

        Riset.setBackground(new java.awt.Color(204, 204, 204));
        Riset.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        Riset.setText("Riset");
        Riset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RisetMouseClicked(evt);
            }
        });

        Daftar.setBackground(new java.awt.Color(102, 204, 255));
        Daftar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        Daftar.setText("Daftar");
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });

        Batal.setBackground(new java.awt.Color(255, 51, 102));
        Batal.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Bodoni Bd BT", 0, 24)); // NOI18N
        jLabel1.setText("PENDAFTARAN AGENSI VTUBER");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Bosan Menjadi 3D? Ini Dapat Menjadi Solusi Bagi Anda Agar Dapat Menjadi Anime.");

        jLabel3.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        jLabel3.setText("Jadilah Bagian Dari Agensi Kami Sekarang!");

        jLabel5.setFont(new java.awt.Font("Square721 BT", 0, 12)); // NOI18N
        jLabel5.setText("Isi Data Diri Anda Dengan Sebenar-benarnya!");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\logo.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(521, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        buttonGroup2.add(jRadioIya);
        jRadioIya.setText("IYA");
        jRadioIya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioIyaActionPerformed(evt);
            }
        });

        jCheckBoxKerajaan.setText("KERAJAAN");
        jCheckBoxKerajaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxKerajaanActionPerformed(evt);
            }
        });

        IsiKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiKotaActionPerformed(evt);
            }
        });

        Setuju.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Setuju.setText("Saya Telah Mengisi Data Diri Saya Dengan Sebenar-benarnya.");
        Setuju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetujuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PC)
                            .addComponent(Kota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jCheckBoxFantasy, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jCheckBoxFurry, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jCheckBoxCyberpunk)
                                .addGap(47, 47, 47)
                                .addComponent(jCheckBoxKerajaan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jRadioIya, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(298, 298, 298)
                                .addComponent(jRadioTidak, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IsiTelfon, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Tema)
                        .addComponent(Telfon)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(59, 59, 59))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Usia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Hobi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(32, 32, 32)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(UsiaIsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(IsiTTL)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jRadioPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioLakiLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addComponent(IsiNama)
                                .addComponent(IsiHobi)
                                .addComponent(IsiKota)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Setuju)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Deskripsi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(3, 3, 3))))
                .addGap(399, 399, 399))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Riset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(456, 456, 456))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nama)
                    .addComponent(IsiNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(jRadioPerempuan)
                    .addComponent(jRadioLakiLaki))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TTL)
                    .addComponent(IsiTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usia)
                    .addComponent(UsiaIsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hobi)
                    .addComponent(IsiHobi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kota)
                    .addComponent(IsiKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PC)
                    .addComponent(jRadioIya)
                    .addComponent(jRadioTidak))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telfon)
                    .addComponent(IsiTelfon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxFurry)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tema)
                        .addComponent(jCheckBoxKerajaan)
                        .addComponent(jCheckBoxCyberpunk)
                        .addComponent(jCheckBoxFantasy)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deskripsi)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Setuju)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Riset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IsiTTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiTTLActionPerformed
        
    }//GEN-LAST:event_IsiTTLActionPerformed

    private void IsiNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiNamaActionPerformed
        
    }//GEN-LAST:event_IsiNamaActionPerformed

    private void IsiHobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiHobiActionPerformed
        
    }//GEN-LAST:event_IsiHobiActionPerformed

    private void IsiTelfonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiTelfonActionPerformed
        
    }//GEN-LAST:event_IsiTelfonActionPerformed

    private void jCheckBoxFurryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFurryActionPerformed
        
    }//GEN-LAST:event_jCheckBoxFurryActionPerformed

    private void jCheckBoxCyberpunkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCyberpunkActionPerformed
        
    }//GEN-LAST:event_jCheckBoxCyberpunkActionPerformed

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
         
         if (IsiNama.getText().isEmpty() || 
            IsiTTL.getText().isEmpty() || 
            IsiHobi.getText().isEmpty() || 
            IsiKota.getText().isEmpty() || 
            IsiTelfon.getText().isEmpty() || 
            IsiDeskripsi.getText().isEmpty() || 
            (!jRadioPerempuan.isSelected() && !jRadioLakiLaki.isSelected()) || 
            (!jRadioIya.isSelected() && !jRadioTidak.isSelected()) || 
            UsiaIsi.getSelectedIndex() == -1 || 
            (!jCheckBoxFantasy.isSelected() && !jCheckBoxFurry.isSelected() && !jCheckBoxCyberpunk.isSelected() && !jCheckBoxKerajaan.isSelected() && !Setuju.isSelected())) {


            JOptionPane.showMessageDialog(this, "Data harus diisi semua", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
            }
         
        if (Setuju.isSelected()) {
            Daftar2 frm2 = new Daftar2();
            String gender = "";
            if (jRadioLakiLaki.isSelected()) {
                gender = "Laki-Laki";
            } else if (jRadioPerempuan.isSelected()) {
                gender = "Perempuan";
            }
            String tema = "";
            if (jCheckBoxFantasy.isSelected()) {
                tema += "Fantasy, ";
            }
            if (jCheckBoxFurry.isSelected()) {
                tema += "Furry, ";
            }
            if (jCheckBoxCyberpunk.isSelected()) {
                tema += "Cyberpunk, ";
            }
            if (jCheckBoxKerajaan.isSelected()) {
                tema += "Kerajaan";
            }
            String pc = "";
            if (jRadioIya.isSelected()) {
                pc = "Iya";
            } else if (jRadioTidak.isSelected()) {
                pc = "Tidak";
            }
            frm2.setLabel(IsiNama.getText(), IsiTTL.getText(), (String) UsiaIsi.getSelectedItem(), IsiHobi.getText(), IsiKota.getText(), IsiTelfon.getText(), IsiDeskripsi.getText(), gender, tema, pc);
            frm2.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum mengklik 'Saya telah mengisi data dengan sebenar-benarnya'., silakan klik checkbox untuk melanjutkan.");
        }
    }//GEN-LAST:event_DaftarActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        dispose();
    }//GEN-LAST:event_BatalActionPerformed

    private void jRadioTidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTidakActionPerformed
        
    }//GEN-LAST:event_jRadioTidakActionPerformed

    private void jRadioIyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioIyaActionPerformed
       
    }//GEN-LAST:event_jRadioIyaActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void jCheckBoxKerajaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxKerajaanActionPerformed
       
    }//GEN-LAST:event_jCheckBoxKerajaanActionPerformed

    private void IsiKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiKotaActionPerformed
    
    }//GEN-LAST:event_IsiKotaActionPerformed

    private void UsiaIsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsiaIsiMouseClicked
    
    }//GEN-LAST:event_UsiaIsiMouseClicked

    private void IsiDeskripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiDeskripsiMouseClicked
        
    }//GEN-LAST:event_IsiDeskripsiMouseClicked

    private void SetujuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetujuMouseClicked
    
    }//GEN-LAST:event_SetujuMouseClicked

    private void RisetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RisetMouseClicked
           ButtonGroup Gender = new ButtonGroup();{
            IsiNama.setText("");
            IsiTTL.setText("");
            UsiaIsi.setSelectedIndex(-1);
            IsiHobi.setText("");
            IsiKota.setText("");
            IsiTelfon.setText("");
            IsiDeskripsi.setText("");
            Gender.clearSelection();
            jCheckBoxFantasy.setSelected(false);
            jCheckBoxFurry.setSelected(false);
            jCheckBoxCyberpunk.setSelected(false);
            jCheckBoxKerajaan.setSelected(false);
            jRadioIya.setSelected(false);
            jRadioTidak.setSelected(false);
            Setuju.setSelected(false);
            Daftar.setEnabled(false);}

    }//GEN-LAST:event_RisetMouseClicked

    private void jRadioLakiLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioLakiLakiActionPerformed

    }//GEN-LAST:event_jRadioLakiLakiActionPerformed

    
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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JButton Daftar;
    private javax.swing.JLabel Deskripsi;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Hobi;
    private javax.swing.JTextArea IsiDeskripsi;
    private javax.swing.JTextField IsiHobi;
    private javax.swing.JTextField IsiKota;
    private javax.swing.JTextField IsiNama;
    private javax.swing.JTextField IsiTTL;
    private javax.swing.JTextField IsiTelfon;
    private javax.swing.JLabel Kota;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel PC;
    private javax.swing.JButton Riset;
    private javax.swing.JCheckBox Setuju;
    private javax.swing.JLabel TTL;
    private javax.swing.JLabel Telfon;
    private javax.swing.JLabel Tema;
    private javax.swing.JLabel Usia;
    private javax.swing.JComboBox<String> UsiaIsi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBoxCyberpunk;
    private javax.swing.JCheckBox jCheckBoxFantasy;
    private javax.swing.JCheckBox jCheckBoxFurry;
    private javax.swing.JCheckBox jCheckBoxKerajaan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioIya;
    private javax.swing.JRadioButton jRadioLakiLaki;
    private javax.swing.JRadioButton jRadioPerempuan;
    private javax.swing.JRadioButton jRadioTidak;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}