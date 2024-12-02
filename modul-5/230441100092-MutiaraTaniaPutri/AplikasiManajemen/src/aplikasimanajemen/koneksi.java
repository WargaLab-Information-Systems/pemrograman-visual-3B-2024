/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasimanajemen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi { // Perhatikan huruf kecil 'k'
    // Pastikan metode getConnection() didefinisikan sebagai static
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Ganti dengan URL, USER, dan PASSWORD database Anda
            String URL = "jdbc:mysql://localhost:3306/db_manajemen";
            String USER = "root"; // Sesuaikan dengan username Anda
            String PASS = ""; // Sesuaikan dengan password Anda
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
        }
        return conn;
    }
}
