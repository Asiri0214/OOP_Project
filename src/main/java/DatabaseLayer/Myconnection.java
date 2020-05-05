package DatabaseLayer;

import java.sql.*;


public class Myconnection
{
    public static Connection getConnection()
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
