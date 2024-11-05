/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ZENDIA AMELIA
 */
public class TBTransaksi {
    private final String URL = "jdbc:mysql://localhost:3306/db_modul5";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianTransaksi> getAllTransaksi() throws SQLException {
        List<BagianTransaksi> list_transaksi = new ArrayList();
        
        String sql = "select * from tb_transaksi";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianTransaksi barang = new BagianTransaksi(
                        rs.getInt("Id"), 
                        rs.getInt("Id_proyek"),
                        rs.getString("Peran"),
                        rs.getInt("Durasi_Mingguan")
                );
                
                list_transaksi.add(barang);
            }
        }
        
        return list_transaksi;
    }
    
     public void InsertTransaksi(BagianTransaksi p_brg) throws SQLException {
        String sql = "insert into tb_transaksi (Id, Id_proyek, Peran, Durasi_Mingguan) VALUES (?, ?, ?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, p_brg.getIdKaryawan());
            stmt.setInt(2, p_brg.getIdProyek());
            stmt.setString(3, p_brg.getPeran());
            stmt.setInt(4, p_brg.getDurasi());
            
            stmt.executeUpdate();
        }
    }
     
      public void updateTransaksi(BagianTransaksi p_brg) throws SQLException {
        String sql = "UPDATE tb_transaksi SET Id = ?, Peran = ?, Durasi_Mingguan = ? WHERE Id_proyek = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, p_brg.getIdKaryawan());
            stmt.setString(2, p_brg.getPeran());
            stmt.setInt(3, p_brg.getDurasi());
            stmt.setInt(4, p_brg.getIdProyek());  

            stmt.executeUpdate();
        }
    }
      
      public void deleteTransaksi(int id) throws SQLException {
        String sql = "DELETE FROM tb_transaksi WHERE Id = ?";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }
}
