/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

/**
 *
 * @author Lavilia
 */
public class praktek extends javax.swing.JFrame {

    /**
     * Creates new form praktek
     */
    public praktek() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lavilia\\OneDrive\\Documents\\Desktop\\Documents\\SEMESTER 3\\GAMBAR MODUL 3\\coronavirus_pills_medicine_pills_prescription_corona_virus_icon_141508.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lavilia\\OneDrive\\Documents\\Desktop\\Documents\\SEMESTER 3\\GAMBAR MODUL 3\\drugs_pharmacy_pills_drug_medicine_pill_tablet_tablets_icon_210681.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lavilia\\OneDrive\\Documents\\Desktop\\Documents\\SEMESTER 3\\GAMBAR MODUL 3\\ic_local_pharmacy_128_28451 (1).png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lavilia\\OneDrive\\Documents\\Desktop\\Documents\\SEMESTER 3\\GAMBAR MODUL 3\\iconfinder-medicinemedicalremedypillsmedicineshealthyhealthcare-and-medicalhealthcareheal-4394777_119502.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, java.awt.BorderLayout.LINE_END);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lavilia\\OneDrive\\Documents\\Desktop\\Documents\\SEMESTER 3\\GAMBAR MODUL 3\\medicine_drugs_pills_medical_icon_140806.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(praktek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
