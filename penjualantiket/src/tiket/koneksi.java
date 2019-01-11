package tiket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class koneksi{
    public Statement stat;
    public ResultSet res;
    public Connection con;
    public PreparedStatement pst;
    String dbname="tiket";
    String user="root";
    String pass="";
    String url="jdbc:mysql://localhost:3306/\" + dbname;";
    
    public koneksi()
    {
        if (con==null)
        {
            try
            {
                Class.forName("com.mysqll.jdbc.Driver");
                con=DriverManager.getConnection(this.url, this.user, this.pass);
                stat=con.createStatement();                
            }
            
            catch(SQLException ea)
            {
                System.err.println(ea);
            }
            
            catch(ClassNotFoundException ex)
            {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
    }

    Connection getkoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}