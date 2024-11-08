package pendaftaran;

public class Daftar2 extends javax.swing.JFrame {

    public Daftar2() {
        initComponents();
    }
    
    public void setLabel(String nama, String ttl, String usia, String hobi, String kota, String telfon, String deskripsi, String gender, String tema, String pc) {
        IsiNama.setText(nama);
        IsiTTL.setText(ttl);
        UsiaIsi.setText(usia);
        IsiHobi.setText(hobi);
        IsiKota.setText(kota);
        IsiTelfon.setText(telfon);
        IsiDeskripsi.setText(deskripsi);
        IsiGender.setText(gender);
        IsiTema.setText(tema);
        IsiPC.setText(pc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nama = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        TTL = new javax.swing.JLabel();
        Usia = new javax.swing.JLabel();
        Hobi = new javax.swing.JLabel();
        Kota = new javax.swing.JLabel();
        PC = new javax.swing.JLabel();
        Telfon = new javax.swing.JLabel();
        Tema = new javax.swing.JLabel();
        Deskripsi = new javax.swing.JLabel();
        Selesai = new javax.swing.JButton();
        IsiNama = new javax.swing.JLabel();
        IsiGender = new javax.swing.JLabel();
        IsiTTL = new javax.swing.JLabel();
        UsiaIsi = new javax.swing.JLabel();
        IsiHobi = new javax.swing.JLabel();
        IsiKota = new javax.swing.JLabel();
        IsiPC = new javax.swing.JLabel();
        IsiTelfon = new javax.swing.JLabel();
        IsiTema = new javax.swing.JLabel();
        IsiDeskripsi = new javax.swing.JLabel();

        Nama.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Nama.setText("NAMA                                    :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Bodoni Bd BT", 0, 24)); // NOI18N
        jLabel2.setText("ANDA TELAH MENDAFTAR!");

        jLabel1.setFont(new java.awt.Font("Bodoni Bd BT", 0, 14)); // NOI18N
        jLabel1.setText("INFORMASI LEBIH LANJUT AKAN DI KIRIM MELALUI NO,TELFON.");

        jLabel3.setFont(new java.awt.Font("Bodoni Bd BT", 0, 14)); // NOI18N
        jLabel3.setText("SEMOGA BERUNTUNG! DAN MENJADI BAGIAN DARI AGENSI KAMI!");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\logo.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Nama1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Nama1.setText("NAMA                          ");
        Nama1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nama1MouseClicked(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Gender.setText("GENDER                     ");
        Gender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenderMouseClicked(evt);
            }
        });

        TTL.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        TTL.setText("TEMPAT/TGL LAHIR     ");
        TTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TTLMouseClicked(evt);
            }
        });

        Usia.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Usia.setText("USIA SAAT INI               ");
        Usia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsiaMouseClicked(evt);
            }
        });

        Hobi.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Hobi.setText("HOBI/KELEBIHAN           ");
        Hobi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HobiMouseClicked(evt);
            }
        });

        Kota.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Kota.setText("ASAL KOTA                  ");
        Kota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KotaMouseClicked(evt);
            }
        });

        PC.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        PC.setText("APA ANDA MEMILIKI PC ");
        PC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCMouseClicked(evt);
            }
        });

        Telfon.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Telfon.setText("NO. TELFON            ");
        Telfon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelfonMouseClicked(evt);
            }
        });

        Tema.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Tema.setText("TEMA YANG ANDA SUKA  ");
        Tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TemaMouseClicked(evt);
            }
        });

        Deskripsi.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Deskripsi.setText("DESKRIPSIKAN DIRI ANDA");
        Deskripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeskripsiMouseClicked(evt);
            }
        });

        Selesai.setBackground(new java.awt.Color(255, 51, 102));
        Selesai.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        Selesai.setText("Selesai");
        Selesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelesaiMouseClicked(evt);
            }
        });
        Selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelesaiActionPerformed(evt);
            }
        });

        IsiNama.setBackground(new java.awt.Color(255, 204, 255));
        IsiNama.setText(":");
        IsiNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiNamaMouseClicked(evt);
            }
        });

        IsiGender.setBackground(new java.awt.Color(255, 204, 255));
        IsiGender.setText(":");
        IsiGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiGenderMouseClicked(evt);
            }
        });

        IsiTTL.setBackground(new java.awt.Color(255, 204, 255));
        IsiTTL.setText(":");
        IsiTTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiTTLMouseClicked(evt);
            }
        });

        UsiaIsi.setBackground(new java.awt.Color(255, 204, 255));
        UsiaIsi.setText(":");
        UsiaIsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsiaIsiMouseClicked(evt);
            }
        });

        IsiHobi.setBackground(new java.awt.Color(255, 204, 255));
        IsiHobi.setText(":");
        IsiHobi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiHobiMouseClicked(evt);
            }
        });

        IsiKota.setBackground(new java.awt.Color(255, 204, 255));
        IsiKota.setText(":");
        IsiKota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiKotaMouseClicked(evt);
            }
        });

        IsiPC.setBackground(new java.awt.Color(255, 204, 255));
        IsiPC.setText(":");
        IsiPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiPCMouseClicked(evt);
            }
        });

        IsiTelfon.setBackground(new java.awt.Color(255, 204, 255));
        IsiTelfon.setText(":");
        IsiTelfon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiTelfonMouseClicked(evt);
            }
        });

        IsiTema.setBackground(new java.awt.Color(255, 204, 255));
        IsiTema.setText(":");
        IsiTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiTemaMouseClicked(evt);
            }
        });

        IsiDeskripsi.setBackground(new java.awt.Color(255, 204, 255));
        IsiDeskripsi.setText(":");
        IsiDeskripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiDeskripsiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Kota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telfon, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tema, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(IsiKota, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IsiTelfon, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IsiPC, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IsiTema, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Deskripsi)
                        .addGap(18, 18, 18)
                        .addComponent(IsiDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TTL, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(Usia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Hobi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IsiHobi, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsiaIsi, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IsiTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IsiGender, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IsiNama, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Selesai)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IsiNama)
                    .addComponent(Nama1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(IsiGender))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TTL)
                    .addComponent(IsiTTL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usia)
                    .addComponent(UsiaIsi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hobi)
                    .addComponent(IsiHobi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kota)
                    .addComponent(IsiKota))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IsiPC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telfon)
                    .addComponent(IsiTelfon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tema)
                    .addComponent(IsiTema, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deskripsi)
                    .addComponent(IsiDeskripsi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(Selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelesaiActionPerformed
        Daftar frm1 = new Daftar();
        frm1.setVisible(true);
        Daftar2.this.dispose();
        frm1.toFront();
        frm1.requestFocus();
    
    }//GEN-LAST:event_SelesaiActionPerformed

    private void Nama1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nama1MouseClicked
       
    }//GEN-LAST:event_Nama1MouseClicked

    private void GenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenderMouseClicked

    }//GEN-LAST:event_GenderMouseClicked

    private void TTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTLMouseClicked
        
    }//GEN-LAST:event_TTLMouseClicked

    private void UsiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsiaMouseClicked
        
    }//GEN-LAST:event_UsiaMouseClicked

    private void HobiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HobiMouseClicked
        
    }//GEN-LAST:event_HobiMouseClicked

    private void KotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KotaMouseClicked
        
    }//GEN-LAST:event_KotaMouseClicked

    private void PCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCMouseClicked
        
    }//GEN-LAST:event_PCMouseClicked

    private void TelfonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelfonMouseClicked

    }//GEN-LAST:event_TelfonMouseClicked

    private void TemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemaMouseClicked
        
    }//GEN-LAST:event_TemaMouseClicked

    private void DeskripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeskripsiMouseClicked
  
    }//GEN-LAST:event_DeskripsiMouseClicked

    private void IsiNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiNamaMouseClicked
       
    }//GEN-LAST:event_IsiNamaMouseClicked

    private void IsiGenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiGenderMouseClicked
        
    }//GEN-LAST:event_IsiGenderMouseClicked

    private void IsiTTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiTTLMouseClicked
        
    }//GEN-LAST:event_IsiTTLMouseClicked

    private void UsiaIsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsiaIsiMouseClicked
        
    }//GEN-LAST:event_UsiaIsiMouseClicked

    private void IsiHobiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiHobiMouseClicked
        
    }//GEN-LAST:event_IsiHobiMouseClicked

    private void IsiKotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiKotaMouseClicked
   
    }//GEN-LAST:event_IsiKotaMouseClicked

    private void IsiPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiPCMouseClicked
        
    }//GEN-LAST:event_IsiPCMouseClicked

    private void IsiTelfonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiTelfonMouseClicked
       
    }//GEN-LAST:event_IsiTelfonMouseClicked

    private void IsiTemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiTemaMouseClicked
        
    }//GEN-LAST:event_IsiTemaMouseClicked

    private void IsiDeskripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiDeskripsiMouseClicked
        
    }//GEN-LAST:event_IsiDeskripsiMouseClicked

    private void SelesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelesaiMouseClicked
        
    }//GEN-LAST:event_SelesaiMouseClicked

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
            java.util.logging.Logger.getLogger(Daftar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Deskripsi;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Hobi;
    private javax.swing.JLabel IsiDeskripsi;
    private javax.swing.JLabel IsiGender;
    private javax.swing.JLabel IsiHobi;
    private javax.swing.JLabel IsiKota;
    private javax.swing.JLabel IsiNama;
    private javax.swing.JLabel IsiPC;
    private javax.swing.JLabel IsiTTL;
    private javax.swing.JLabel IsiTelfon;
    private javax.swing.JLabel IsiTema;
    private javax.swing.JLabel Kota;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Nama1;
    private javax.swing.JLabel PC;
    private javax.swing.JButton Selesai;
    private javax.swing.JLabel TTL;
    private javax.swing.JLabel Telfon;
    private javax.swing.JLabel Tema;
    private javax.swing.JLabel Usia;
    private javax.swing.JLabel UsiaIsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}