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
public class TBKaryawan {
    private final String URL = "jdbc:mysql://localhost:3306/db_modul5";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<BagianKaryawan> getAllKaryawan() throws SQLException {
        List<BagianKaryawan> list_karyawan = new ArrayList();
        
        String sql = "select * from tb_karyawan";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                BagianKaryawan barang = new BagianKaryawan(
                        rs.getInt("Id"), 
                        rs.getString("Nama_Karyawan"),
                        rs.getString("Bidang_Pekerjaan"),
                        rs.getString("Departemen")
                );
                
                list_karyawan.add(barang);
            }
        }
        
        return list_karyawan;
    } 
    
    public void InsertKaryawan(BagianKaryawan p_brg) throws SQLException {
        String sql = "insert into tb_karyawan (Nama_Karyawan, Bidang_Pekerjaan, Departemen) values (?, ?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, p_brg.getNama());
            stmt.setString(2, p_brg.getJabatan());
            stmt.setString(3, p_brg.getDapartemen());
            
            stmt.executeUpdate();
        }
    }
    
     public void updateKaryawan(BagianKaryawan p_brg) throws SQLException {
    String sql = "UPDATE tb_karyawan SET nama_Karyawan = ?, Bidang_Pekerjaan = ?, Departemen = ? WHERE id = ?";
    
    try (Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, p_brg.getNama());
        stmt.setString(2, p_brg.getJabatan());
        stmt.setString(3, p_brg.getDapartemen());
        stmt.setInt(4, p_brg.getId());
        
        stmt.executeUpdate();
        }
    }
    
    public void deleteKaryawan(int id) throws SQLException {
        String sql = "DELETE FROM tb_karyawan WHERE id = ?";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }
}

