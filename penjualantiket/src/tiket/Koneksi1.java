/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiket;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author FUJITSU
 */
public class Koneksi1 {
    public static Connection getKoneksi(){
        Connection con= null;
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    return con;
    }
//    public static void main(String[] args){
//        Connection con = null;
//        try {
//            con = Koneksi1.getKoneksi();
//            if(con!=null){
//                System.out.println("success");
//            }
//        } catch (Exception e) {
//        }
//    }
}
