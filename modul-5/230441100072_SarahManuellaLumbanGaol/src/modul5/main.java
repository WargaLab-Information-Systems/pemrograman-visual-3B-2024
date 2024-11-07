/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * /**
 *
 * @author HP
 */
public class main extends javax.swing.JFrame {

    //inisiasi GLobal Variable
    Connection conn;
    private DefaultTableModel model;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    HashMap<String, Integer> karyawanMap = new HashMap<>();
    HashMap<String, Integer> proyekMap = new HashMap<>();

    //end global variable
    public main() {
        initComponents();
        //public main
        conn = koneksi.getConnection();

        model = new DefaultTableModel();
        tblkaryawan.setModel(model);

        model.addColumn("id");
        model.addColumn("nama");
        model.addColumn("jabatan");
        model.addColumn("departemen");

        loadData();

        model1 = new DefaultTableModel();
        tblproyek.setModel(model1);

        model1.addColumn("id");
        model1.addColumn("nama_proyek");
        model1.addColumn("durasi_pengerjaan");

        loadData1();

        model2 = new DefaultTableModel();
        tbltransaksi.setModel(model2);
        model2.addColumn("id_karyawan");
        model2.addColumn("id_proyek");
        model2.addColumn("peran");
        loadData2();
        tblkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblkaryawan.getSelectedRow();
                if (row != -1) {
                    txtid.setText(tblkaryawan.getValueAt(row, 0).toString());
                    txtnama.setText(tblkaryawan.getValueAt(row, 1).toString());
                    txtjabatan.setText(tblkaryawan.getValueAt(row, 2).toString());
                    txtdepartemen.setText(tblkaryawan.getValueAt(row, 3).toString());
                }
            }
        });

        tblproyek.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblproyek.getSelectedRow();
                if (row != -1) {
                    txtid2.setText(tblproyek.getValueAt(row, 0).toString());
                    txtnamaproyek.setText(tblproyek.getValueAt(row, 1).toString());
                    txtdurasipengerjaan.setText(tblproyek.getValueAt(row, 2).toString());
                }
            }
        });
        tbltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tbltransaksi.getSelectedRow(); // Ambil baris yang dipilih
                if (row != -1) {
                    // Ambil ID Karyawan dan ID Proyek dari model tabel
                    int idKaryawan = (int) model2.getValueAt(row, 0);
                    int idProyek = (int) model2.getValueAt(row, 1);
                    String peran = (String) model2.getValueAt(row, 2);

                    // Set item yang dipilih di combo box untuk Karyawan
                    String karyawanName = karyawanMap.entrySet().stream()
                            .filter(entry -> entry.getValue().equals(idKaryawan))
                            .map(Map.Entry::getKey)
                            .findFirst().orElse(null);
                    cbxkaryawan.setSelectedItem(karyawanName);

                    // Set item yang dipilih di combo box untuk Proyek
                    String proyekName = proyekMap.entrySet().stream()
                            .filter(entry -> entry.getValue().equals(idProyek))
                            .map(Map.Entry::getKey)
                            .findFirst().orElse(null);
                    cbxproyek.setSelectedItem(proyekName);

                    // Set nilai peran ke text field
                    txtperan.setText(peran);
                }
            }
        });
    }
    //Load Data karyawan

    private void loadData() {
        model.setRowCount(0);
        try {
            String sql = "SELECT * FROM karyawan";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("jabatan"),
                    rs.getString("departemen")
                });
                karyawanMap.put(rs.getString("nama"), rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data: " + e.getMessage());
        }
    }
    //end Load Data

    //Load Data proyek
    private void loadData1() {
        model1.setRowCount(0);
        try {
            String sql = "SELECT * FROM proyek";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model1.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama_proyek"),
                    rs.getString("durasi_pengerjaan")
                });
                proyekMap.put(rs.getString("nama_proyek"), rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data: " + e.getMessage());
        }
    }

    private void loadData2() {
        model2.setRowCount(0);
        cbxkaryawan.removeAllItems();
        cbxproyek.removeAllItems();

        try {
            String sql = "SELECT * FROM transaksi";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model2.addRow(new Object[]{
                    rs.getInt("id_karyawan"),
                    rs.getInt("id_proyek"),
                    rs.getString("peran")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data: " + e.getMessage());
        }
        try {
            String sqlKaryawan = "SELECT id, nama FROM karyawan";
            PreparedStatement psKaryawan = conn.prepareStatement(sqlKaryawan);
            ResultSet rsKaryawan = psKaryawan.executeQuery();
            while (rsKaryawan.next()) {
                cbxkaryawan.addItem(rsKaryawan.getString("id") + " - " + rsKaryawan.getString("nama"));
            }

            String sqlProyek = "SELECT id, nama_proyek FROM proyek";
            PreparedStatement psProyek = conn.prepareStatement(sqlProyek);
            ResultSet rsProyek = psProyek.executeQuery();
            while (rsProyek.next()) {
                cbxproyek.addItem(rsProyek.getString("id") + " - " + rsProyek.getString("nama_proyek"));
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data: " + e.getMessage());
        }
    }
    private void saveData() {
        try {
            if (txtnama.getText().trim().isEmpty() || txtjabatan.getText().trim().isEmpty() || txtdepartemen.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtnama.getText());
            ps.setString(2, txtjabatan.getText());
            ps.setString(3, txtdepartemen.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data saved successfully");
            loadData();
        } catch (SQLException e) {
            System.out.println("Error Save Data: " + e.getMessage());
        }
    }
    private void updateData() {
        try {
            if (txtnama.getText().trim().isEmpty() || txtjabatan.getText().trim().isEmpty() || txtdepartemen.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return; 
            }
            String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtnama.getText());
            ps.setString(2, txtjabatan.getText());
            ps.setString(3, txtdepartemen.getText());
            ps.setInt(4, Integer.parseInt(txtid.getText())); // Ensure this is the correct ID
            ps.executeUpdate();
            int update1 = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengupdate data ini?", "informasi", JOptionPane.YES_NO_OPTION);
            if (update1 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Data Karyawan berhasil diupdate");
            } else {
                return;
            }
            loadData();
        } catch (SQLException e) {
            System.out.println("Error Save Data: " + e.getMessage());
        }

        tblkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblkaryawan.getSelectedRow();
                if (row != -1) {
                    txtid.setText(tblkaryawan.getValueAt(row, 0).toString());
                    txtnama.setText(tblkaryawan.getValueAt(row, 1).toString());
                    txtjabatan.setText(tblkaryawan.getValueAt(row, 2).toString());
                    txtdepartemen.setText(tblkaryawan.getValueAt(row, 3).toString());
                }
            }
        });
    }

    private void deleteData() {
        try {
            // Ensure an ID is selected
            if (txtid.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Pilih Karyawan yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String sql = "DELETE FROM karyawan WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtid.getText())); // Use the ID from the text field
            ps.executeUpdate();
            int delete1 = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini?", "informasi", JOptionPane.YES_NO_OPTION);
            if (delete1 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Data Karyawan berhasil dihapus");
            } else {
                return;
            }
            loadData(); 
        } catch (SQLException e) {
            System.out.println("Error Delete Data: " + e.getMessage());
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtjabatan = new javax.swing.JTextField();
        txtdepartemen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblkaryawan = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btntambah2 = new javax.swing.JButton();
        btnupdate2 = new javax.swing.JButton();
        btndelete2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtid2 = new javax.swing.JTextField();
        txtnamaproyek = new javax.swing.JTextField();
        txtdurasipengerjaan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblproyek = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btntambah3 = new javax.swing.JButton();
        btnupdate3 = new javax.swing.JButton();
        btndelete3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtperan = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbltransaksi = new javax.swing.JTable();
        cbxkaryawan = new javax.swing.JComboBox<>();
        cbxproyek = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pendataan Karyawan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Banner", 1, 18))); // NOI18N

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setText("Data Karyawan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Select"));
        jPanel3.setLayout(null);

        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel3.add(btntambah);
        btntambah.setBounds(6, 18, 112, 27);

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate);
        btnupdate.setBounds(118, 18, 112, 27);

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete);
        btndelete.setBounds(230, 18, 112, 27);

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(342, 18, 112, 27);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 460, 50));

        jLabel1.setText("ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setText("Nama");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setText("Jabatan");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Departemen");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtid.setEditable(false);
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 250, -1));
        jPanel2.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 250, -1));

        txtjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjabatanActionPerformed(evt);
            }
        });
        jPanel2.add(txtjabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, -1));
        jPanel2.add(txtdepartemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 250, -1));

        tblkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Jabatan", "Departemen"
            }
        ));
        jScrollPane2.setViewportView(tblkaryawan);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 430, 280));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\0000001.jpg")); // NOI18N
        jLabel17.setText("jLabel15");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jPanel5.add(jPanel2);

        jTabbedPane2.addTab("Karyawan", jPanel5);

        jPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel7.setText("Data Proyek");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 20));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Select"));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        btntambah2.setText("TAMBAH");
        btntambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambah2ActionPerformed(evt);
            }
        });
        jPanel7.add(btntambah2, new java.awt.GridBagConstraints());

        btnupdate2.setText("UPDATE");
        btnupdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate2ActionPerformed(evt);
            }
        });
        jPanel7.add(btnupdate2, new java.awt.GridBagConstraints());

        btndelete2.setText("DELETE");
        btndelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete2ActionPerformed(evt);
            }
        });
        jPanel7.add(btndelete2, new java.awt.GridBagConstraints());

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 470, 50));

        jLabel8.setText("ID");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel9.setText("Nama Proyek");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel10.setText("Durasi Pengerjaan");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtid2.setEditable(false);
        jPanel6.add(txtid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 250, -1));
        jPanel6.add(txtnamaproyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, -1));

        txtdurasipengerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurasipengerjaanActionPerformed(evt);
            }
        });
        jPanel6.add(txtdurasipengerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 250, -1));

        tblproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nama Proyek", "Durasi Pengerjaan"
            }
        ));
        jScrollPane3.setViewportView(tblproyek);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 430, 280));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\0000001.jpg")); // NOI18N
        jLabel16.setText("jLabel15");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 0, 470, 610);

        jTabbedPane2.addTab("Proyek", jPanel1);

        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel11.setText("Rekap Transaksi");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Select"));
        jPanel10.setLayout(null);

        btntambah3.setText("TAMBAH");
        btntambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambah3ActionPerformed(evt);
            }
        });
        jPanel10.add(btntambah3);
        btntambah3.setBounds(5, 18, 110, 27);

        btnupdate3.setText("UPDATE");
        btnupdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate3ActionPerformed(evt);
            }
        });
        jPanel10.add(btnupdate3);
        btnupdate3.setBounds(115, 18, 110, 27);

        btndelete3.setText("DELETE");
        btndelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete3ActionPerformed(evt);
            }
        });
        jPanel10.add(btndelete3);
        btndelete3.setBounds(225, 18, 110, 27);

        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton3);
        jButton3.setBounds(335, 18, 110, 27);

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 450, 50));

        jLabel12.setText("ID Karyawan");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel13.setText("ID Proyek");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel14.setText("Peran");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 40, -1));

        txtperan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperanActionPerformed(evt);
            }
        });
        jPanel9.add(txtperan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, -1));

        tbltransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id Karyawan", "id Proyek", "Peran"
            }
        ));
        jScrollPane4.setViewportView(tbltransaksi);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 430, 290));

        cbxkaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select Id Karyawan----" }));
        jPanel9.add(cbxkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 250, -1));

        cbxproyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Id Proyek---" }));
        jPanel9.add(cbxproyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\0000001.jpg")); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jPanel8.add(jPanel9);
        jPanel9.setBounds(0, 0, 460, 610);

        jTabbedPane2.addTab("Transaksi", jPanel8);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        saveData();
        txtnama.requestFocus();
        txtnama.setText("");
        txtjabatan.setText("");
        txtdepartemen.setText("");
    }//GEN-LAST:event_btntambahActionPerformed

    private void txtjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjabatanActionPerformed

    private void btntambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambah2ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtnamaproyek.getText().trim().isEmpty() || txtdurasipengerjaan.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return; 
            }
            String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtnamaproyek.getText());
            ps.setString(2, txtdurasipengerjaan.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambah");
            txtnamaproyek.setText("");
            txtdurasipengerjaan.setText("");
            loadData1();
        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }//GEN-LAST:event_btntambah2ActionPerformed

    private void txtdurasipengerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurasipengerjaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurasipengerjaanActionPerformed

    private void btntambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambah3ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtperan.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon Di isi Terlebih dahulu", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String selectedKaryawan = cbxkaryawan.getSelectedItem().toString();
            String selectedProyek = cbxproyek.getSelectedItem().toString();

            int idKaryawan = Integer.parseInt(selectedKaryawan.split(" - ")[0]);
            int idProyek = Integer.parseInt(selectedProyek.split(" - ")[0]); 

            String sql = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idKaryawan); 
            ps.setInt(2, idProyek); 
            ps.setString(3, txtperan.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambah");
            loadData2();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "ID karyawan Sudah ada dalam tabel!");
            System.out.println("Error Save Data: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID format", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btntambah3ActionPerformed

    private void txtperanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtperanActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updateData();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate2ActionPerformed
        try {
            // Ensure all fields are filled
            if (txtid2.getText().trim().isEmpty() || txtnamaproyek.getText().trim().isEmpty() || txtdurasipengerjaan.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Prepare the SQL update statement
            String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtnamaproyek.getText()); // Set the new project name
            ps.setString(2, txtdurasipengerjaan.getText()); 
            ps.setInt(3, Integer.parseInt(txtid2.getText())); 

            // Execute the update
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data Proyek berhasil diperbarui");
            } else {
                JOptionPane.showMessageDialog(this, "Data Proyek tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
            loadData1(); // Refresh the table
        } catch (SQLException e) {
            System.out.println("Error Update Data proyek: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);

        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnupdate2ActionPerformed

    private void btnupdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate3ActionPerformed
        // TODO add your handling code here:    // TODO add your handling code here:
        try {
            // Ensure selections are made
            if (cbxkaryawan.getSelectedIndex() == 0 || cbxproyek.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Silakan pilih Karyawan dan Proyek!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String selectedKaryawan = cbxkaryawan.getSelectedItem().toString();
            String selectedProyek = cbxproyek.getSelectedItem().toString();

            int idKaryawan = Integer.parseInt(selectedKaryawan.split(" - ")[0]); // Extracting ID
            int idProyek = Integer.parseInt(selectedProyek.split(" - ")[0]); // Extracting ID

            String sql = "UPDATE transaksi SET id_karyawan = ?, id_proyek = ? ,peran =? WHERE id_karyawan = ? AND id_proyek = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idKaryawan);
            ps.setInt(2, idProyek);
            ps.setString(3, txtperan.getText());
            ps.setInt(4, idKaryawan);
            ps.setInt(5, idProyek);

            // Execute the update
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                int update1 = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengupdate data ini?", "informasi", JOptionPane.YES_NO_OPTION);
                if (update1 == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "Data Transaksi berhasil di perbaharui");
                } else {
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Data Transaksi tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
            loadData2(); // Refresh the table
        } catch (SQLException e) {
            System.out.println("Error Update Data: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnupdate3ActionPerformed

    private void btndelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete2ActionPerformed
        try {
            if (txtid2.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Pilih Proyek yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String sql = "DELETE FROM proyek WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtid2.getText())); // Use the ID from the text field
            ps.executeUpdate();
            int delete1 = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini?", "informasi", JOptionPane.YES_NO_OPTION);
            if (delete1 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Data Proyek berhasil dihapus");
            } else {
                return;
            }
            loadData1(); // Refresh the table
        } catch (SQLException e) {
            System.out.println("Error Delete Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btndelete2ActionPerformed

    private void btndelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete3ActionPerformed
        // TODO add your handling code here:
        try {
            // Ensure both IDs are selected
            if (cbxkaryawan.getSelectedItem() == null || cbxproyek.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Pilih Karyawan dan Proyek yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String selectedKaryawan = cbxkaryawan.getSelectedItem().toString();
            String selectedProyek = cbxproyek.getSelectedItem().toString();

            int idKaryawan = Integer.parseInt(selectedKaryawan.split(" - ")[0]);
            int idProyek = Integer.parseInt(selectedProyek.split(" - ")[0]);
            String sql = "DELETE FROM transaksi WHERE id_karyawan = ? AND id_proyek = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idKaryawan);
            ps.setInt(2, idProyek);
            ps.executeUpdate();
            int delete1 = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini?", "informasi", JOptionPane.YES_NO_OPTION);
            if (delete1 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Data deleted successfully");
            }
            loadData2(); // Refresh the table
        } catch (SQLException e) {
            System.out.println("Error Delete Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btndelete3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtnama.setText("");
        txtnamaproyek.setText("");
        txtdurasipengerjaan.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtperan.requestFocus();
        txtperan.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtnamaproyek.requestFocus();
        txtnamaproyek.setText("");
        txtdurasipengerjaan.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndelete2;
    private javax.swing.JButton btndelete3;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntambah2;
    private javax.swing.JButton btntambah3;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate2;
    private javax.swing.JButton btnupdate3;
    private javax.swing.JComboBox<String> cbxkaryawan;
    private javax.swing.JComboBox<String> cbxproyek;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblkaryawan;
    private javax.swing.JTable tblproyek;
    private javax.swing.JTable tbltransaksi;
    private javax.swing.JTextField txtdepartemen;
    private javax.swing.JTextField txtdurasipengerjaan;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid2;
    private javax.swing.JTextField txtjabatan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnamaproyek;
    private javax.swing.JTextField txtperan;
    // End of variables declaration//GEN-END:variables
}
