/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utspraktikum;

import javax.swing.JOptionPane;

/**
 *
 * @author YOSEY
 */
public class uts extends javax.swing.JFrame {

    /**
     * Creates new form uts
     */
    public uts() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        play = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        kertas = new javax.swing.JRadioButton();
        gunting = new javax.swing.JRadioButton();
        batu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        play.setBackground(new java.awt.Color(204, 204, 255));
        play.setText("MAIN");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel1.setText("PROGRAM SUIT ");
        jPanel3.add(jLabel1, new java.awt.GridBagConstraints());

        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        exit.setText("EXIT");

        jPanel4.setLayout(new java.awt.GridLayout());

        kertas.setText("kertas");
        kertas.setIcon(new javax.swing.ImageIcon("C:\\Users\\YOSEY\\Pictures\\kertas.png")); // NOI18N
        kertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kertasActionPerformed(evt);
            }
        });
        jPanel4.add(kertas);

        gunting.setText("GUNTING");
        gunting.setIcon(new javax.swing.ImageIcon("C:\\Users\\YOSEY\\Pictures\\gunting.jpeg")); // NOI18N
        gunting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guntingActionPerformed(evt);
            }
        });
        jPanel4.add(gunting);

        batu.setText("BATU");
        batu.setIcon(new javax.swing.ImageIcon("C:\\Users\\YOSEY\\Pictures\\BAT.jpg")); // NOI18N
        batu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batuActionPerformed(evt);
            }
        });
        jPanel4.add(batu);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText(" User :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(play)
                        .addGap(18, 18, 18)
                        .addComponent(batal)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play)
                    .addComponent(batal)
                    .addComponent(exit))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
//        if pilihanuser equals.{// TODO add your handling code here:
    }//GEN-LAST:event_playActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        JOptionPane.WARNING_MESSAGE(rootPane,"anda yakin ingin batal?" );
        int YES_NO_CANCEL_OPTION = JOptionPane.YES_NO_CANCEL_OPTION;
         batu.setText("");
         gunting.setText("");
         kertas.setText("");
    }//GEN-LAST:event_batalActionPerformed

    private void kertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kertasActionPerformed
        JOptionPane.showMessageDialog(rootPane, kertas);

    }//GEN-LAST:event_kertasActionPerformed

    private void guntingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guntingActionPerformed
        JOptionPane.showMessageDialog(rootPane, "pilihan anda adalah gunting");// TODO add your handling code here:
    }//GEN-LAST:event_guntingActionPerformed

    private void batuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batuActionPerformed
        JOptionPane.showMessageDialog(rootPane, batu);// TODO add your handling code here:
    }//GEN-LAST:event_batuActionPerformed

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
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JRadioButton batu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton gunting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton kertas;
    private javax.swing.JTextField nama;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
                                                 
      
