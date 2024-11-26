/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZENDIA AMELIA
 */
public class BagianProyek {
     private int id, durasi;
    private String nama_proyek;
    
    public BagianProyek (int p_id, int p_durasi, String p_nama_proyek) {
        this.id = p_id;
        this.durasi = p_durasi;
        this.nama_proyek = p_nama_proyek;
    }
    
    public void setId(int p_id) {
        this.id = p_id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setDurasi(int p_durasi) {
        this.durasi = p_durasi;
    }
    
    public int getDurasi() {
        return durasi;
    }
    
    public void setNamaProyek(String p_nama_proyek) {
        this.nama_proyek = p_nama_proyek;
    }
    
    public String getNamaProyek() {
        return nama_proyek;
    }
    
}


