
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class TB_Transaksi {
    
    private final String URL = "jdbc:mysql://localhost:3306/db_modul5";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BarangTransaksi> getAllTransaksi() throws SQLException {
        List<BarangTransaksi> list_transaksi = new ArrayList();
        
        String sql = "select * from tb_transaksi";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BarangTransaksi barang = new BarangTransaksi(
                        rs.getInt("id_karyawan"), 
                        rs.getInt("id_proyek"),
                        rs.getString("peran"),
                        rs.getString("durasi")
                );
                
                list_transaksi.add(barang);
            }
        }
        
        return list_transaksi;
    }
    public List<BarangTransaksi> cariData(int cari) throws SQLException {
        List<BarangTransaksi> list_transaksi = new ArrayList();
        String sql = "SELECT * FROM tb_transaksi WHERE id_karyawan LIKE ? OR id_proyek LIKE ?";
        try (Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, cari);
            ps.setInt(2, cari);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                BarangTransaksi barang = new BarangTransaksi(
                    rs.getInt("id_karyawan"), 
                    rs.getInt("id_proyek"),
                    rs.getString("peran"),
                    rs.getString("durasi")
                );
                
                list_transaksi.add(barang);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return list_transaksi;
    }
    
    public void InsertTransaksi(BarangTransaksi p_brg) throws SQLException {
        String sql = "insert into tb_transaksi (id_karyawan, id_proyek, peran, durasi) VALUES (?, ?, ?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, p_brg.getIdKaryawan());
            stmt.setInt(2, p_brg.getIdProyek());
            stmt.setString(3, p_brg.getPeran());
            stmt.setString(4, p_brg.getDurasi());
            
            stmt.executeUpdate();
        }
    }
    
    public void updateTransaksi(BarangTransaksi p_brg) throws SQLException {
    String sql = "UPDATE tb_transaksi SET id_karyawan = ?, durasi = ?, peran = ? WHERE id_proyek = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Set parameter sesuai urutan kolom
            stmt.setInt(1, p_brg.getIdKaryawan());  
            stmt.setString(2, p_brg.getDurasi());       
            stmt.setString(3, p_brg.getPeran());     

            // Parameter terakhir adalah ID Proyek yang unik
            stmt.setInt(4, p_brg.getIdProyek());

            // Eksekusi update
            stmt.executeUpdate();
        }
    }

    
     public void deleteTransaksi(int id_karyawan) throws SQLException {
        String sql = "DELETE FROM tb_transaksi WHERE id_karyawan = ?";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_karyawan);

            stmt.executeUpdate();
        }
    }
}
