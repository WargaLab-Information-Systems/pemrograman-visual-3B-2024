/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIKNAS
 */
public class PembayaranSPP extends javax.swing.JFrame {

    /**
     * Creates new form PembayaranSPP
     */
    public PembayaranSPP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        BGSpp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLNama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbSpp = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tpembayaran = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        januari = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        kirim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jLabel1.setFont(new java.awt.Font("STKaiti", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PEMBAYARAN SPP SMK 1 SUMENEP");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        JLNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLNama.setForeground(new java.awt.Color(255, 255, 255));
        JLNama.setText("Nama :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah SPP Tiap Bulan :");

        BGSpp.add(rbSpp);
        rbSpp.setForeground(new java.awt.Color(255, 255, 255));
        rbSpp.setText("1.000.000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNama)
                    .addComponent(jLabel3)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSpp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSpp)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        Tpembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Nominal", "Bulan Pembayaran"
            }
        ));
        jScrollPane1.setViewportView(Tpembayaran);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("pilih bulan yang akan dibayar");
        jPanel4.add(jLabel4, new java.awt.GridBagConstraints());

        januari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        januari.setText("Januari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 26;
        jPanel4.add(januari, gridBagConstraints);

        februari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        februari.setText("Februari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 26;
        jPanel4.add(februari, gridBagConstraints);

        maret.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maret.setText("Maret");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 28;
        jPanel4.add(maret, gridBagConstraints);

        april.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        april.setText("April");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 28;
        jPanel4.add(april, gridBagConstraints);

        mei.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mei.setText("Mei");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 29;
        jPanel4.add(mei, gridBagConstraints);

        juni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juni.setText("Juni");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 31;
        jPanel4.add(juni, gridBagConstraints);

        juli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        juli.setText("Juli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 43;
        jPanel4.add(juli, gridBagConstraints);

        agustus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agustus.setText("Agustus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 16;
        jPanel4.add(agustus, gridBagConstraints);

        september.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        september.setText("September");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel4.add(september, gridBagConstraints);

        oktober.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        oktober.setText("Oktober");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 14;
        jPanel4.add(oktober, gridBagConstraints);

        november.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        november.setText("November");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 1;
        jPanel4.add(november, gridBagConstraints);

        desember.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        desember.setText("Desember");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 1;
        jPanel4.add(desember, gridBagConstraints);

        kirim.setBackground(new java.awt.Color(204, 102, 0));
        kirim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kirim.setForeground(new java.awt.Color(255, 255, 255));
        kirim.setText("Kirim");
        kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 7);
        jPanel4.add(kirim, gridBagConstraints);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimActionPerformed
        if (tfNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi Nama Terlebih Dahulu!", "Pemberitahuan!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (!januari.isSelected() && !februari.isSelected() && !maret.isSelected() && !april.isSelected() && !mei.isSelected() && !juni.isSelected() && !juli.isSelected() && !agustus.isSelected() && !september.isSelected() && !oktober.isSelected() && !november.isSelected() && !desember.isSelected()) {
            JOptionPane.showMessageDialog(null, "Anda harus memilih minimal satu bulan untuk pembayaran SPP.", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        
            DefaultTableModel model = (DefaultTableModel) Tpembayaran.getModel();

            String Nama = tfNama.getText();
            String bulanBayar = "";
            int totalBulan = 0;
            int PerBulan;

            if (rbSpp.isSelected()) {
                PerBulan = 1000000;
            }else {
                JOptionPane.showMessageDialog(null, "Pilih salah satu nominal SPP per bulan.", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (januari.isSelected()) {
                bulanBayar += "Januari, ";
                totalBulan++;
            }
            if (februari.isSelected()) {
                bulanBayar += "Februari, ";
                totalBulan++;
            }
            if (maret.isSelected()) {
                bulanBayar += "Maret, ";
                totalBulan++;
            }
            if (april.isSelected()) {
                bulanBayar += "April, ";
                totalBulan++;
            }
            if (mei.isSelected()) {
                bulanBayar += "Mei, ";
                totalBulan++;
            }
            if (juni.isSelected()) {
                bulanBayar += "Juni, ";
                totalBulan++;
            }
            if (juli.isSelected()) {
                bulanBayar += "Juli, ";
                totalBulan++;
            }
            if (agustus.isSelected()) {
                bulanBayar += "Agustus, ";
                totalBulan++;
            }
            if (september.isSelected()) {
                bulanBayar += "September, ";
                totalBulan++;
            }
            if (oktober.isSelected()) {
                bulanBayar += "Oktober, ";
                totalBulan++;
            }
            if (november.isSelected()) {
                bulanBayar += "November, ";
                totalBulan++;
            }
            if (desember.isSelected()) {
                bulanBayar += "Desember, ";
                totalBulan++;
            }

            int totalSPP = PerBulan * totalBulan;

            Object[] rowData = new Object[3];
            rowData[0] = Nama;
            rowData[1] = totalSPP;
            rowData[2] = bulanBayar;

            model.addRow(rowData);
            resetForm();
            JOptionPane.showMessageDialog(null, "Data Sukses ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_kirimActionPerformed
   
    private void resetForm() {
        tfNama.setText("");
        BGSpp.clearSelection();
        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);
    }
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
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGSpp;
    private javax.swing.JLabel JLNama;
    private javax.swing.JTable Tpembayaran;
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JButton kirim;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JRadioButton rbSpp;
    private javax.swing.JCheckBox september;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}