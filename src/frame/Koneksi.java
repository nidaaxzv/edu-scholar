/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {

    private static Connection koneksi;

    public static Connection getKoneksi() throws SQLException {
        String user = "root";
        String pswd = "";
        String host = "localhost";
        String db = "db_edu";
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://" + host + "/" + db + "?&user=" + user + "&password=" + pswd;
                koneksi = DriverManager.getConnection(url);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi ke database gagal" + e.getMessage());
            }
        }
            return koneksi;
    }
    public static void main(String[] args) {
        try {
            getKoneksi();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    }
