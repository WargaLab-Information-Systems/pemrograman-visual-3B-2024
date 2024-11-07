/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class manajemen extends javax.swing.JFrame {

    Connection conn;
    private DefaultTableModel model;
    private DefaultTableModel proyekmodel2;
    private DefaultTableModel transaksiModel;

    public manajemen() {
        initComponents();
        conn = databaseconnection.getConnection();
        
        model = new DefaultTableModel();
        tabelkaryawan.setModel(model);
        
        proyekmodel2 = new DefaultTableModel();
        tabelproyek.setModel(proyekmodel2);
        
        transaksiModel = new DefaultTableModel();
        tabeltransaksi.setModel(transaksiModel);
        
        model.addColumn("id karyawan");
        model.addColumn("Nama karyawan");
        model.addColumn("jbt karyawan");
        model.addColumn("Dept karyawan"); 
                
        proyekmodel2.addColumn("id Proyek");
        proyekmodel2.addColumn("nama Proyek");
        proyekmodel2.addColumn("Durasi pengerjaan");
        
        transaksiModel.addColumn("id karyawan");
        transaksiModel.addColumn("id proyek");
        transaksiModel.addColumn("Peran");
     
        loadData();
        loadProyekData();
        loadTransaksiData();
        
        pengerjaan.setEditable(false);
        
    }

    
    private void submitTransaksiUpdate() {
    String idKaryawan = getproyekbyid((String) cbk_karyawan.getSelectedItem());
    String idProyek = getIdProyekByNama((String) cbk_proyek.getSelectedItem());
    String peran = peren.getText();
    
    if (idKaryawan != null && idProyek != null) {
        try {
            String sql = "UPDATE transaksi SET id_proyek = ?, peran = ? WHERE id_karyawan = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idProyek);
            ps.setString(2, peran);
            ps.setString(3, idKaryawan);
            ps.executeUpdate(); 

            // Update model tabel tanpa durasi mingguan
            updateTransaksiModel(idKaryawan, idProyek, peran); 
            JOptionPane.showMessageDialog(this, "Perubahan berhasil disimpan di tabel.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating transaksi data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih karyawan dan proyek yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    update3.setText("Update"); 
    }

    
    private String getproyekbyid(String namaKaryawan) {
        if (model.getRowCount() == 0) {
            System.out.println("Model masih kosong.");
            return null;
        }
        for (int i = 0; i < model.getRowCount(); i++) {
            
            if (model.getValueAt(i, 1).toString().equalsIgnoreCase(namaKaryawan)) {
                return model.getValueAt(i, 0).toString(); 
            }
        }
        return null; 
    }    
    private void updateTransaksiModel(String idKaryawan, String idProyek, String peran) {
       for (int i = 0; i < transaksiModel.getRowCount(); i++) {
        if (transaksiModel.getValueAt(i, 0) != null && transaksiModel.getValueAt(i, 0).equals(idKaryawan)) {
            transaksiModel.setValueAt(idProyek, i, 1); 
            transaksiModel.setValueAt(peran, i, 2); 
            
            break; 
        }
    }
    }

//     Mendapatkan ID Proyek berdasarkan nama
    private String getIdProyekByNama(String namaProyek) {
        for (int i = 0; i < proyekmodel2.getRowCount(); i++) {
            if (proyekmodel2.getValueAt(i, 1).equals(namaProyek)) { 
                return proyekmodel2.getValueAt(i, 0).toString(); 
            }
        }
        return null; // Jika tidak ditemukan
    }
    
    // load data 1
    private void loadData() {
      model.setRowCount(0);

      try {
          String sql = "SELECT * FROM karyawan";
          PreparedStatement ps = conn.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             model.addRow(new Object[]{
             rs.getInt("id"),
             rs.getString("nama"),
             rs.getString("jabatan"),
             rs.getString("departemen")             
           });
            
            cbk_karyawan.addItem(rs.getString("nama")); 
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }
    }
    //end Load Data 1
    
    // load data 2
    private void loadProyekData() {
      proyekmodel2.setRowCount(0);

      try {
          String sql = "SELECT * FROM proyek";
          PreparedStatement ps = conn.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             proyekmodel2.addRow(new Object[]{
             rs.getInt("id"),
             rs.getString("nama_proyek"),
             rs.getString("durasi_pengerjaan"),             
           });
             
           cbk_proyek.addItem(rs.getString("nama_proyek"));   
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }
    }
    // end load data 2
    
    // load transaksi
    private void loadTransaksiData() {
    DefaultTableModel transaksiModel = (DefaultTableModel) tabeltransaksi.getModel();
    transaksiModel.setRowCount(0); // Menghapus baris yang ada

    try {
        String sql = "SELECT id_karyawan, id_proyek, peran FROM transaksi"; // Pastikan hanya kolom yang ada
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            transaksiModel.addRow(new Object[]{
                rs.getString("id_karyawan"),
                rs.getString("id_proyek"),
                rs.getString("peran")
                // Jangan tambahkan kolom yang sudah dihapus
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading transaksi data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    // end load transaksi
        
    // load transaksi id
    private void loadTransaksiDataById(String idKaryawan) {
         try {
        String sql = "SELECT id_proyek, peran FROM transaksi WHERE id_karyawan = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, idKaryawan);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String idProyek = rs.getString("id_proyek");
            String peran = rs.getString("peran");

            
            cbk_karyawan.setSelectedItem(getNamaKaryawanById(idKaryawan));
            
            cbk_proyek.setSelectedItem(getNamaProyekById(idProyek));
            
            peren.setText(peran);
            pengerjaan.setText(""); 

            update3.setText("Submit"); 
        } else {
            JOptionPane.showMessageDialog(this, "Data karyawan tidak ditemukan!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading transaksi data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    // end load transaksi id
    
    // get nama karyawanId
    private String getNamaKaryawanById(String idKaryawan) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals(idKaryawan)) {
                return model.getValueAt(i, 1).toString(); 
            }
        }
        return null; // Jika tidak ditemukan
    }    
    // end get nama karyawanId
    
    // get nama proyekId
    private String getNamaProyekById(String idProyek) {
        for (int i = 0; i < proyekmodel2.getRowCount(); i++) {
            if (proyekmodel2.getValueAt(i, 0).toString().equals(idProyek)) {
                return proyekmodel2.getValueAt(i, 1).toString(); 
            }
        }
        return null; // Jika tidak ditemukan
    }    
    // end get nama proyekId
    
    
    // Combox karyawan
    private void isiComboBoxKaryawan() {
        cbk_karyawan.removeAllItems(); 
        cbk_karyawan.addItem("-- pilih --"); 

        for (int i = 0; i < model.getRowCount(); i++) {
            String namaKaryawan = model.getValueAt(i, 1).toString(); // Ambil kolom 'Nama karyawan'
            cbk_karyawan.addItem(namaKaryawan);
        }
    }
    // end Combobox karyawan 
    
    // combobox proyek
    private void isiComboBoxproyek() {
    cbk_proyek.removeAllItems(); 
    cbk_proyek.addItem("-- pilih --"); 

    for (int i = 0; i < proyekmodel2.getRowCount(); i++) {
        String namaproyek = proyekmodel2.getValueAt(i, 1).toString(); // Ambil kolom 'Nama proyek'
        cbk_proyek.addItem(namaproyek);
    }
    }
    // end combobox proyek
    
    // Durasi mingguuan
    private void isiDurasiPengerjaanJikaKeduanyaTerpilih() {
        String karyawanDipilih = (String) cbk_karyawan.getSelectedItem();
        String proyekDipilih = (String) cbk_proyek.getSelectedItem();

        if (karyawanDipilih != null && proyekDipilih != null &&
            !karyawanDipilih.equals("-- pilih --") && !proyekDipilih.equals("-- pilih --")) {

            for (int i = 0; i < proyekmodel2.getRowCount(); i++) {
                String namaProyek = proyekmodel2.getValueAt(i, 1).toString();

                if (namaProyek.equals(proyekDipilih)) {
                    String durasiString = proyekmodel2.getValueAt(i, 2).toString();
                    try {
                        int durasiHari = Integer.parseInt(durasiString);
                        int durasiMingguan = durasiHari / 7;

                        // Set durasi mingguan ke pengerjaan text field
                        pengerjaan.setText(String.valueOf(durasiMingguan));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Durasi pengerjaan tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
            }
        } else {
            pengerjaan.setText("");
        }
    }
    // end Durasi mingguuan
    
    //Simpan Data 1
    private void saveData() {
      try{
         String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1,nama_karyawan .getText());
         ps.setString(2,jabatan_karyawan .getText());
         ps.setString(3,departemen_karyawan .getText());
         ps.executeUpdate();
         JOptionPane.showMessageDialog(this, "Data saved successfully");
         
         loadData();
         isiComboBoxKaryawan();
       
        } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }
    }
    //End Simpan Data 1
    
    //Simpan Data 2
    private void saveData2() {
      try{
         String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1,nama_proyek .getText());
         ps.setString(2,durasi.getText());
         ps.executeUpdate();
         JOptionPane.showMessageDialog(this, "Data saved successfully");
         
         loadProyekData();
         isiComboBoxproyek();
       
        } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }
    }
    //End Simpan Data 2
    
    // save transaksi
    private void saveTransaksi(String idKaryawan, String idProyek, String peran) {
        try {
            String sql = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idKaryawan);
            ps.setString(2, idProyek);
            ps.setString(3, peran);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Transaksi berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Kesalahan saat menyimpan transaksi: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }
    // end save transaksi
    
    //Update Data 1
    private void updateData() {
        try {
            String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama_karyawan.getText());
            ps.setString(2, jabatan_karyawan.getText());
            ps.setString(3, departemen_karyawan.getText());
            ps.setInt(4, Integer.parseInt(id_karyawan.getText()));

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data updated sukses");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "ID tidak ditemukan dalam tabel", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error Save Data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    //end Update data 1
    
    //Update Data 2
       private void updateData2() {
        try {
            String sql = "UPDATE proyek SET nama_proyek = ?,durasi_pengerjaan = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama_proyek.getText());
            ps.setString(2, durasi.getText());
            ps.setInt(3, Integer.parseInt(id_proyek.getText()));

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data updated sukses");
                loadProyekData();
            } else {
                JOptionPane.showMessageDialog(this, "ID tidak ditemukan dalam tabel", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error Save Data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    //end Update data 2
    
    //Delete Data 1
    private void deleteData() {
     try  {
          String sql = "DELETE FROM karyawan WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(id_karyawan.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data deleted successfully");
          loadData();
     } catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    }
    //End Delete Data 1
    
    //Delete Data 2
    private void deleteData2() {
     try  {
          String sql = "DELETE FROM proyek WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(id_proyek.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data deleted successfully");
          loadProyekData();
     } catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    }
    //End Delete Data 2
    
    // delete data tabel transaksi 
        private void deleteData3() {
     try  {
          String sql = "DELETE FROM transaksi WHERE id_karyawan = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(karyawan_id.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data deleted successfully");
          loadTransaksiData();
     } catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    }
    // end delete data tabel transaksi
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelproyek = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        id_proyek = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama_proyek = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        durasi = new javax.swing.JTextField();
        tambah2 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        hapus2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        tambah3 = new javax.swing.JButton();
        cbk_karyawan = new javax.swing.JComboBox<>();
        peren = new javax.swing.JTextField();
        update3 = new javax.swing.JButton();
        hapus3 = new javax.swing.JButton();
        cbk_proyek = new javax.swing.JComboBox<>();
        pengerjaan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        karyawan_id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkaryawan = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_karyawan = new javax.swing.JTextField();
        nama_karyawan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jabatan_karyawan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        departemen_karyawan = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jPanel4.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 153, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.LINE_START);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(135, 167, 167));

        tabelproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nama proyek", "durasi pengerjaan"
            }
        ));
        jScrollPane2.setViewportView(tabelproyek);

        jLabel1.setText("ID Proyek:");

        id_proyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_proyekActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Proyek:");

        nama_proyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_proyekActionPerformed(evt);
            }
        });

        jLabel3.setText("Durasi Pengerjaan:");

        durasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durasiActionPerformed(evt);
            }
        });

        tambah2.setText("Tambah");
        tambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah2ActionPerformed(evt);
            }
        });

        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        hapus2.setText("Hapus");
        hapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel13.setText("Pengisian Daftar Proyek");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(tambah2)
                .addGap(112, 112, 112)
                .addComponent(update2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hapus2)
                .addGap(88, 88, 88))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(78, 78, 78)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durasi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah2)
                    .addComponent(update2)
                    .addComponent(hapus2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("T.proyek", jPanel2);

        jPanel3.setBackground(new java.awt.Color(190, 192, 189));

        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_karyawan", "id_proyek", "peran"
            }
        ));
        jScrollPane3.setViewportView(tabeltransaksi);

        tambah3.setText("Tambah");
        tambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah3ActionPerformed(evt);
            }
        });

        cbk_karyawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- pilih --" }));
        cbk_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbk_karyawanActionPerformed(evt);
            }
        });

        peren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perenActionPerformed(evt);
            }
        });

        update3.setText("Update");
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });

        hapus3.setText("Delete");
        hapus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus3ActionPerformed(evt);
            }
        });

        cbk_proyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- pilih --" }));
        cbk_proyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbk_proyekActionPerformed(evt);
            }
        });

        pengerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengerjaanActionPerformed(evt);
            }
        });

        jLabel8.setText("Durasi Pengerjaan (Mingguan):");

        jLabel9.setText("Peran yang dilakukan:");

        jLabel10.setText("Pilih Proyek:");

        jLabel11.setText("Pilih karyawan:");

        jLabel12.setText("ID:");

        karyawan_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawan_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(cbk_karyawan, 0, 113, Short.MAX_VALUE)
                            .addComponent(cbk_proyek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(karyawan_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peren, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tambah3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(update3)
                .addGap(91, 91, 91)
                .addComponent(hapus3)
                .addGap(225, 225, 225))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(472, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(67, 67, 67)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karyawan_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cbk_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbk_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hapus3)
                            .addComponent(update3)
                            .addComponent(tambah3))
                        .addGap(35, 35, 35))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jLabel11)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("T.transaksi", jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        tabelkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id Karyawan", "nama karyawan", "jbt Karyawan", "Dept Karyawan"
            }
        ));
        jScrollPane1.setViewportView(tabelkaryawan);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel4.setText("ID karyawan:");

        jLabel5.setText("Nama Karyawan:");

        id_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_karyawanActionPerformed(evt);
            }
        });

        jLabel6.setText("Jabatan Karyawan:");

        jabatan_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatan_karyawanActionPerformed(evt);
            }
        });

        jLabel7.setText("Departemen karyawan:");

        departemen_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departemen_karyawanActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jLabel14.setText("Pengisian Daftar Karyawan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(departemen_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jabatan_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hapus)
                    .addComponent(update)
                    .addComponent(tambah))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jabatan_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departemen_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambah)
                .addGap(51, 51, 51)
                .addComponent(update)
                .addGap(58, 58, 58)
                .addComponent(hapus)
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("T.karyawan", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jabatan_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatan_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatan_karyawanActionPerformed

    private void departemen_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departemen_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departemen_karyawanActionPerformed

    private void id_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_karyawanActionPerformed

    private void id_proyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_proyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_proyekActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        saveData();
        
        id_karyawan.setText("");
        nama_karyawan.setText("");
        jabatan_karyawan.setText("");
        departemen_karyawan.setText("");
    }//GEN-LAST:event_tambahActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        updateData();
        
        id_karyawan.setText("");
        nama_karyawan.setText("");
        jabatan_karyawan.setText("");
        departemen_karyawan.setText("");
    }//GEN-LAST:event_updateActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        deleteData();
        
        id_karyawan.setText("");
    }//GEN-LAST:event_hapusActionPerformed

    private void nama_proyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_proyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_proyekActionPerformed

    private void durasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durasiActionPerformed

    private void tambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah2ActionPerformed
        // TODO add your handling code here:
        saveData2();
        
        id_proyek.setText("");
        nama_proyek.setText("");
        durasi.setText("");
    }//GEN-LAST:event_tambah2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
        updateData2();
        
        id_proyek.setText("");
        nama_proyek.setText("");
        durasi.setText("");
    }//GEN-LAST:event_update2ActionPerformed

    private void hapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus2ActionPerformed
        // TODO add your handling code here:
        deleteData2();
        
        id_proyek.setText("");
    }//GEN-LAST:event_hapus2ActionPerformed

    private void cbk_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbk_karyawanActionPerformed
        // TODO add your handling code here:
        isiDurasiPengerjaanJikaKeduanyaTerpilih();
    }//GEN-LAST:event_cbk_karyawanActionPerformed

    private void cbk_proyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbk_proyekActionPerformed
        // TODO add your handling code here:
        isiDurasiPengerjaanJikaKeduanyaTerpilih();
    }//GEN-LAST:event_cbk_proyekActionPerformed

    private void perenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perenActionPerformed

    private void pengerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengerjaanActionPerformed
        // TODO add your handling code here:
        pengerjaan.setEditable(false);
    }//GEN-LAST:event_pengerjaanActionPerformed

    private void tambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah3ActionPerformed
        
 if (cbk_karyawan.getSelectedItem() == null || cbk_karyawan.getSelectedItem().toString().equals("-- pilih --")) {
        JOptionPane.showMessageDialog(this, "Silakan pilih nama karyawan terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    } else if (cbk_proyek.getSelectedItem() == null || cbk_proyek.getSelectedItem().toString().equals("-- pilih --")) {
        JOptionPane.showMessageDialog(this, "Silakan pilih nama proyek terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    } else {
        String namaKaryawan = cbk_karyawan.getSelectedItem().toString();
        String idKaryawan = getproyekbyid(namaKaryawan);

        String namaProyek = cbk_proyek.getSelectedItem().toString();
        String idProyek = getIdProyekByNama(namaProyek);
        String peranValue = peren.getText();

        if (idKaryawan != null && idProyek != null) {
            // Tambahkan baris ke tabel transaksiModel
            transaksiModel.addRow(new Object[]{idKaryawan, idProyek, peranValue});
            
            // Panggil metode untuk menyimpan transaksi ke database
            saveTransaksi(idKaryawan, idProyek, peranValue);
            
            resetFields(); 
        } else {
            JOptionPane.showMessageDialog(this, "ID karyawan atau proyek tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    private void resetFields() {
        id_karyawan.setText("");
        nama_karyawan.setText("");
        jabatan_karyawan.setText("");
        departemen_karyawan.setText("");

        id_proyek.setText("");
        nama_proyek.setText("");
        durasi.setText(""); 
        peren.setText("");
        pengerjaan.setText("");
        cbk_karyawan.setSelectedItem("-- pilih --");
        cbk_proyek.setSelectedItem("-- pilih --");

    }//GEN-LAST:event_tambah3ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
        // TODO add your handling code here:
    for (ActionListener al : update3.getActionListeners()) {
        update3.removeActionListener(al);
    }
    
    update3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (update3.getText().equals("Update")) {
                String selectedKaryawan = karyawan_id.getText(); 
                if (!selectedKaryawan.isEmpty()) {
                    loadTransaksiDataById(selectedKaryawan);
                    isiComboBoxKaryawan(); // Memanggil metode untuk mengisi ComboBox karyawan
                    isiComboBoxproyek();   // Memanggil metode untuk mengisi ComboBox proyek
                    update3.setText("Submit"); 
                } else {
                    JOptionPane.showMessageDialog(manajemen.this, "Silakan masukkan ID karyawan yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                submitTransaksiUpdate(); 
                update3.setText("Update"); 
                karyawan_id.setText("");  
                peren.setText("");      
                cbk_karyawan.setSelectedIndex(0); 
                cbk_proyek.setSelectedIndex(0); 
            }
        }
    });
    }//GEN-LAST:event_update3ActionPerformed

    private void hapus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus3ActionPerformed
        // TODO add your handling code here:
         deleteData3();
         
         karyawan_id.setText("");
    }//GEN-LAST:event_hapus3ActionPerformed

    private void karyawan_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawan_idActionPerformed
        // TODO add your handling code here:
        karyawan_id.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            String idKaryawanInput = karyawan_id.getText();
            if (!idKaryawanInput.isEmpty()) {
                loadTransaksiDataById(idKaryawanInput);
            } else {
                // Kosongkan semua field jika tidak ada input
            }
        }
    });
    }//GEN-LAST:event_karyawan_idActionPerformed

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
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manajemen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbk_karyawan;
    private javax.swing.JComboBox<String> cbk_proyek;
    private javax.swing.JTextField departemen_karyawan;
    private javax.swing.JTextField durasi;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hapus2;
    private javax.swing.JButton hapus3;
    private javax.swing.JTextField id_karyawan;
    private javax.swing.JTextField id_proyek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jabatan_karyawan;
    private javax.swing.JTextField karyawan_id;
    private javax.swing.JTextField nama_karyawan;
    private javax.swing.JTextField nama_proyek;
    private javax.swing.JTextField pengerjaan;
    private javax.swing.JTextField peren;
    private javax.swing.JTable tabelkaryawan;
    private javax.swing.JTable tabelproyek;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tambah2;
    private javax.swing.JButton tambah3;
    private javax.swing.JButton update;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    // End of variables declaration//GEN-END:variables
}
