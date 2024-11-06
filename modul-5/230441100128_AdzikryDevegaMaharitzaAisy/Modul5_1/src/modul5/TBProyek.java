/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author YOSEY
 */
public class TBProyek {

    private final String URL = "jdbc:mysql://localhost:3306/db_modul5";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<proyek> getAllproyek() throws SQLException {
        List<proyek> list_proyek = new ArrayList();
        
        String sql = "select * from tb_proyek";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                proyek proyek;
                proyek = new proyek( 
                        rs.getInt("id"),
                        rs.getString("nama_proyek"),
                        rs.getInt("durasi_pengerjaan")
                );
                
                list_proyek.add(proyek);
            }
        }
        
        return list_proyek;
    }
    
    public void Insertproyek(proyek proyek) throws SQLException {
        String sql = "insert into tb_proyek (durasi_pengerjaan, nama_proyek) values (?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, proyek.getDurasi_pengerjaan());
            stmt.setString(2, proyek.getNama_proyek());
            
            stmt.executeUpdate();
        }
    }
    
    public void updateProyek(proyek proyek) throws SQLException {
        String sql = "UPDATE tb_proyek SET durasi_pengerjaan = ?, nama_proyek = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, proyek.getDurasi_pengerjaan());
            stmt.setString(2, proyek.getNama_proyek());
            stmt.setInt(3, proyek.getID_proyek());  

            stmt.executeUpdate();
        }
    }
    
    public void deleteProyek(int id) throws SQLException {
        String sql = "DELETE FROM tb_proyek WHERE id = ?";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }
    
}

