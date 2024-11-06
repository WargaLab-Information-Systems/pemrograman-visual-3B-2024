/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author YOSEY
 */
public class TBTransaksi {

    private final String URL = "jdbc:mysql://localhost:3306/db_modul5";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<transaksi> getAllTransaksi() throws SQLException {
        List<transaksi> list_transaksi = new ArrayList();
        
        String sql = "select * from tb_transaksi";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                transaksi proyek = new transaksi(
                        rs.getInt("id_karyawan"), 
                        rs.getInt("id_proyek"),
                        rs.getString("peran"),
                        rs.getString("durasi")
                );
                
                list_transaksi.add(proyek);
            }
        }
        
        return list_transaksi;
    }
    public List<transaksi> cariData(int cari) throws SQLException {
        List<transaksi> list_transaksi = new ArrayList();
        String sql = "SELECT * FROM tb_transaksi WHERE id_karyawan LIKE ? OR id_proyek LIKE ?";
        try (Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, cari);
            ps.setInt(2, cari);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                transaksi barang = new transaksi(
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
    
    public void InsertTransaksi(transaksi proyek) throws SQLException {
        String sql = "insert into tb_transaksi (id_karyawan, id_proyek, peran, durasi) VALUES (?, ?, ?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, proyek.getIdKaryawan());
            stmt.setInt(2, proyek.getIdProyek());
            stmt.setString(3, proyek.getPeran());
            stmt.setString(4, proyek.getDurasi());
            
            stmt.executeUpdate();
        }
    }
    
    public void updateTransaksi(transaksi proyek) throws SQLException {
    String sql = "UPDATE tb_transaksi SET id_karyawan = ?, durasi = ?, peran = ? WHERE id_proyek = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Set parameter sesuai urutan kolom
            stmt.setInt(1, proyek.getIdKaryawan());  
            stmt.setString(2, proyek.getDurasi());       
            stmt.setString(3, proyek.getPeran());     
            // Parameter terakhir adalah ID Proyek yang unik
            stmt.setInt(4, proyek.getIdProyek());
            // Eksekusi update
            stmt.executeUpdate();
        }
    }

    
    public void deleteTransaksi(int id_karyawan, int id_proyek) throws SQLException {
        String sqlTransaksi = "DELETE FROM tb_transaksi WHERE id_karyawan = ? AND id_proyek = ?";
        String sqlKaryawan = "DELETE FROM tb_karyawan WHERE id_karyawan = ?";
        String sqlProyek = "DELETE FROM tb_proyek WHERE id_proyek = ?";
    
        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false); // Begin transaction

            try (PreparedStatement stmtTransaksi = conn.prepareStatement(sqlTransaksi);
                 PreparedStatement stmtKaryawan = conn.prepareStatement(sqlKaryawan);
                 PreparedStatement stmtProyek = conn.prepareStatement(sqlProyek)) {

                // Delete from tb_transaksi
                stmtTransaksi.setInt(1, id_karyawan);
                stmtTransaksi.setInt(2, id_proyek);
                stmtTransaksi.executeUpdate();

                // Delete from tb_karyawan
                stmtKaryawan.setInt(1, id_karyawan);
                stmtKaryawan.executeUpdate();

                // Delete from tb_proyek
                stmtProyek.setInt(1, id_proyek);
                stmtProyek.executeUpdate();

                conn.commit(); // Commit transaction if all deletions are successful
            } catch (SQLException e) {
                conn.rollback(); // Rollback transaction if any deletion fails
                throw e;
            }
        }
     }
}

