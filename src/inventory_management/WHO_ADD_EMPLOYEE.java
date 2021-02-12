/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import static java.awt.AWTEventMulticaster.add;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.jar.Attributes.Name;

/**
 *
 * @author RAGHUNATH DAS
 */
public class WHO_ADD_EMPLOYEE {

    
    public static int inventory_management (String Date, String Manager_Name, String Manager_ID, String Employee_Name,String Employee_ID ){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO who_add_employees (Date,Manager_Name,Manager_ID,Employee_Name,Employee_ID) VALUES (?,?,?,?,?)");
                   ps.setString(1, Date);
                   ps.setString(2, Manager_Name); 
                   ps.setString(3, Manager_ID);
                   ps.setString(4, Employee_Name);
                   ps.setString(5, Employee_ID);
                  
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
    }
    public static boolean validate(String mng_id,String emp_id) throws SQLException
    {
        boolean status =false;
        try{
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from id_store");
            ps.setString(1, mng_id);
            ps.setString(2, emp_id);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
           }
        catch(Exception e){System.out.println(e);}
        return status;
    }
}


