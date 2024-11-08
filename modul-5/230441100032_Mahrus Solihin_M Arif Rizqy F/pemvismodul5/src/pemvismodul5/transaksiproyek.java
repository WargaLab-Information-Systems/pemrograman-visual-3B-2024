/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
/**
 *
 * @author USER
 */
public class transaksiproyek extends javax.swing.JFrame {
    
    Connection conn;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    private DefaultTableModel model3;
    /**
     * Creates new form transaksiproyek
     */
    public transaksiproyek() {
        initComponents();
        conn = koneksi.getConnection();
        
        model1 = new DefaultTableModel();
        hasilkaryawan.setModel(model1);
        
        model1.addColumn("ID");
        model1.addColumn("Nama");
        model1.addColumn("Jabatan");
        model1.addColumn("Departemen");
        
        model2 = new DefaultTableModel();
        hasilproyek.setModel(model2);
        
        model2.addColumn("ID");
        model2.addColumn("Nama Proyek");
        model2.addColumn("Durasi Pengerjaan");
        
        model3 = new DefaultTableModel();
        hasiltransaksi.setModel(model3);
        
        model3.addColumn("ID_Karyawan");
        model3.addColumn("ID_Proyek");
        model3.addColumn("Peran");
        
        loadDataKaryawan();
        loadDataProyek();
        loadDataTransaksi();
        
        KaryawanComboBox();
        ProyekComboBox();
        
        tambahk.addActionListener(e -> saveDataKaryawan());
        updatek.addActionListener(e -> updateDataKaryawan());
        hapusk.addActionListener(e -> deleteDataKaryawan());
        
        tambahp.addActionListener(e -> saveDataProyek());
        updatep.addActionListener(e -> updateDataProyek());
        hapusp.addActionListener(e -> deleteDataProyek());
                
        tambaht.addActionListener(e -> saveDataTransaksi());
        updatet.addActionListener(e -> updateDataTransaksi());
        hapust.addActionListener(e -> deleteDataTransaksi());
    }
    
    private void loadDataKaryawan() {
        model1.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM karyawan";
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                model1.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("jabatan"),
                rs.getString("departemen")
            });
            }
        } catch (SQLException e){
            System.out.println("Error Load Data :" + e.getMessage());
        }
    }
    
    private void saveDataKaryawan(){
        try {
            String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, namak.getText());
            ps.setString(2, jabatank.getText());
            ps.setString(3, departemenk.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Saved Successfully");
            loadDataKaryawan();
        } catch (SQLException e){
            System.out.println("Error Save Data :" + e.getMessage());
        }
    }
    
    private void updateDataKaryawan(){
        try {
            String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, namak.getText());
            ps.setString(2, jabatank.getText());
            ps.setString(3, departemenk.getText());
            ps.setInt(4, Integer.parseInt(idk.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Update Successfully");
            loadDataKaryawan();
        } catch (SQLException e){
            System.out.println("Error Update Data:" + e.getMessage());
        }
    }
    
    private void deleteDataKaryawan(){
        try {
            String sql = "DELETE FROM karyawan WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idk.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Delete Successfully");
            loadDataKaryawan();
        } catch(SQLException e){
            System.out.println("Error Delete Data:" + e.getMessage());
        }
    }
    
    private void loadDataProyek() {
        model2.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM proyek";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model2.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nama_proyek"),
                rs.getInt("durasi_pengerjaan")
            });
            }
        } catch (SQLException e){
            System.out.println("Error Load Data :" + e.getMessage());
        }
    }
    
    private void saveDataProyek(){
        try {
            String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, namap.getText());
            ps.setInt(2, Integer.parseInt(durasip.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Saved Successfully");
            loadDataProyek();
        } catch (SQLException e){
            System.out.println("Error Save Data :" + e.getMessage());
        }
    }
    
    private void updateDataProyek(){
        try {
            String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, namap.getText());
            ps.setInt(2, Integer.parseInt(durasip.getText()));
            ps.setInt(3, Integer.parseInt(idp.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Update Successfully");
            loadDataProyek();
        } catch (SQLException e){
            System.out.println("Error Update Data:" + e.getMessage());
        }
    }
    
    private void deleteDataProyek(){
        try {
            String sql = "DELETE FROM proyek WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idp.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Delete Successfully");
            loadDataProyek();
        } catch(SQLException e){
            System.out.println("Error Delete Data:" + e.getMessage());
        }
    }
    
    private void KaryawanComboBox() {
        try {
            String sql = "SELECT id, nama, jabatan, departemen FROM karyawan";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                karyawanComboBox.addItem(rs.getString("id") + " - " + rs.getString("nama") + " - " + rs.getString("jabatan") + " - " + rs.getString("departemen"));
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data Karyawan ComboBox: " + e.getMessage());
        }
    }

    private void ProyekComboBox() {
        try {
            String sql = "SELECT id, nama_proyek, durasi_pengerjaan FROM proyek";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                proyekComboBox.addItem(rs.getString("id") + " - " + rs.getString("nama_proyek") + " - " + rs.getString("durasi_pengerjaan") + " Minggu");
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data Proyek ComboBox: " + e.getMessage());
        }
    }
    
    private void loadDataTransaksi() {
        model3.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM transaksi";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model3.addRow(new Object[]{
                rs.getInt("id_karyawan"),
                rs.getInt("id_proyek"),
                rs.getString("peran")
            });
            }
        } catch (SQLException e){
            System.out.println("Error Load Data :" + e.getMessage());
        }
    }
    
    private void saveDataTransaksi(){
        try {
            String sql = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, karyawanComboBox.getSelectedIndex());
            ps.setInt(2, proyekComboBox.getSelectedIndex());
            ps.setString(3, perant.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Saved Successfully");
            loadDataTransaksi();
        } catch (SQLException e){
            System.out.println("Error Save Data :" + e.getMessage());
        }
    }
    
    private void updateDataTransaksi(){
        try {
            String sql = "UPDATE transaksi SET peran = ? WHERE id_karyawan = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, perant.getText());
            ps.setInt(2, Integer.parseInt(idt.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Update Successfully");
            loadDataTransaksi();
        } catch (SQLException e){
            System.out.println("Error Update Data:" + e.getMessage());
        }
    }
    
    private void deleteDataTransaksi(){
        try {
            String sql = "DELETE FROM transaksi WHERE id_karyawan = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idt.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Delete Successfully");
            loadDataTransaksi();
        } catch(SQLException e){
            System.out.println("Error Delete Data:" + e.getMessage());
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasilkaryawan = new javax.swing.JTable();
        hapusk = new javax.swing.JButton();
        updatek = new javax.swing.JButton();
        tambahk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        namak = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jabatank = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        departemenk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        idk = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasilproyek = new javax.swing.JTable();
        hapusp = new javax.swing.JButton();
        updatep = new javax.swing.JButton();
        tambahp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        namap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        durasip = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        idp = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        hasiltransaksi = new javax.swing.JTable();
        hapust = new javax.swing.JButton();
        updatet = new javax.swing.JButton();
        tambaht = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        durasit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        perant = new javax.swing.JTextField();
        proyekComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        karyawanComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        idt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROYEK PEMBANGUNAN BANGSA");

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        hasilkaryawan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        hasilkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jabatan", "Departemen"
            }
        ));
        jScrollPane1.setViewportView(hasilkaryawan);

        hapusk.setBackground(new java.awt.Color(255, 0, 51));
        hapusk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        hapusk.setText("HAPUS");
        hapusk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapuskActionPerformed(evt);
            }
        });

        updatek.setBackground(new java.awt.Color(255, 255, 0));
        updatek.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        updatek.setText("UPDATE");
        updatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatekActionPerformed(evt);
            }
        });

        tambahk.setBackground(new java.awt.Color(0, 204, 0));
        tambahk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tambahk.setText("TAMBAH");
        tambahk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        namak.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jabatan");

        jabatank.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jabatank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatankActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departemen");

        departemenk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");

        idk.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(hapusk)
                            .addGap(18, 18, 18)
                            .addComponent(updatek)
                            .addGap(18, 18, 18)
                            .addComponent(tambahk)
                            .addGap(94, 94, 94)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jabatank)
                            .addComponent(departemenk)
                            .addComponent(namak)
                            .addComponent(idk, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jabatank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(departemenk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusk)
                    .addComponent(updatek)
                    .addComponent(tambahk))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("KARYAWAN", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        hasilproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NAMA PROYEK", "DURASI PENGERJAAN"
            }
        ));
        jScrollPane2.setViewportView(hasilproyek);

        hapusp.setBackground(new java.awt.Color(255, 0, 51));
        hapusp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        hapusp.setText("HAPUS");
        hapusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapuspActionPerformed(evt);
            }
        });

        updatep.setBackground(new java.awt.Color(255, 255, 0));
        updatep.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        updatep.setText("UPDATE");
        updatep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepActionPerformed(evt);
            }
        });

        tambahp.setBackground(new java.awt.Color(0, 204, 0));
        tambahp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tambahp.setText("TAMBAH");
        tambahp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Proyek");

        namap.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Durasi Pengerjaan");

        durasip.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID");

        idp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapusp)
                            .addGap(18, 18, 18)
                            .addComponent(updatep)
                            .addGap(18, 18, 18)
                            .addComponent(tambahp)
                            .addGap(88, 88, 88)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namap)
                            .addComponent(durasip)
                            .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(namap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(durasip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusp)
                    .addComponent(updatep)
                    .addComponent(tambahp))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("PROYEK", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        hasiltransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID KARYAWAN", "ID PROYEK", "PERAN"
            }
        ));
        jScrollPane3.setViewportView(hasiltransaksi);

        hapust.setBackground(new java.awt.Color(255, 0, 51));
        hapust.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        hapust.setText("HAPUS");

        updatet.setBackground(new java.awt.Color(255, 255, 0));
        updatet.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        updatet.setText("UPDATE");

        tambaht.setBackground(new java.awt.Color(0, 204, 0));
        tambaht.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tambaht.setText("TAMBAH");
        tambaht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pilih Proyek");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Durasi Pengerjaan");

        durasit.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Peran");

        perant.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        proyekComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  " }));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pilih Karyawan");

        karyawanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID");

        idt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(hapust)
                        .addGap(18, 18, 18)
                        .addComponent(updatet)
                        .addGap(18, 18, 18)
                        .addComponent(tambaht))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(durasit)
                            .addComponent(perant)
                            .addComponent(proyekComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(karyawanComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(karyawanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(proyekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(idt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(durasit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(perant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapust)
                    .addComponent(updatet)
                    .addComponent(tambaht))
                .addContainerGap())
        );

        jTabbedPane1.addTab("TRANSAKSI", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapuskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapuskActionPerformed

    }//GEN-LAST:event_hapuskActionPerformed

    private void updatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatekActionPerformed

    }//GEN-LAST:event_updatekActionPerformed

    private void tambahkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahkActionPerformed

    }//GEN-LAST:event_tambahkActionPerformed

    private void jabatankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatankActionPerformed

    private void hapuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapuspActionPerformed

    }//GEN-LAST:event_hapuspActionPerformed

    private void updatepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepActionPerformed

    }//GEN-LAST:event_updatepActionPerformed

    private void tambahpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahpActionPerformed

    }//GEN-LAST:event_tambahpActionPerformed

    private void tambahtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahtActionPerformed

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
            java.util.logging.Logger.getLogger(transaksiproyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksiproyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksiproyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksiproyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksiproyek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField departemenk;
    private javax.swing.JTextField durasip;
    private javax.swing.JTextField durasit;
    private javax.swing.JButton hapusk;
    private javax.swing.JButton hapusp;
    private javax.swing.JButton hapust;
    private javax.swing.JTable hasilkaryawan;
    private javax.swing.JTable hasilproyek;
    private javax.swing.JTable hasiltransaksi;
    private javax.swing.JTextField idk;
    private javax.swing.JTextField idp;
    private javax.swing.JTextField idt;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jabatank;
    private javax.swing.JComboBox<String> karyawanComboBox;
    private javax.swing.JTextField namak;
    private javax.swing.JTextField namap;
    private javax.swing.JTextField perant;
    private javax.swing.JComboBox<String> proyekComboBox;
    private javax.swing.JButton tambahk;
    private javax.swing.JButton tambahp;
    private javax.swing.JButton tambaht;
    private javax.swing.JButton updatek;
    private javax.swing.JButton updatep;
    private javax.swing.JButton updatet;
    // End of variables declaration//GEN-END:variables
}
