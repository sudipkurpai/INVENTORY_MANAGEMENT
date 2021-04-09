/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ganesh pradhan
 */
public class REMOVE_EMPLOYEE_DATA_OBJECT { 
    public static int remove (String Emp_id){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps = con.prepareStatement("delete from employee_register where EMP_ID =?");
                   ps.setString(1, Emp_id);  
                   status=ps.executeUpdate();
                   con.close();
       }catch(Exception e){
       System.out.println("e"+e);
           
       }
       return status;
    }
    
    
    
    
}
