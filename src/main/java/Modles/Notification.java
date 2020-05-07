/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modles;

import DatabaseLayer.DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TITANIUM
 */
public class Notification 
{
    public static int countData(String tableName)
    {
        int total = 0;
        Connection con = DbConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*)FROM "+tableName);
            while(rs.next())
            {
                total=rs.getShort(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Notification.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return total;
    }
}
