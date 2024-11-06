/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YOSEY
 */
public class transaksi {

    static void setModel(DefaultTableModel model3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id_karyawan, id_proyek;
    private String peran, durasi;
    
    public transaksi (int id_karyawan, int id_proyek, String peran, String durasi) {
        this.id_karyawan = id_karyawan;
        this.id_proyek = id_proyek;
        this.peran = peran;
        this.durasi = durasi;
    }
    
    public void setIdKaryawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }
    
    public int getIdKaryawan() {
        return id_karyawan;
    }
    
    public void setIdProyek(int id_proyek) {
        this.id_proyek = id_proyek;
    }
    
    public int getIdProyek() {
        return id_proyek;
    }
    
    public void setPeran(String peran) {
        this.peran = peran;
    }
    
    public String getPeran() {
        return peran;
    }
    
    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
    public String getDurasi() {
        return durasi;
    }
}


    
