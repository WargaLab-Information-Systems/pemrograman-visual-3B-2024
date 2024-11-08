package modul3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Modul3 extends JFrame {
    private JCheckBox[] bulanCheckBox;
    private JButton hitungBtn, bayarBtn, resetBtn;
    private JTextField totalField;
    private JTable table;
    private DefaultTableModel model;

    public Modul3() {
        setTitle("Pembayaran SPP");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        // Panel pemilihan bulan
        JPanel panelBulan = new JPanel(new GridLayout(4, 3)); // 12 bulan
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        bulanCheckBox = new JCheckBox[12];
        
        for (int i = 0; i < 12; i++) {
            bulanCheckBox[i] = new JCheckBox(bulan[i]);
            panelBulan.add(bulanCheckBox[i]);
        }
        
        // Panel aksi (tombol dan total)
        JPanel panelAksi = new JPanel(new FlowLayout());
        hitungBtn = new JButton("Hitung Total");
        bayarBtn = new JButton("Bayar");
        resetBtn = new JButton("Reset");
        totalField = new JTextField(10);
        totalField.setEditable(false);
        panelAksi.add(hitungBtn);
        panelAksi.add(new JLabel("Total:"));
        panelAksi.add(totalField);
        panelAksi.add(bayarBtn);
        panelAksi.add(resetBtn);
        
        // Tabel pembayaran
        String[] kolom = {"Bulan", "Total"};
        model = new DefaultTableModel(kolom, 0);
        table = new JTable(model);
        JScrollPane tablePane = new JScrollPane(table);
        
        // Tambah ke layout
        add(new JLabel("Pilih Bulan yang Harus Dibayar", JLabel.CENTER), BorderLayout.NORTH);
        add(panelBulan, BorderLayout.CENTER);
        add(panelAksi, BorderLayout.SOUTH);
        add(tablePane, BorderLayout.EAST);
        
        // Action listener tombol
        hitungBtn.addActionListener(e -> hitungTotal());
        bayarBtn.addActionListener(e -> bayarSPP());
        resetBtn.addActionListener(e -> resetForm());
        
        setVisible(true);
    }

    private void hitungTotal() {
        int total = 0;
        int hargaSPP = 300000;
        StringBuilder bulanDipilih = new StringBuilder();
        
        for (JCheckBox cb : bulanCheckBox) {
            if (cb.isSelected()) {
                total += hargaSPP;
                bulanDipilih.append(cb.getText()).append(", ");
            }
        }
        
        if (bulanDipilih.length() > 0) {
            bulanDipilih.setLength(bulanDipilih.length() - 2); // Hapus koma terakhir
        }
        
        totalField.setText("Rp " + total);
    }
    
    private void bayarSPP() {
        if (!totalField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pembayaran Berhasil!");
            
            // Simpan ke tabel
            String total = totalField.getText();
            model.addRow(new Object[]{"Bulan yang dipilih", total});
        } else {
            JOptionPane.showMessageDialog(this, "Pilih bulan terlebih dahulu!");
        }
    }

    private void resetForm() {
        for (JCheckBox cb : bulanCheckBox) {
            cb.setSelected(false);
        }
        totalField.setText("");
    }

    public static void main(String[] args) {
        new Modul3();
    }
}
