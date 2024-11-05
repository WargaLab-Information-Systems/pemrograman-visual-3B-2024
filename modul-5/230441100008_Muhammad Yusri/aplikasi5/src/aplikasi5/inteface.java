package aplikasi5;



//  import
import aplikasi5.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *;;
 * @author zeroo
 */

public class inteface extends javax.swing.JFrame {

// inisiasi global Variabel
    Connection conn;
    private final DefaultTableModel model;
    private final DefaultTableModel modelproyek;
    private final DefaultTableModel outtransaksimodel;
    
    private ArrayList<Integer> id_karyawan = new ArrayList<>();
    private ArrayList<Integer> id_proyek = new ArrayList<>();
    
    
    public inteface() {
        initComponents();
        conn = database.getConnection();
        
        model = new DefaultTableModel();
        modelproyek = new DefaultTableModel();
        outtransaksimodel = new DefaultTableModel();
        
        
        outkaryawan.setModel(model);
        outproyek.setModel(modelproyek);
        outtransaksi.setModel(outtransaksimodel);

        model.addColumn("id");
        model.addColumn("nama");
        model.addColumn("jabatan");
        model.addColumn("departeman");
        
        modelproyek.addColumn("id");
        modelproyek.addColumn("Nama Proyek");
        modelproyek.addColumn("Durasi Pengerjaan" );
        
        outtransaksimodel.addColumn("Nama Karyawan");
        outtransaksimodel.addColumn("Nama Proyek");
        outtransaksimodel.addColumn("Nama Peran");
        
//        outtransaksi.addColumn("nama");
        loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();


    }

    //Load Data karyawan
private void loadData() {
    model.setRowCount(0);
        
  try {
//      ini untuk karyawan
      String sql = "SELECT * FROM karyawan";
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
         // Menambahkan baris ke dalam model tabel
         model.addRow(new Object[]{
         rs.getInt("ID"),
         rs.getString("Nama"),
         rs.getString("Jabatan"),
         rs.getString("Departemen")
       });
      }
  } catch (SQLException e) {
     System.out.println("Error Save Data" + e.getMessage());
   }
}
//end Load Data karyawan

    //Load Data proyek
private void loadDataProyek() {
    modelproyek.setRowCount(0);
        String durasibaru;
  try {
//      ini untuk karyawan
      String sql = "SELECT * FROM proyek";
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs1 = ps.executeQuery();
      while (rs1.next()) {
         // Menambahkan baris ke dalam model tabel
         modelproyek.addRow(new Object[]{
         rs1.getInt("ID"),
         rs1.getString("Nama_Proyek"),
         rs1.getInt("Durasi_Pengerjaan")
       });
      }
  } catch (SQLException e) {
     System.out.println("Error Save Data" + e.getMessage());
   }
}
//end Load Data proyek

//Simpan Data
private void saveData() {
  try{
     String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES ( ?, ?, ?)";
     PreparedStatement ps = conn.prepareStatement(sql);
//     ps.setString(1, fid.getText());
     ps.setString(1, fnama.getText());
     ps.setString(2, fjabatan.getText());
     ps.setString(3, fdepartemen.getText());
     ps.executeUpdate();
     JOptionPane.showMessageDialog(this, "Data saved successfully");
     loadData();
   } catch (SQLException e) {
     System.out.println("Error Save Data" + e.getMessage());
   }
 }
//End Simpan Data

//Simpan Dataproyek
private void saveDataProyek() {
  try{
     String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES ( ?, ?)";
     PreparedStatement ps = conn.prepareStatement(sql);
//     ps.setString(1, fid.getText());
     ps.setString(1, namaproyek.getText());
     ps.setInt   (2, Integer.parseInt(durasipengerjaan.getText()));
     ps.executeUpdate();
     JOptionPane.showMessageDialog(this, "Data saved successfully");
     loadData();
   } catch (SQLException e) {
     System.out.println("Error Save Data" + e.getMessage());
   }
 }
//End Simpan Data Proyek


//Update Data
private void updateData() {
  try{
     String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, fnama.getText());
     ps.setString(2, fjabatan.getText());
     ps.setString(3, fdepartemen.getText());
     ps.setInt   (4, Integer.parseInt(fid.getText()));
     ps.executeUpdate();
     JOptionPane.showMessageDialog(this, "Data saved successfully");
     loadData();
   } catch (SQLException e) {
     System.out.println("Error Save Data" + e.getMessage());
   }
 }
//End update Data

//Update Data
private void updateDataproyek() {
  try{
     String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
     PreparedStatement ps = conn.prepareStatement(sql);
     ps.setString(1, namaproyek.getText());
     ps.setInt  (2, Integer.parseInt(durasipengerjaan.getText()));
     ps.setInt  (3, Integer.parseInt(idproyek.getText()));
     ps.executeUpdate();
     

     JOptionPane.showMessageDialog(this, "Data saved successfully");
     loadData();
   } catch (SQLException e) {
     System.out.println("Error Save Data" + e.getMessage());
   }
 }
//End update Data

//Delete Data
private void deleteData() {
 try  {
      String sql = "DELETE FROM karyawan WHERE id = ?";
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(1, Integer.parseInt(fid.getText()));
      ps.executeUpdate();
      JOptionPane.showMessageDialog(this, "Data deleted successfully");
      loadData();
 } catch (SQLException e) {
      System.out.println("Error Save Data" + e.getMessage());
  }
}
//End Delete Data

//Delete Data
private void deleteDataproyek() {
 try  {
      String sql = "DELETE FROM proyek WHERE id = ?";
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(1, Integer.parseInt(idproyek.getText()));
      ps.executeUpdate();
      JOptionPane.showMessageDialog(this, "Data deleted successfully");
      loadData();
 } catch (SQLException e) {
      System.out.println("Error Save Data" + e.getMessage());
  }
}
//End Delete Data

//CRUD transaksi
    private void loadDataTransaksi() {
    outtransaksimodel.setRowCount(0);

    try {
        String sql = """
            SELECT t.karyawan_id, k.nama AS nama_karyawan, 
                   t.proyek_id, p.nama_proyek, t.peran
            FROM transaksi t
            JOIN karyawan k ON t.karyawan_id = k.id
            JOIN proyek p ON t.proyek_id = p.id
        """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            outtransaksimodel.addRow(new Object[]{

                rs.getString("nama_karyawan"),
                rs.getString("nama_proyek"),
                rs.getString("peran")
            });
        }
    } catch (SQLException e) {
        System.out.println("Error loading transaction data: " + e.getMessage());
    }
}
           private void loadComboKaryawan() {
        cbkaryawan.removeAllItems();
        id_karyawan.clear();

        try {
            String sql = "SELECT id, nama FROM karyawan";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");

                id_karyawan.add(id);
                cbkaryawan.addItem(nama);
            }
        } catch (SQLException e) {
            System.out.println("Error loading karyawan data: " + e.getMessage());
        }
    }
//
    private void loadComboProyek() {
        cbproyek.removeAllItems();
        id_proyek.clear();

        try {
            String sql = "SELECT id, nama_proyek FROM proyek";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String namaProyek = rs.getString("nama_proyek");

                id_proyek.add(id);
                cbproyek.addItem(namaProyek);
            }
        } catch (SQLException e) {
            System.out.println("Error loading proyek data: " + e.getMessage());
        }
    }

    private int getSelectedKaryawanId() {
        int selectedIndex = cbkaryawan.getSelectedIndex();
        return selectedIndex >= 0 ? id_karyawan.get(selectedIndex) : -1;
    }

    private int getSelectedProyekId() {
        int selectedIndex = cbproyek.getSelectedIndex();
        return selectedIndex >= 0 ? id_proyek.get(selectedIndex) : -1;
    }

    private void saveTransaksi() {
    int karyawanId = getSelectedKaryawanId();
    int proyekId = getSelectedProyekId();
    String peran = fperan.getText();
    
    if (karyawanId == -1 || proyekId == -1 || peran.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please complete all fields before saving.");
        return;
    }

    try {
        String sql = "INSERT INTO transaksi (karyawan_id, proyek_id, peran) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, karyawanId);
        ps.setInt(2, proyekId);
        ps.setString(3, peran);
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Transaction saved successfully.");
        loadDataTransaksi(); // Refresh tabel transaksi setelah menyimpan data
//        clearTextFields();
    } catch (SQLException e) {
        System.out.println("Error saving transaction: " + e.getMessage());
    }
}
    private void updateTransaksi() {
    int karyawanId = getSelectedKaryawanId();
    int proyekId = getSelectedProyekId();
    String peran = fperan.getText();
    
    if (karyawanId == -1 || proyekId == -1 || peran.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please complete all fields before updating.");
        return;
    }

    try {
        String sql = "UPDATE transaksi SET peran = ? WHERE karyawan_id = ? AND proyek_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, peran);
        ps.setInt(2, karyawanId);
        ps.setInt(3, proyekId);
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Transaction updated successfully.");
            loadDataTransaksi(); // Refresh tabel transaksi setelah update data
//             clearTextFields();
        } else {
            JOptionPane.showMessageDialog(this, "Update failed: Transaction not found.");
        }
    } catch (SQLException e) {
        System.out.println("Error updating transaction: " + e.getMessage());
    }
}
    private void deleteTransaksi() {
    int karyawanId = getSelectedKaryawanId();
    int proyekId = getSelectedProyekId();
    
    if (karyawanId == -1 || proyekId == -1) {
        JOptionPane.showMessageDialog(this, "Please select a valid transaction before deleting.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this transaction?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM transaksi WHERE karyawan_id = ? AND proyek_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, karyawanId);
            ps.setInt(2, proyekId);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Transaction deleted successfully.");
                loadDataTransaksi(); // Refresh tabel transaksi setelah data dihapus
//                resetAutoIncrement("tbl_transaksi"); 
            } else {
                JOptionPane.showMessageDialog(this, "Delete failed: Transaction not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting transaction: " + e.getMessage());
        }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outkaryawan = new javax.swing.JTable();
        fid = new javax.swing.JTextField();
        fnama = new javax.swing.JTextField();
        fjabatan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fdepartemen = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outproyek = new javax.swing.JTable();
        idproyek = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        namaproyek = new javax.swing.JTextField();
        durasipengerjaan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateproyek = new javax.swing.JButton();
        hapusproyek = new javax.swing.JButton();
        tambahproyek = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbkaryawan = new javax.swing.JComboBox<>();
        tambahtransaksi = new javax.swing.JButton();
        fperan = new javax.swing.JTextField();
        cbproyek = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        outtransaksi = new javax.swing.JTable();
        updatetransaksi = new javax.swing.JButton();
        hapustransaksi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 102));

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel5.setBackground(new java.awt.Color(0, 204, 153));

        outkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jabatan", "Departemen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(outkaryawan);

        fjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fjabatanActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nama");

        jLabel3.setText("Departemen");

        jLabel4.setText("Jabatan");

        fdepartemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdepartemenActionPerformed(evt);
            }
        });

        tambah.setText("Tambah Data");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        edit.setText("Edit Data");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus Data");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(fjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdepartemen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fdepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(edit))
                .addGap(30, 30, 30)
                .addComponent(hapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jTabbedPane1.addTab("Karyawan", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));

        outproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(outproyek);

        jLabel5.setText("ID");

        jLabel6.setText("Nama Proyek");

        jLabel7.setText("Durasi Pengerjaan");

        updateproyek.setText("Update");
        updateproyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateproyekActionPerformed(evt);
            }
        });

        hapusproyek.setText("Hapus");
        hapusproyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusproyekActionPerformed(evt);
            }
        });

        tambahproyek.setText("Tambah");
        tambahproyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahproyekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(durasipengerjaan)
                            .addComponent(namaproyek)
                            .addComponent(idproyek, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(updateproyek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapusproyek))
                            .addComponent(tambahproyek, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(idproyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namaproyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(durasipengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateproyek)
                    .addComponent(hapusproyek))
                .addGap(18, 18, 18)
                .addComponent(tambahproyek)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Proyek", jPanel4);

        jPanel6.setBackground(new java.awt.Color(0, 204, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Peran");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 67, -1));

        cbkaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkaryawanActionPerformed(evt);
            }
        });
        jPanel6.add(cbkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 250, 30));

        tambahtransaksi.setText("Tambah");
        tambahtransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahtransaksiActionPerformed(evt);
            }
        });
        jPanel6.add(tambahtransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 207, -1));
        jPanel6.add(fperan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 199, -1));

        cbproyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbproyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbproyekActionPerformed(evt);
            }
        });
        jPanel6.add(cbproyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 250, 30));

        outtransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(outtransaksi);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 790, 190));

        updatetransaksi.setText("Update");
        updatetransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetransaksiActionPerformed(evt);
            }
        });
        jPanel6.add(updatetransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        hapustransaksi.setText("Hapus");
        hapustransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapustransaksiActionPerformed(evt);
            }
        });
        jPanel6.add(hapustransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel9.setText("Nama Karyawan");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel10.setText("Nama Proyek");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("transaksi proyek", jPanel2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel11.setFont(new java.awt.Font("Hack", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Transaksi Jual/ beli jabatan \"eh maksudnya proyek\"\"");

        jLabel12.setFont(new java.awt.Font("Hack", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SISUPER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(300, 300, 300))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fjabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fjabatanActionPerformed

    private void fdepartemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdepartemenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdepartemenActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        saveData();
        loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_tambahActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        updateData();
           loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        deleteData();
           loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_hapusActionPerformed

    private void tambahproyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahproyekActionPerformed
        // TODO add your handling code here:
        saveDataProyek();
        loadDataProyek();
           loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_tambahproyekActionPerformed

    private void cbkaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkaryawanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbkaryawanActionPerformed

    private void updateproyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateproyekActionPerformed
        // TODO add your handling code here:
        updateDataproyek();
        loadDataProyek();
           loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_updateproyekActionPerformed

    private void hapusproyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusproyekActionPerformed
        // TODO add your handling code here:
        deleteDataproyek();
        loadDataProyek();
        loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_hapusproyekActionPerformed

    private void tambahtransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahtransaksiActionPerformed
        // TODO add your handling code here:
        loadDataTransaksi();
        getSelectedKaryawanId();
        getSelectedProyekId();
        saveTransaksi();
    }//GEN-LAST:event_tambahtransaksiActionPerformed

    private void cbproyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbproyekActionPerformed
        // TODO add your handling code here:
        loadDataTransaksi();
        getSelectedKaryawanId();
        getSelectedProyekId();
        
        
    }//GEN-LAST:event_cbproyekActionPerformed

    private void updatetransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetransaksiActionPerformed
        // TODO add your handling code here:
        updateTransaksi();
         loadDataProyek();
        loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_updatetransaksiActionPerformed

    private void hapustransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapustransaksiActionPerformed
        // TODO add your handling code here:
        deleteTransaksi();
         loadDataProyek();
        loadDataProyek();
        loadData();
        loadDataTransaksi();
        loadComboKaryawan();
        loadComboProyek();
    }//GEN-LAST:event_hapustransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inteface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inteface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbkaryawan;
    private javax.swing.JComboBox<String> cbproyek;
    private javax.swing.JTextField durasipengerjaan;
    private javax.swing.JButton edit;
    private javax.swing.JTextField fdepartemen;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fjabatan;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fperan;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hapusproyek;
    private javax.swing.JButton hapustransaksi;
    private javax.swing.JTextField idproyek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField namaproyek;
    private javax.swing.JTable outkaryawan;
    private javax.swing.JTable outproyek;
    private javax.swing.JTable outtransaksi;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tambahproyek;
    private javax.swing.JButton tambahtransaksi;
    private javax.swing.JButton updateproyek;
    private javax.swing.JButton updatetransaksi;
    // End of variables declaration//GEN-END:variables

}