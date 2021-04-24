/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RAGHUNATH DAS
 */
public class SALES_TARGET_DATAOBJECT {
     public static int inventory_management (String MANAGER_MANE, String MANAGER_ID, String DATE, 
            String TIME, String PRODUCT_ID, String PRODUCT_NAME, String FROM_DATE, 
            String TO_DATE,String QUANTITY, String DRSCRIPTION){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO sales_target1 (MANAGER_MANE,MANAGER_ID,DATE,TIME,"
                           + "PRODUCT_ID,PRODUCT_NAME,FROM_DATE,TO_DATE,QUANTITY,DRSCRIPTION) "
                           + "VALUES (?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, MANAGER_MANE);
                   ps.setString(2, MANAGER_ID);
                   ps.setString(3, DATE);
                   ps.setString(4, TIME); 
                   ps.setString(5, PRODUCT_ID);
                   ps.setString(6, PRODUCT_NAME);
                   ps.setString(7, FROM_DATE);
                   ps.setString(8, TO_DATE);
                   ps.setString(9, QUANTITY);
                   ps.setString(10, DRSCRIPTION);                 
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
    public static boolean validate(String email,String password) throws SQLException
    {
        boolean status =false;
        try{
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from employee_register where Emp_Id = ? and Password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
           }
        catch(Exception e){System.out.println(e);}
        return status;
    }
}
