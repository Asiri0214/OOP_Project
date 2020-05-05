/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modles;

import DatabaseLayer.Myconnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


/**
 *
 * @author TITANIUM
 */
public class StudentsCertificate
{
    public void insertupdatedeletestudentC(char Operation,Integer Id,String Name,String Birthday,String Sex,
                                           String PhoneNo,String Address,String CourseName)
    {
        Connection con = Myconnection.getConnection();
        PreparedStatement ps;
        
        //i for insert
        if(Operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO CertificateStudents(Name,Birthday,Sex,PhoneNo,Address,CourseName)VALUES(?,?,?,?,?,?)");
                ps.setString(1,Name);
                ps.setString(2,Birthday);
                ps.setString(3,Sex);
                ps.setString(4,PhoneNo);
                ps.setString(5,Address);
                ps.setString(6,CourseName);
                
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"New Student Aded");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentsCertificate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void insertupdatedeletestudentC(String i, Object object, int WIDTH, String Name, String Birthday, String Sex, String PhoneNo, String Address, String CourseName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertupdatedeletestudentC(char c, Object object, int WIDTH, String Name, String Birthday, String Sex, String PhoneNo, String Address, String CourseName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
