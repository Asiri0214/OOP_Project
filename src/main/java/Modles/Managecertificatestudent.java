/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modles;

import DatabaseLayer.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TITANIUM
 */
public class Managecertificatestudent 
{
    public void fillstudentCtable(JTable table, String valuetosearch)
    {
        
        Connection con = DbConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM CertificateStudents WHERE CONCAT('Name','PhoneNo','Address') LIKE ?;");
            ps.setString(1,"%"+valuetosearch+"%");
           
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            
            Object [] row;
            while(rs.next())
            {
                row=new Object[7]; 
                row[0]=rs.getString(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                row[4]=rs.getString(5);
                row[5]=rs.getString(6);
                row[6]=rs.getString(7);
                
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Managecertificatestudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 