/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sindy
 */
public class BarangTransaksi {
    private int id_karyawan, id_proyek;
    private String peran, durasi;
    
    public BarangTransaksi (int p_id_karyawan, int p_id_proyek, String p_peran, String p_durasi) {
        this.id_karyawan = p_id_karyawan;
        this.id_proyek = p_id_proyek;
        this.peran = p_peran;
        this.durasi = p_durasi;
    }
    
    public void setIdKaryawan(int p_id_karyawan) {
        this.id_karyawan = p_id_karyawan;
    }
    
    public int getIdKaryawan() {
        return id_karyawan;
    }
    
    public void setIdProyek(int p_id_proyek) {
        this.id_proyek = p_id_proyek;
    }
    
    public int getIdProyek() {
        return id_proyek;
    }
    
    public void setPeran(String p_peran) {
        this.peran = p_peran;
    }
    
    public String getPeran() {
        return peran;
    }
    
    public void setDurasi(String p_durasi) {
        this.durasi = p_durasi;
    }
    
    public String getDurasi() {
        return durasi;
    }
}
