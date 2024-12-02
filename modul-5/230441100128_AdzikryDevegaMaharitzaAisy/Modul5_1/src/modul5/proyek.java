/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YOSEY
 */
public class proyek {

    static List<proyek> getAllproyek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setModel(DefaultTableModel model2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id_proyek,durasi_pengerjaan;
    private  String nama_proyek;
    
    public proyek(int id_proyek, String nama_proyek, int durasi_pengerjaan){
        this.id_proyek = id_proyek;
        this.nama_proyek = nama_proyek;
        this.durasi_pengerjaan = durasi_pengerjaan;

    }

   public void setID_proyek(int ID)  {
       this.id_proyek = id_proyek;
   }
   public int getID_proyek(){
       return id_proyek;
   }
   public void setNama_proyek(String nama_proyek){  
       this.nama_proyek = nama_proyek;
   }      
   public String getNama_proyek(){
       return nama_proyek;
   }
   public void setDurasi_pengerjaan(int durasi_pengerjaan){  
       this.durasi_pengerjaan = durasi_pengerjaan;
   }      
   public int getDurasi_pengerjaan(){
       return durasi_pengerjaan;
   }
 
}
