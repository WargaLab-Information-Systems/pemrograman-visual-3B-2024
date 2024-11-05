/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class karyawan extends javax.swing.JFrame {
    //inisiasi GLobal Variable
    Connection conn;
    private DefaultTableModel model;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    HashMap<String, Integer> karyawanMap = new HashMap<>(); 
    HashMap<String, Integer> proyekMap = new HashMap<>();
       ArrayList<Integer> listIdKaryawan = new ArrayList<>();
        ArrayList<Integer> listIdProyek = new ArrayList<>();
    //end global variabel

    /**
     * Creates new form karyawan
     */
    public karyawan() {
        initComponents();
        conn = koneksi.getConnection();
        initializeCmbBoxTransaksi();
     
        
        model = new DefaultTableModel();
        tb_karyawan.setModel(model);
        
    model.addColumn("ID");
    model.addColumn("Nama");
    model.addColumn("Jabatan");
    model.addColumn("Departemen");
    
    loadData();
    
    model1 = new DefaultTableModel();
    tb_proyek.setModel(model1);
    

    model1.addColumn("ID");
    model1.addColumn("Nama_proyek");
    model1.addColumn("Durasi_pengerjaan");
    
    loadData1();
    
    model2 = new DefaultTableModel();
    tb_transaksi.setModel(model2);
    

    model2.addColumn("ID_karyawan");
    model2.addColumn("ID_proyek");
    model2.addColumn("Peran");
    
     loadData2();
    
    //end public main
    }
    //Simpan Data
    // Save Data for Karyawan

    private void saveDataKaryawan() {
        if (nakar.getText().isEmpty() || jabatan.getText().isEmpty() || depar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi data Karyawan terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tb_karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nakar.getText());
            ps.setString(2, jabatan.getText());
            ps.setString(3, depar.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Karyawan berhasil disimpan");
            loadData();
        } catch (SQLException e) {
            System.out.println("Error Save Data Karyawan: " + e.getMessage());
        }
    }

    private void saveDataProyek() {
    if (napro.getText().isEmpty() || durpe.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Isi data Proyek terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Adjust the SQL statement to match the columns in your table
        String sql = "INSERT INTO tb_proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, napro.getText());
        ps.setString(2, durpe.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data Proyek berhasil disimpan");
        loadData1();
    } catch (SQLException e) {
        System.out.println("Error Save Data Proyek: " + e.getMessage());
    }
}
    
     // Simpan Data Transaksi
    private void initializeCmbBoxTransaksi() {
        setupCmbBoxKaryawan();
        setupCmbBoxProyek();
    }
    
    private void setupCmbBoxKaryawan() {
        cbkaryawan.removeAllItems();
        try {
            String query = "SELECT id, nama FROM tb_karyawan";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                listIdKaryawan.add(id);  // Simpan ID di ArrayList
                cbkaryawan.addItem(nama); // hanya menambahkan nama ke ComboBox
            }
        } catch (SQLException e) {
            System.out.println("Error Query Combo box Karyawan" + e.getMessage());
        }
    }
    
    private void setupCmbBoxProyek() {
        cbproyek.removeAllItems();
        try {
            String query = "SELECT id, nama_proyek FROM tb_proyek";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String namaProyek = rs.getString("nama_proyek");
                listIdProyek.add(id);  // Simpan ID di ArrayList
                cbproyek.addItem(namaProyek); // hanya menambahkan nama ke ComboBox
            }
        } catch (SQLException e) {
            System.out.println("Error Query Combo box Proyek" + e.getMessage());
        }
    }
        
   
     private void deleteData() {
     try  {
         if (nakar.getText().trim().isEmpty() || jabatan.getText().trim().isEmpty()|| depar.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return; // Menghentikan proses jika ada field yang kosong
          }
          String sql = "DELETE FROM tb_karyawan WHERE id_karyawan = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(idkar.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data deleted successfully");
          loadData();
          
     }catch (SQLException e) {
          System.out.println("Error Save Data 1" + e.getMessage());
    }
    } 
     
private void updateDataKar() {
        try {           
            if (nakar.getText().isEmpty() || jabatan.getText().isEmpty() || depar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi Form Terlebih Dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            nakar.setText("");
            jabatan.setText("");
            depar.setText("");
            idkar.requestFocus();
            return;
            }
            
            String sql = "UPDATE tb_karyawan SET nama = ?, jabatan=?, departemen =? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nakar.getText());
            stmt.setString(2, jabatan.getText());
            stmt.setString(3, depar.getText());
            stmt.setInt(4, Integer.parseInt(idkar.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
            loadData();            
            nakar.setText("");
            jabatan.setText("");
            depar.setText("");
            idkar.setText("");
            return;
        }  catch (SQLException e) {
            System.out.println("Error Save Data 2" + e.getMessage());
        }
   }

//HAPOSS


private void deleteDataKar() {
    try {
        // Check if the ID field is filled
        if (idkar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Karyawan harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            idkar.requestFocus();
            return; // Stop the process if the ID field is empty
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // If the user selects "No", exit the method
        }

        // Prepare the SQL delete statement
        String sql = "DELETE FROM tb_karyawan WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, Integer.parseInt(idkar.getText())); // Ensure this is the correct ID
        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            loadData(); // Reload the data in the table
            nakar.setText("");
            jabatan.setText("");
            depar.setText("");
            idkar.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    } catch (SQLException e) {
        System.out.println("Error Hapus Data: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID Karyawan harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
//end
    
    private void updateDataPro() {
        try {
            if (napro.getText().isEmpty() || durpe.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Isi Form Terlebih Dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            napro.setText("");
            durpe.setText("");
            return;
            }

            String sql = "UPDATE tb_proyek SET nama_proyek = ?, durasi_pengerjaan=? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, napro.getText());
            stmt.setString(2, durpe.getText());
            stmt.setInt(3, Integer.parseInt(idpro.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
            loadData1();
            napro.setText("");
            durpe.setText("");
            idpro.setText("");
            return;
        }  catch (SQLException e) {
            System.out.println("Error Save Data 3" + e.getMessage());
        }
   }
    
//HAPOSS
   private void deleteDataPro() {
    try {
        // Check if the ID field is filled
        if (idpro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Proyek harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            idpro.requestFocus();
            return; // Stop the process if the ID field is empty
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // If the user selects "No", exit the method
        }

        // Prepare the SQL delete statement
        String sql = "DELETE FROM tb_proyek WHERE id = ?"; // Ensure this matches your actual column name
        PreparedStatement stmt = conn.prepareStatement(sql);
        int projectId = Integer.parseInt(idpro.getText());
        System.out.println("Attempting to delete project with ID: " + projectId);
        stmt.setInt(1, projectId); // Ensure this is the correct ID
        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            loadData1(); // Reload the data in the table
            napro.setText("");
            durpe.setText("");
            idpro.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException e) {
        System.out.println("Error Hapus Data: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID Proyek harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

//end
        
    private void updateDataTran() {
        try {
            if (peran.getText().isEmpty() || idkar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi Form Terlebih Dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            peran.setText("");
            idkar.setText("");
            idkar.requestFocus();
            return;
            }

            String sql = "UPDATE tb_transaksi SET peran = ? WHERE id_karyawan = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, peran.getText());
            stmt.setInt(2, Integer.parseInt(idkar.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
            loadData2();
            idkar.setText("");
            peran.setText("");
            return;
        }  catch (SQLException e) {
            System.out.println("Error Save Data 4" + e.getMessage());
        }
   }
    
//HAPOSS
    private void deleteDataTransaksi() {
     try  {
      String karyawanName = (String) cbkaryawan.getSelectedItem();
                    String proyekName = (String) cbproyek.getSelectedItem();

                    int karyawanId = getKaryawanIdByName(karyawanName);
                    int proyekId = getProyekIdByName(proyekName);

                    String sql = "DELETE FROM tb_transaksi WHERE id_karyawan = ? AND id_proyek = ?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setInt(1, karyawanId);
                    ps.setInt(2, proyekId);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Data Transaksi berhasil dihapus");
                    loadData2(); 
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error Delete Data Transaksi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nakar = new javax.swing.JTextField();
        jabatan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        depar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        takar = new javax.swing.JButton();
        ekar = new javax.swing.JButton();
        hakar = new javax.swing.JButton();
        idkar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_karyawan = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_proyek = new javax.swing.JTable();
        durpe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        tapro = new javax.swing.JButton();
        epro = new javax.swing.JButton();
        hapro = new javax.swing.JButton();
        idpro = new javax.swing.JTextField();
        napro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbkaryawan = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbproyek = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        peran = new javax.swing.JTextField();
        tatran = new javax.swing.JButton();
        etran = new javax.swing.JButton();
        hatran = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_transaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");

        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jabatan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Form Karyawan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departement");

        depar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deparActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        takar.setText("Tambah");
        takar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takarActionPerformed(evt);
            }
        });

        ekar.setText("Edit");
        ekar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekarActionPerformed(evt);
            }
        });

        hakar.setText("Hapus");
        hakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hakarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(takar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hakar)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(takar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekar)
                    .addComponent(hakar))
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nakar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jabatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(idkar, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idkar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(depar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tb_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Jabatan", "Departement"
            }
        ));
        jScrollPane1.setViewportView(tb_karyawan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel1);

        jTabbedPane2.addTab("Karyawan", jPanel7);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));

        tb_proyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Proyek", "Durasi Pengerjaan"
            }
        ));
        jScrollPane2.setViewportView(tb_proyek);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        durpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durpeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");

        jPanel10.setBackground(new java.awt.Color(0, 0, 153));

        tapro.setText("Tambah");
        tapro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taproActionPerformed(evt);
            }
        });

        epro.setText("Edit");
        epro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eproActionPerformed(evt);
            }
        });

        hapro.setText("Hapus");
        hapro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haproActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tapro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tapro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epro)
                    .addComponent(hapro))
                .addContainerGap())
        );

        napro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naproActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Proyek");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Form Proyek");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Durasi Pengerjaan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idpro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(durpe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(napro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(idpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(napro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(durpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Proyek", jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setBackground(new java.awt.Color(0, 102, 204));

        jPanel12.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Transaksi");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID Karyawan");

        cbkaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Proyek");

        cbproyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Peran");

        tatran.setText("Tambah");
        tatran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tatranActionPerformed(evt);
            }
        });

        etran.setText("Edit");
        etran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etranActionPerformed(evt);
            }
        });

        hatran.setText("Hapus");
        hatran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hatranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbproyek, 0, 167, Short.MAX_VALUE)
                                    .addComponent(peran))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etran)
                                    .addComponent(tatran))
                                .addGap(18, 18, 18)
                                .addComponent(hatran))
                            .addComponent(cbkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbproyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tatran))
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(peran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etran)
                    .addComponent(hatran))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tb_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Karyawan", "Proyek", "Peran"
            }
        ));
        jScrollPane3.setViewportView(tb_transaksi);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel11);

        jTabbedPane2.addTab("Transaksi", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deparActionPerformed

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatanActionPerformed

    private void durpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durpeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durpeActionPerformed

    private void naproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naproActionPerformed

    private void hatranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatranActionPerformed
        // TODO add your handling code here:
         if(peran.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Delete Tidak Berhasil","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        }else{
        try{
            String sql = "DELETE FROM tb_transaksi WHERE id_karyawan = ? AND id_proyek = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(cbkaryawan.getSelectedItem().toString()));
            ps.setInt(2, Integer.parseInt(cbproyek.getSelectedItem().toString()));
            ps.execute();
            JOptionPane.showMessageDialog(this, "Data yang di Hapus Sukses");
            loadData2();
        } catch (SQLException e) {
            System.out.println("Error Save Data 5" + e.getMessage());
        }
         }
    }//GEN-LAST:event_hatranActionPerformed

    private void takarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takarActionPerformed
        saveDataKaryawan();
    }//GEN-LAST:event_takarActionPerformed

    private void taproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taproActionPerformed

         saveDataProyek();
    }//GEN-LAST:event_taproActionPerformed

    private void tatranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tatranActionPerformed
        // TODO add your handling code here:
        if(peran.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Mohon Di isi Terlebih dahulu","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                String sql = "INSERT INTO tb_transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, cbkaryawan.getSelectedItem().toString());
                ps.setString(2, cbproyek.getSelectedItem().toString());
                ps.setString(3, peran.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data saved successfully");
                loadData2();
            } catch (SQLException e) {
                System.out.println("Error Save Data 6" + e.getMessage());
            }
        }       
    }//GEN-LAST:event_tatranActionPerformed

    private void ekarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekarActionPerformed
    updateDataKar();
    }//GEN-LAST:event_ekarActionPerformed

    private void hakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hakarActionPerformed
    deleteDataKar();
    }//GEN-LAST:event_hakarActionPerformed

    private void eproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eproActionPerformed
         updateDataPro();
    }//GEN-LAST:event_eproActionPerformed

    private void haproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haproActionPerformed
        // TODO add your handling code here:
          deleteDataPro();
    }//GEN-LAST:event_haproActionPerformed

    private void etranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etranActionPerformed
        // TODO add your handling code here:
        if(peran.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Mohon Di isi Terlebih dahulu","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        }else{
    try {
           // Validasi apakah semua field telah diisi
            if (peran.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return; // Menghentikan proses jika ada field yang kosong
            }

            String selectedKaryawan = (String) cbkaryawan.getSelectedItem();
            String selectedProyek = (String) cbproyek.getSelectedItem();
            String Peran = peran.getText(); // Mendapatkan nilai peran dari TextField

            // Perbarui data transaksi di database
            String sqlUpdate = "UPDATE tb_transaksi SET Peran = ? WHERE id_karyawan = ? AND id_proyek = ?";
            PreparedStatement ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, Peran);    // Menyimpan nilai peran yang baru
            ps.setInt(2, Integer.parseInt(selectedKaryawan));  // Berdasarkan id_karyawan
            ps.setInt(3, Integer.parseInt(selectedProyek));    // Berdasarkan id_proyek
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau tidak ada perubahan.", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            }
            
             // Refresh data setelah update
            loadData2();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    
         }
    }//GEN-LAST:event_etranActionPerformed

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbkaryawan;
    private javax.swing.JComboBox<String> cbproyek;
    private javax.swing.JTextField depar;
    private javax.swing.JTextField durpe;
    private javax.swing.JButton ekar;
    private javax.swing.JButton epro;
    private javax.swing.JButton etran;
    private javax.swing.JButton hakar;
    private javax.swing.JButton hapro;
    private javax.swing.JButton hatran;
    private javax.swing.JTextField idkar;
    private javax.swing.JTextField idpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jabatan;
    private javax.swing.JTextField nakar;
    private javax.swing.JTextField napro;
    private javax.swing.JTextField peran;
    private javax.swing.JButton takar;
    private javax.swing.JButton tapro;
    private javax.swing.JButton tatran;
    private javax.swing.JTable tb_karyawan;
    private javax.swing.JTable tb_proyek;
    private javax.swing.JTable tb_transaksi;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        model.setRowCount(0);

      try {
          String sql = "SELECT * FROM tb_karyawan";
          PreparedStatement ps = conn.prepareStatement(sql);//menyiapkan query 
          ResultSet rs = ps.executeQuery();//menyimpan data
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             model.addRow(new Object[]{
             
             
             rs.getString("id"),
             rs.getString("nama"),
             rs.getString("jabatan"),
             rs.getString("departemen")
           });
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data 7" + e.getMessage());
       }
    }

    private void loadData1() {
        model1.setRowCount(0);

      try {
          String sql = "SELECT * FROM tb_proyek";
          PreparedStatement ps = conn.prepareStatement(sql);//menyiapkan query 
          ResultSet rs = ps.executeQuery();//menyimpan data
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             model1.addRow(new Object[]{
             rs.getString("id"),
             rs.getString("nama_proyek"),
             rs.getInt("durasi_pengerjaan")
           });
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data 8" + e.getMessage());
       }
    }

    private void loadData2() {
    String proyek= "SELECT id, nama_proyek FROM tb_proyek"; 
    String karyawan = "SELECT id, nama FROM tb_karyawan"; 
    cbproyek.removeAllItems();
    cbkaryawan.removeAllItems();
   
    
    try (PreparedStatement psKaryawan = conn.prepareStatement(karyawan);
         ResultSet rsKaryawan = psKaryawan.executeQuery()) {

        while (rsKaryawan.next()) {
            String namaKaryawan = rsKaryawan.getString("id");
            cbkaryawan.addItem(namaKaryawan);
            
        }
    } catch (SQLException e) {
        System.out.println("Error Save Data 9" + e.getMessage());
    }
    
    try (PreparedStatement psProyek = conn.prepareStatement(proyek);
         ResultSet rsProyek = psProyek.executeQuery()) {

        while (rsProyek.next()) {
            String namaProyek = rsProyek.getString("id"); 
            cbproyek.addItem(namaProyek);
        }
    } catch (SQLException e) {
        System.out.println("Error Save Data 10" + e.getMessage());
    }
    model2.setRowCount(0);

      try {
          String sql = "SELECT * FROM tb_transaksi";
          PreparedStatement ps = conn.prepareStatement(sql);//menyiapkan query 
          ResultSet rs = ps.executeQuery();//menyimpan data
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             model2.addRow(new Object[]{
             rs.getInt("id_karyawan"),
             rs.getInt("id_proyek"),
             rs.getString("peran")
           });
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data 11" + e.getMessage());
       }
    }

   

    private int getKaryawanIdByName(String karyawanName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getProyekIdByName(String proyekName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
