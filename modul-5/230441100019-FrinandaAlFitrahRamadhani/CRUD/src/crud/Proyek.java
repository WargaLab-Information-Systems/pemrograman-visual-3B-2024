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
public class Proyek {
    private int id;
    private String nama_proyek;
    private int durasi_pengerjaan;
    Connection conn;
    
    public Proyek(int id, String nama_proyek, int durasi_pengerjaan) {
        this.id = id;
        this.nama_proyek = nama_proyek;
        this.durasi_pengerjaan = durasi_pengerjaan;
    }
    
    public void tambahDataProyek(){
        String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
        try (Connection conn = koneksi.getConnection();            
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nama_proyek);
            ps.setInt(2, durasi_pengerjaan);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }
    
    public void editDataProyek(){
        String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
        try (Connection conn = koneksi.getConnection();            
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nama_proyek);
            ps.setInt(2, durasi_pengerjaan);
            ps.setInt(3, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }
    
    public void hapusDataProyek(){
        String sql = "DELETE FROM proyek WHERE id = ?";
        try (Connection conn = koneksi.getConnection();            
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public void setNama_Proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public String getNama_Proyek() {
        return nama_proyek;
    }

    public void setDurasi_Pengerjaan(int durasi_pengerjaan) {
        this.durasi_pengerjaan = durasi_pengerjaan;
    }

    public int getDurasi_Pengerjaan() {
        return durasi_pengerjaan;
    }
    
}
