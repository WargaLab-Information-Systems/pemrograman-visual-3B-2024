/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author EBC KOMPUTER
 */
public class Karyawan {
    private int id;
    private String nama;
    private String jabatan;
    private String departemen;
//    Connection conn;
    
    public Karyawan(int id, String nama, String jabatan, String departemen) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.departemen = departemen;
    }
    
    
    
    public void tambahDataKaryawan(){
        String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
        try (Connection conn = koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nama);
            ps.setString(2, jabatan);
            ps.setString(3, departemen);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }
    
    public void editDataKaryawan(){
        String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
        try (Connection conn = koneksi.getConnection();  
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nama);
            ps.setString(2, jabatan);
            ps.setString(3, departemen);
            ps.setInt(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        } catch (SQLException e) {
            System.out.println("Error Save Data " + e.getMessage());
        }
    }

    public void hapusDataKaryawan(){
        String sql = "DELETE FROM karyawan WHERE id = ?";
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
    
    
}
