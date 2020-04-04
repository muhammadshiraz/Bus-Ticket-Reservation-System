package mypack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;
   
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 
         String connectionUrl = "jdbc:sqlserver://Alam-Pc\\SA:1433;databaseName=SRC_TRAVEL;user=sa;password=123";
Connection con = DriverManager.getConnection(connectionUrl);       
return con;
            
        }
             catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
        
        
}
