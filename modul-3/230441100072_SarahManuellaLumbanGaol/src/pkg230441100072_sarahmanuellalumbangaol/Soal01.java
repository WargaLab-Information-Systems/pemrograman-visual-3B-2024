/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg230441100072_sarahmanuellalumbangaol;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Soal01 extends javax.swing.JFrame {

    /**
     * Creates new form Soal01
     */
    
    private JComboBox<String> gejalaComboBox;
    private JLabel gambarObatLabel, detailObatLabel;
    private JPanel detailPanel;
    
    private HashMap<String, String> obatMap;
    private HashMap<String, ImageIcon> gambarMap;
    private final String[] gejala = {
        "Demam", "Batuk", "Flu", "Sakit Kepala", "Diare", 
        "Mual", "Sakit Gigi", "Alergi", "Nyeri Otot", "Insomnia"
    };
    public Soal01() {
        initComponents();
        setTitle("Apotek Mini");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Panel untuk memilih gejala
        JPanel gejalaPanel = new JPanel(new FlowLayout());
        gejalaPanel.setBorder(BorderFactory.createTitledBorder("Pilih Gejala"));
        gejalaComboBox = new JComboBox<>(gejala);
        gejalaPanel.add(gejalaComboBox);
        add(gejalaPanel, BorderLayout.NORTH);

        // Panel untuk menampilkan gambar obat
        JPanel gambarPanel = new JPanel(new FlowLayout());
        gambarPanel.setBorder(BorderFactory.createTitledBorder("Gambar Obat"));
        gambarObatLabel = new JLabel();
        gambarPanel.add(gambarObatLabel);
        add(gambarPanel, BorderLayout.CENTER);

        // Panel untuk menampilkan detail obat
        detailPanel = new JPanel(new GridLayout(2, 1));
        detailPanel.setBorder(BorderFactory.createTitledBorder("Detail Obat"));
        detailObatLabel = new JLabel();
        detailPanel.add(detailObatLabel);
        add(detailPanel, BorderLayout.SOUTH);

        // Panel untuk tombol proses
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton prosesButton = new JButton("Lihat Obat");
        buttonPanel.add(prosesButton);
        add(buttonPanel, BorderLayout.EAST);

        // Inisialisasi data obat dan gambar
        initObatData();

        // Listener untuk tombol
        prosesButton.addActionListener(new ProsesListener());

        setVisible(true);
    }

    // Inisialisasi data obat dan gambar
    private void initObatData() {
        obatMap = new HashMap<>();
        gambarMap = new HashMap<>();

        obatMap.put("Demam", "<html>Obat: Paracetamol<br>Harga: Rp 10.000<br>Kegunaan: Menurunkan demam</html>");
        gambarMap.put("Demam", new ImageIcon("path_to_paracetamol_image.jpg"));

        obatMap.put("Batuk", "<html>Obat: OBH Combi<br>Harga: Rp 12.000<br>Kegunaan: Meredakan batuk</html>");
        gambarMap.put("Batuk", new ImageIcon("path_to_obh_combi_image.jpg"));

        obatMap.put("Flu", "<html>Obat: Neozep<br>Harga: Rp 15.000<br>Kegunaan: Mengatasi flu</html>");
        gambarMap.put("Flu", new ImageIcon("path_to_neozep_image.jpg"));

        obatMap.put("Sakit Kepala", "<html>Obat: Bodrex<br>Harga: Rp 8.000<br>Kegunaan: Meredakan sakit kepala</html>");
        gambarMap.put("Sakit Kepala", new ImageIcon("path_to_bodrex_image.jpg"));

        obatMap.put("Diare", "<html>Obat: Diapet<br>Harga: Rp 11.000<br>Kegunaan: Menghentikan diare</html>");
        gambarMap.put("Diare", new ImageIcon("path_to_diapet_image.jpg"));

        obatMap.put("Mual", "<html>Obat: Antimo<br>Harga: Rp 5.000<br>Kegunaan: Meredakan mual</html>");
        gambarMap.put("Mual", new ImageIcon("path_to_antimo_image.jpg"));

        obatMap.put("Sakit Gigi", "<html>Obat: Ponstan<br>Harga: Rp 20.000<br>Kegunaan: Mengatasi sakit gigi</html>");
        gambarMap.put("Sakit Gigi", new ImageIcon("path_to_ponstan_image.jpg"));

        obatMap.put("Alergi", "<html>Obat: CTM<br>Harga: Rp 7.000<br>Kegunaan: Meredakan alergi</html>");
        gambarMap.put("Alergi", new ImageIcon("path_to_ctm_image.jpg"));

        obatMap.put("Nyeri Otot", "<html>Obat: Counterpain<br>Harga: Rp 30.000<br>Kegunaan: Mengatasi nyeri otot</html>");
        gambarMap.put("Nyeri Otot", new ImageIcon("path_to_counterpain_image.jpg"));

        obatMap.put("Insomnia", "<html>Obat: Melatonin<br>Harga: Rp 25.000<br>Kegunaan: Membantu tidur</html>");
        gambarMap.put("Insomnia", new ImageIcon("path_to_melatonin_image.jpg"));
    }

    // Listener untuk tombol Lihat Obat
    private class ProsesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String gejalaTerpilih = (String) gejalaComboBox.getSelectedItem();
            gambarObatLabel.setIcon(gambarMap.get(gejalaTerpilih));
            detailObatLabel.setText(obatMap.get(gejalaTerpilih));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Soal01();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
