/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author YOSEY
 */
public class Karyawan {
    private int id_karyawan;
    private String nama_karyawan, jabatan, departemen;
    
    public Karyawan(int id_karyawan, String nama_karyawan, String jabatan, String departemen){
        this.id_karyawan = id_karyawan;
        this.nama_karyawan = nama_karyawan;
        this.jabatan = jabatan;
        this.departemen = departemen;

     }
     public void setID_karyawan(int ID)  {
       this.id_karyawan = id_karyawan;
   }
   public int getID(){
       return id_karyawan;
   }
   public void setNama_karyawan(String nama_karyawan){  
       this.nama_karyawan = nama_karyawan;
   }      
   public String getNama_karyawan(){
       return nama_karyawan;
   }
   public void setJabatan(String jabatan){  
       this.jabatan = jabatan;
   }      
   public String getJabatan(){
       return jabatan;
   }
   public void setDepartemen(String departemen){  
       this.departemen = departemen;
   }      
   public String getDepartemen(){
       return departemen;
   }  

}
