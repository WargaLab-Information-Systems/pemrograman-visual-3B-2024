/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
/**
 *
 * @author ZENDIA AMELIA
 */
public class TBProyek {
     private final String URL = "jdbc:mysql://localhost:3306/db_modul5";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianProyek> getAllProyek() throws SQLException {
        List<BagianProyek> list_proyek = new ArrayList();
        
        String sql = "select * from tb_proyek";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianProyek barang = new BagianProyek(
                        rs.getInt("Id_Proyek"), 
                        rs.getInt("Durasi"),
                        rs.getString("Nama_Proyek")
                );
                
                list_proyek.add(barang);
            }
        }
        
        return list_proyek;
    }
    
    public void InsertProyek(BagianProyek p_brg) throws SQLException {
        String sql = "insert into tb_proyek (Durasi, Nama_Proyek) values (?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, p_brg.getDurasi());
            stmt.setString(2, p_brg.getNamaProyek());
            
            stmt.executeUpdate();
        }
    }
    
     public void updateProyek(BagianProyek p_brg) throws SQLException {
        String sql = "UPDATE tb_proyek SET Durasi = ?, Nama_Proyek = ? WHERE Id_Proyek = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, p_brg.getDurasi());
            stmt.setString(2, p_brg.getNamaProyek());
            stmt.setInt(3, p_brg.getId());  

            stmt.executeUpdate();
        }
    }
    
    public void deleteProyek(int id) throws SQLException {
        String sql = "DELETE FROM tb_proyek WHERE Id_Proyek = ?";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }
    
}