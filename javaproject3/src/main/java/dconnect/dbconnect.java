
package dconnect;

import java.sql.Connection;
import java.sql.DriverManager;



public class dbconnect {
    
    public static Connection connect()
    {
      Connection conn=null;
      
       try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/events", "root", "root");
            }
           
            catch (Exception e) {
            System.out.println(e);
        }
       
       return conn;
     }
    
    
}
