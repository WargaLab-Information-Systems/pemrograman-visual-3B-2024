/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EBC KOMPUTER
 */
public class Transaksi {
    private int id;
    private int id_karyawan;
    private int id_proyek;
    private String peran;
    Connection conn;
    
    public Transaksi(int id, int id_karyawan, int id_proyek, String peran) {
        this.id = id;
        this.id_karyawan = id_karyawan;
        this.id_proyek = id_proyek;
        this.peran = peran;
    }
    
    public void tambahDataTransaksi(){
        String sql = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
        try (Connection conn = koneksi.getConnection();            
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id_karyawan);
            ps.setInt(2, id_proyek);
            ps.setString(3, peran);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }
    
    public void editDataTransaksi(){
        String sql = "UPDATE transaksi SET id_karyawan = ?, id_proyek = ?, peran = ? WHERE id = ?";
        try (Connection conn = koneksi.getConnection();            
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id_karyawan);
            ps.setInt(2, id_proyek);
            ps.setString(3, peran);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }
    
    public void hapusDataTransaksi(){
        String sql = "DELETE FROM transaksi WHERE id = ?";
        try (Connection conn = koneksi.getConnection();            
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }
}
