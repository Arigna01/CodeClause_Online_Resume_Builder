package cv.generator;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class db {
    Connection conn=null;
    public static Connection java_db(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "arigna01");
            return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
