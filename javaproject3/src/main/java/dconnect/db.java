/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sumiyuru
 */
public class db {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/events", "root", "root");
//here New_Database is database name, root is username and password  
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from event");
          
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
