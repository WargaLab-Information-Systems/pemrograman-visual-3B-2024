/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class utspemvis extends javax.swing.JFrame {

    /**
     * Creates new form utspemvis
     */
    public utspemvis() {
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
        gunting = new javax.swing.JRadioButton();
        kertas = new javax.swing.JRadioButton();
        batu = new javax.swing.JRadioButton();
        main = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Batu = new javax.swing.JButton();
        Gunting = new javax.swing.JButton();
        Kertas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new java.awt.GridLayout());

        buttonGroup1.add(gunting);
        gunting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gunting.setText("Gunting");
        jPanel1.add(gunting);

        buttonGroup1.add(kertas);
        kertas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kertas.setText("Kertas");
        jPanel1.add(kertas);

        buttonGroup1.add(batu);
        batu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        batu.setText("Batu");
        jPanel1.add(batu);

        main.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        main.setText("MAIN");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        jPanel1.add(main);

        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout());

        Batu.setText("Batu");
        jPanel3.add(Batu);

        Gunting.setText("Gunting");
        jPanel3.add(Gunting);

        Kertas.setText("Kertas");
        jPanel3.add(Kertas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TO
   
    }//GEN-LAST:event_mainActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
    
    }//GEN-LAST:event_tfActionPerformed

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
            java.util.logging.Logger.getLogger(utspemvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utspemvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utspemvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utspemvis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utspemvis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batu;
    private javax.swing.JButton Gunting;
    private javax.swing.JButton Kertas;
    private javax.swing.JRadioButton batu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton gunting;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton kertas;
    private javax.swing.JButton main;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}


public class utsemvis extends JFrame implements ActionListener {
    private JLabel resultLabel;
    private JButton batuButton, guntingButton, kertasButton, mainButton;
    private String[] choices = {"Batu", "Gunting", "Kertas"};
    private String userChoice, compChoice;

    public SuitGame() {
        setTitle("Permainan Suit");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

        JPanel choicePanel = new JPanel();
        batuButton = new JButton("Batu");
        guntingButton = new JButton("Gunting");
        kertasButton = new JButton("Kertas");
        batuButton.addActionListener(this);
        guntingButton.addActionListener(this);
        kertasButton.addActionListener(this);
        choicePanel.add(batuButton);
        choicePanel.add(guntingButton);
        choicePanel.add(kertasButton);

        JPanel resultPanel = new JPanel();
        resultLabel = new JLabel("Pilih Batu, Gunting, atau Kertas.");
        resultPanel.add(resultLabel);

        JPanel mainPanel = new JPanel();
        mainButton = new JButton("MAIN");
        mainButton.addActionListener(this);
        mainPanel.add(mainButton);

        add(choicePanel);
        add(resultPanel);
        add(mainPanel);
    }

   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mainButton) {
            if (userChoice == null) {
                resultLabel.setText("Pilih dulu salah satu: Batu, Gunting, atau Kertas.");
            } else {
                Random rand = new Random();
       
            }
        } else if (e.getSource() == batuButton) {
            userChoice = "Batu";
        } else if (e.getSource() == guntingButton) {
            userChoice = "Gunting";
        } else if (e.getSource() == kertasButton) {
            userChoice = "Kertas";
        }
    }
}

    
