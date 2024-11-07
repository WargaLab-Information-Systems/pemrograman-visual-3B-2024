/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class BarangKaryawan {

    private int id;
    private String nama, jabatan, dapartemen;
    
    public BarangKaryawan (int p_id, String p_nama, String p_jabatan, String p_dapartemen) {
        this.id = p_id;
        this.nama = p_nama;
        this.jabatan = p_jabatan;
        this.dapartemen = p_dapartemen;
    }
    
    public void setId(int p_id) {
        this.id = p_id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setNama(String p_nama) {
        this.nama = p_nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setJabatan(String p_jabatan) {
        this.jabatan = p_jabatan;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setDapartemen(String p_dapartemen) {
        this.dapartemen = p_dapartemen;
    }
    
    public String getDapartemen() {
        return dapartemen;
    }
    
}
