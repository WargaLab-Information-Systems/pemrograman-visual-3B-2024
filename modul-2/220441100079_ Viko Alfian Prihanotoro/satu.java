
import java.awt.event.ItemEvent;


public class satu extends javax.swing.JFrame {

    public satu() {
        
        initComponents();
        
    }
   private void Totalnya(ItemEvent evt) {
        int hargaRoti = 0;
        int hargaTopping = 0;

        if (Kiwi.isSelected()) hargaRoti = 10000;
        else if (Kelengkeng.isSelected()) hargaRoti = 20000;
        else if (Jeruk.isSelected()) hargaRoti = 5000;
        else if (Kolak.isSelected()) hargaRoti = 25000;
        else if (Selasih.isSelected()) hargaRoti = 15000;
        else if (Palm.isSelected()) hargaRoti = 25000;
        else if (Salak.isSelected()) hargaRoti = 10000;
        else if (Rambutan.isSelected()) hargaRoti = 15000;

        if (Mesiu.isSelected()) hargaTopping = 35000;
        else if (Serabut.isSelected()) hargaTopping = 10000;
        else if (Jelly.isSelected()) hargaTopping = 25000;
        else if (Gram.isSelected()) hargaTopping = 0;

        int jumlahPesanan = 1;
        try {
            jumlahPesanan = Integer.parseInt(Totalbarang.getText());
        } catch (NumberFormatException e) {
            // Default jumlahPesanan tetap 1 jika tidak menginput apa apa / selain int
        }

        int totalHarga = (hargaRoti + hargaTopping) * jumlahPesanan;

        if (totalHarga > 100000) {
            totalHarga -= totalHarga * 0.05; 
        }

        Hasil.setText(String.valueOf(totalHarga));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        judul = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        judul3 = new javax.swing.JLabel();
        Kiwi = new javax.swing.JRadioButton();
        Kelengkeng = new javax.swing.JRadioButton();
        Jeruk = new javax.swing.JRadioButton();
        Kolak = new javax.swing.JRadioButton();
        Selasih = new javax.swing.JRadioButton();
        Palm = new javax.swing.JRadioButton();
        Salak = new javax.swing.JRadioButton();
        Rambutan = new javax.swing.JRadioButton();
        Mesiu = new javax.swing.JRadioButton();
        Serabut = new javax.swing.JRadioButton();
        Jelly = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Totalbarang = new javax.swing.JTextField();
        Tambahin = new javax.swing.JButton();
        Kurangin = new javax.swing.JButton();
        Hasilharga = new javax.swing.JButton();
        Hasil = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Uang = new javax.swing.JTextField();
        Kembalian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Gram = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        judul.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        judul.setText("Toko Roti  RE8");

        judul2.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        judul2.setText("Buka jam 00.00 - 00.01");

        judul3.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        judul3.setText("Jl. Gaadanamanya No 0 BatuPoron");

        buttonGroup2.add(Kiwi);
        Kiwi.setText("Kiwi - 10000");
        Kiwi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KiwiActionPerformed(evt);
            }
        });

        buttonGroup2.add(Kelengkeng);
        Kelengkeng.setText("klengkeng - 20000");
        Kelengkeng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelengkengActionPerformed(evt);
            }
        });

        buttonGroup2.add(Jeruk);
        Jeruk.setText("Jeruk Bali - 5000");
        Jeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JerukActionPerformed(evt);
            }
        });

        buttonGroup2.add(Kolak);
        Kolak.setText("Kolak - 25000");
        Kolak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolakActionPerformed(evt);
            }
        });

        buttonGroup2.add(Selasih);
        Selasih.setText("Selasih - 15000");
        Selasih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelasihActionPerformed(evt);
            }
        });

        buttonGroup2.add(Palm);
        Palm.setText("Palm - 25000");
        Palm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalmActionPerformed(evt);
            }
        });

        buttonGroup2.add(Salak);
        Salak.setText("Salak - 10000");
        Salak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalakActionPerformed(evt);
            }
        });

        buttonGroup2.add(Rambutan);
        Rambutan.setText("Rambutan - 15000");
        Rambutan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RambutanActionPerformed(evt);
            }
        });

        buttonGroup1.add(Mesiu);
        Mesiu.setText("Bubuk Messiu - 35000");
        Mesiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesiuActionPerformed(evt);
            }
        });

        buttonGroup1.add(Serabut);
        Serabut.setText("Serabut Kelapa - 10000");
        Serabut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerabutActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jelly);
        Jelly.setText("Jelly Alkohol - 25000");
        Jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JellyActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Jenis Jenis Roti");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Jenis Jenis Topping");

        Totalbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalbarangActionPerformed(evt);
            }
        });

        Tambahin.setText("+");
        Tambahin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahinActionPerformed(evt);
            }
        });

        Kurangin.setText("-");
        Kurangin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KuranginActionPerformed(evt);
            }
        });

        Hasilharga.setText("Hasil");
        Hasilharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilhargaActionPerformed(evt);
            }
        });

        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 0));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Pembayaran");

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 0));

        Uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangActionPerformed(evt);
            }
        });

        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Total");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        buttonGroup1.add(Gram);
        Gram.setText("Gram Besi - 0");
        Gram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GramActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\DL\\logo RE8 (1).png")); // NOI18N

        jLabel5.setText("=");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Kembalian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Selasih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kiwi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Palm, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kelengkeng))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Salak, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jeruk))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kolak, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rambutan))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Mesiu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Serabut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jelly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Gram)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(judul3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Kurangin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Totalbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tambahin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hasilharga)
                                .addGap(18, 18, 18)
                                .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Uang, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Reset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(judul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judul2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judul3))
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kiwi)
                    .addComponent(Kelengkeng)
                    .addComponent(Jeruk)
                    .addComponent(Kolak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selasih)
                    .addComponent(Palm)
                    .addComponent(Salak)
                    .addComponent(Rambutan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mesiu)
                    .addComponent(Serabut)
                    .addComponent(Jelly)
                    .addComponent(Gram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totalbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tambahin)
                    .addComponent(Kurangin)
                    .addComponent(Hasilharga)
                    .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Reset)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void KiwiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KiwiActionPerformed
        
    }//GEN-LAST:event_KiwiActionPerformed

    private void KelengkengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelengkengActionPerformed
        
    }//GEN-LAST:event_KelengkengActionPerformed

    private void JerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JerukActionPerformed
        
    }//GEN-LAST:event_JerukActionPerformed

    private void KolakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolakActionPerformed
        
    }//GEN-LAST:event_KolakActionPerformed

    private void SelasihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelasihActionPerformed
        
    }//GEN-LAST:event_SelasihActionPerformed

    private void PalmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalmActionPerformed
        
    }//GEN-LAST:event_PalmActionPerformed

    private void SalakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalakActionPerformed
        
    }//GEN-LAST:event_SalakActionPerformed

    private void RambutanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RambutanActionPerformed
        
    }//GEN-LAST:event_RambutanActionPerformed

    private void MesiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesiuActionPerformed
        
    }//GEN-LAST:event_MesiuActionPerformed

    private void SerabutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerabutActionPerformed
        
    }//GEN-LAST:event_SerabutActionPerformed

    private void JellyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JellyActionPerformed
        
    }//GEN-LAST:event_JellyActionPerformed

    private void KuranginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KuranginActionPerformed
    try {
        int jumlahPesanan = Integer.parseInt(Totalbarang.getText());
        if (jumlahPesanan > 1) {
            jumlahPesanan--;
            Totalbarang.setText(String.valueOf(jumlahPesanan));
            Totalnya(null); // Update total harga
        }
    } catch (NumberFormatException e) {
        Totalbarang.setText("1"); 
    }
    }//GEN-LAST:event_KuranginActionPerformed

    private void TambahinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahinActionPerformed
    try {
        int jumlahPesanan = Integer.parseInt(Totalbarang.getText());
            jumlahPesanan++; // Menambahkan jumlah pesanan
        Totalbarang.setText(String.valueOf(jumlahPesanan));
            Totalnya(null); // Update total harga
    } catch (NumberFormatException e) {
        Totalbarang.setText("1"); // Mengatur nilai default jika terjadi kesalahan
    }
    }//GEN-LAST:event_TambahinActionPerformed

    private void TotalbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalbarangActionPerformed

    }//GEN-LAST:event_TotalbarangActionPerformed

    private void UangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UangActionPerformed
    String uangInput = Uang.getText();
    String hasilInput = Hasil.getText();

    // Mengeek jika  inputan int apa tidak jika tidak akan tidak valid 
    if (hasilInput.matches("\\d*") && !hasilInput.isEmpty() && uangInput.matches("\\d*")) {
        int totalHarga = Integer.parseInt(hasilInput); 
        int uangPembeli = Integer.parseInt(uangInput); 
        
        int kembalian = uangPembeli - totalHarga;
    if (kembalian < 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Uang anda tidak cukup.", "Information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        Kembalian.setText(""); 
 // menampilakn angka negatif jika uang tidak mencukupi
    } else {
        Kembalian.setText(String.valueOf(kembalian));
    }
    }
    }//GEN-LAST:event_UangActionPerformed

    private void KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalianActionPerformed
        
    }//GEN-LAST:event_KembalianActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        buttonGroup2.clearSelection(); 
        buttonGroup1.clearSelection();
        
        Totalbarang.setText(""); 
        Hasil.setText("");
        Uang.setText("");
        Kembalian.setText("");

    }//GEN-LAST:event_ResetActionPerformed

    private void GramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GramActionPerformed
        
    }//GEN-LAST:event_GramActionPerformed

    private void HasilhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilhargaActionPerformed
            if (!isButtonGroup2Selected() || !isButtonGroup1Selected()) {
        String message = "Silakan pesan roti dan topping yang anda inginkan.";
        String title = "INFORMASI";
        javax.swing.JOptionPane.showMessageDialog(this, message, title, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } else {
        Totalnya(null); // Consider passing a meaningful value instead of null
    }
}

    private boolean isButtonGroup2Selected() {
        return Kiwi.isSelected() || Kelengkeng.isSelected() || Jeruk.isSelected() || Kolak.isSelected()
                || Selasih.isSelected() || Palm.isSelected() || Salak.isSelected() || Rambutan.isSelected();
    }

    private boolean isButtonGroup1Selected() {
        return Mesiu.isSelected() || Serabut.isSelected() || Jelly.isSelected() || Gram.isSelected();

    }//GEN-LAST:event_HasilhargaActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed

    }//GEN-LAST:event_HasilActionPerformed

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
            java.util.logging.Logger.getLogger(satu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Gram;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Hasilharga;
    private javax.swing.JRadioButton Jelly;
    private javax.swing.JRadioButton Jeruk;
    private javax.swing.JRadioButton Kelengkeng;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JRadioButton Kiwi;
    private javax.swing.JRadioButton Kolak;
    private javax.swing.JButton Kurangin;
    private javax.swing.JRadioButton Mesiu;
    private javax.swing.JRadioButton Palm;
    private javax.swing.JRadioButton Rambutan;
    private javax.swing.JButton Reset;
    private javax.swing.JRadioButton Salak;
    private javax.swing.JRadioButton Selasih;
    private javax.swing.JRadioButton Serabut;
    private javax.swing.JButton Tambahin;
    private javax.swing.JTextField Totalbarang;
    private javax.swing.JTextField Uang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    // End of variables declaration//GEN-END:variables
}

