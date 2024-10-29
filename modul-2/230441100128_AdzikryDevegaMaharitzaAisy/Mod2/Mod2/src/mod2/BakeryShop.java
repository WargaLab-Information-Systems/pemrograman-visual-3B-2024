package mod2;

import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package mod2;

/**
 *
 * @author YOSEY
 */
public class BakeryShop extends javax.swing.JFrame {
    int harga = 0;
    int hargaTopping = 0;
    int jumlah = 0;
    /**
     * Creates new form BakeryShop
     */
    public BakeryShop() {
        initComponents();
        bayarr.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                BayarKeyReleased(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Chocolate = new javax.swing.JRadioButton();
        Matcha = new javax.swing.JRadioButton();
        Croisant = new javax.swing.JRadioButton();
        Cheese = new javax.swing.JRadioButton();
        Brownies = new javax.swing.JRadioButton();
        DaftarHarga = new javax.swing.JLabel();
        Cookies = new javax.swing.JRadioButton();
        Meatlover = new javax.swing.JRadioButton();
        Dounut = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Keju = new javax.swing.JRadioButton();
        Oreo = new javax.swing.JRadioButton();
        Meses = new javax.swing.JRadioButton();
        Tidak = new javax.swing.JRadioButton();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Batal = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Jumlah = new javax.swing.JTextField();
        totaal = new javax.swing.JTextField();
        Bayar = new javax.swing.JLabel();
        Kembali = new javax.swing.JLabel();
        bayarr = new javax.swing.JTextField();
        kembaali = new javax.swing.JTextField();
        Total = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setText("BAKERY SHOP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup1.add(Chocolate);
        Chocolate.setText("Chocolate Cake - Rp.18.000,00");

        buttonGroup1.add(Matcha);
        Matcha.setText("Matcha Cake - Rp.18.000,00");

        buttonGroup1.add(Croisant);
        Croisant.setText("Croissant - Rp.20.000,00");

        buttonGroup1.add(Cheese);
        Cheese.setText("Cheese Cake - Rp.25.000,00");

        buttonGroup1.add(Brownies);
        Brownies.setText("Brownies - Rp. 20.000,00");

        DaftarHarga.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DaftarHarga.setText("----PRICE LIST :----");

        buttonGroup1.add(Cookies);
        Cookies.setText("Cookies - Rp.15.000,00");

        buttonGroup1.add(Meatlover);
        Meatlover.setText("MeatLover - Rp.32.000,00");

        buttonGroup1.add(Dounut);
        Dounut.setText("Dounuts - Rp.23.000,00");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("----Extra Topping----");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        buttonGroup2.add(Keju);
        Keju.setText("Keju - Rp. 5.000,00");

        buttonGroup2.add(Oreo);
        Oreo.setText("Oreo - Rp.4.000,00");

        buttonGroup2.add(Meses);
        Meses.setText("Meses - Rp.3.000,00");

        buttonGroup2.add(Tidak);
        Tidak.setText("Tidak ada");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tidak)
                    .addComponent(Oreo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Meses)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Keju)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Keju)
                .addGap(6, 6, 6)
                .addComponent(Oreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Meses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tidak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah Pembelian :");

        Batal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Jumlah.setEditable(false);

        totaal.setEditable(false);

        Bayar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Bayar.setText("Pembayaran :");
        Bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BayarKeyReleased(evt);
            }
        });

        Kembali.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Kembali.setText("Kembalian :");

        kembaali.setEditable(false);

        Total.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Total.setText("Total :");

        Hitung.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Hitung.setText("Hitung ");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Chocolate)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DaftarHarga))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bayar)
                            .addComponent(bayarr, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Batal))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Kembali)
                                    .addComponent(Reset)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(kembaali, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(Croisant))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(Matcha))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(Cheese)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Brownies)
                                    .addComponent(Meatlover))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Dounut)
                            .addComponent(Cookies))
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Total)
                            .addComponent(totaal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hitung))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Kurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DaftarHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chocolate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Matcha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Croisant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cheese)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Brownies)
                                .addGap(5, 5, 5)
                                .addComponent(Cookies))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Meatlover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Dounut)
                                    .addComponent(jLabel3)
                                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tambah)))
                        .addGap(18, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bayar)
                            .addComponent(Kembali)
                            .addComponent(Total))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(totaal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kembaali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reset)
                            .addComponent(Hitung)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bayarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Batal)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BayarKeyReleased
        hitungakhir();// TODO add your handling code here:
    }//GEN-LAST:event_BayarKeyReleased

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        harga = 0;
        hargaTopping = 0;

        
        if (Chocolate.isSelected()) {
            harga = 18000;
        } else if (Matcha.isSelected()) {
            harga = 18000;
        } else if (Croisant.isSelected()) {
            harga = 20000;
        } else if (Cheese.isSelected()) {
            harga = 25000;
        } else if (Brownies.isSelected()) {
            harga = 20000;
        } else if (Cookies.isSelected()) {
            harga = 15000;
        } else if (Meatlover.isSelected()) {
            harga = 32000;
        } else if (Dounut.isSelected()) {
            harga = 23000;
        }
        
        if (harga  == 0) {
            JOptionPane.showMessageDialog(this, "Pilih Menu!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        // Mengecek pilihan topping
        if (Keju.isSelected()) {
            hargaTopping = 5000;
        } else if (Oreo.isSelected()) {
            hargaTopping = 4000;
        } else if (Meses.isSelected()) {
            hargaTopping = 3000;
        } else if (Tidak.isSelected()) {
            hargaTopping = 0;
        }
        
         int totalHarga = (harga + hargaTopping) * jumlah;

        // Jika jumlah lebih dari 5, diskon 10%
        if (totalHarga > 100000) {
            totalHarga = totalHarga - (totalHarga * 5 / 100); // diskon 5%
        }
       
        totaal.setText(Integer.toString(totalHarga));
        hitungakhir();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_HitungActionPerformed
    //menghitung kembalian dari uang yang dibayar
    private void hitungakhir() {
        try {
            int totalHarga = Integer.parseInt(totaal.getText());
            int uang = Integer.parseInt(bayarr.getText());
            int kembali = uang - totalHarga;

            if (kembali < 0) {
                kembaali.setText("Uang Tidak Cukup"); 
            } else {
                kembaali.setText(Integer.toString(kembali)); 
            }
        } catch (NumberFormatException e) {
            kembaali.setText(""); //menampilkan kembalian
        }
    }
    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
         if (jumlah > 1) {
            jumlah--;
            Jumlah.setText(Integer.toString(jumlah));
         }// TODO add your handling code here:
    }//GEN-LAST:event_KurangActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
         jumlah++;
         Jumlah.setText(Integer.toString(jumlah));// TODO add your handling code here:
    }//GEN-LAST:event_TambahActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Chocolate.setSelected(false);
        Matcha.setSelected(false);
        Croisant.setSelected(false);
        Cheese.setSelected(false);
        Brownies.setSelected(false);
        Cookies.setSelected(false);
        Meatlover.setSelected(false);
        Dounut.setSelected(false);
        Keju.setSelected(false);
        Oreo.setSelected(false);
        Meses.setSelected(false);
        Tidak.setSelected(false);

        Jumlah.setText("");
        totaal.setText("");
        bayarr.setText("");
        kembaali.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();// TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        this.dispose();        
        // TODO add your handling code here:
    }//GEN-LAST:event_BatalActionPerformed
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
            java.util.logging.Logger.getLogger(BakeryShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BakeryShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BakeryShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BakeryShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BakeryShop().setVisible(true);
            }
        });
    }

//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JLabel Bayar;
    private javax.swing.JRadioButton Brownies;
    private javax.swing.JRadioButton Cheese;
    private javax.swing.JRadioButton Chocolate;
    private javax.swing.JRadioButton Cookies;
    private javax.swing.JRadioButton Croisant;
    private javax.swing.JLabel DaftarHarga;
    private javax.swing.JRadioButton Dounut;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JRadioButton Keju;
    private javax.swing.JLabel Kembali;
    private javax.swing.JButton Kurang;
    private javax.swing.JRadioButton Matcha;
    private javax.swing.JRadioButton Meatlover;
    private javax.swing.JRadioButton Meses;
    private javax.swing.JRadioButton Oreo;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Tambah;
    private javax.swing.JRadioButton Tidak;
    private javax.swing.JLabel Total;
    private javax.swing.JTextField bayarr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kembaali;
    private javax.swing.JTextField totaal;
    // End of variables declaration//GEN-END:variables


    }