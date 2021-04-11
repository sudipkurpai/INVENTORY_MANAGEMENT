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
 * @author RAGHUNATH DAS
 */
public class REMOVE_DATAOBJECT {
    public static int rem_emp(String emp_email){
        
        int status = 0;
        
        try
        {
            Connection con = DATABASE_CONNECTION.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM employee_register WHERE EMAIL = ?");
            ps.setString(1, emp_email);
            status = ps.executeUpdate();
            con.close();
            
        }catch(Exception e){
            System.out.println("exception :- "+e);
        }
        System.out.println("STATUS:- "+status);
        
        return status;
        
    }
    
   public static int ADD_MNG (String MNG_ID,String MNG_NAME, String EMP_NAME ,String EMP_ID,String REASON,String DATE,String TIME){
    //`MNG_ID`, `MNG_NAME`, `EMP_NAME`, `EMP_ID`, `REASON`, `DATE`, `TIME`
     int  status =0;
     try{
         Connection con = DATABASE_CONNECTION.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO remove_employee (MNG_ID,MNG_NAME,EMP_NAME,"
                           + "EMP_ID,REASON,DATE,TIME) " + "VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, MNG_ID);
            ps.setString(2, MNG_NAME);
            ps.setString(3, EMP_NAME);
            ps.setString(4,EMP_ID);
            ps.setString(5, REASON);
            ps.setString(6, DATE);
             ps.setString(7, TIME);
              status = ps.executeUpdate();
            ps.close();
            con.close();
     }catch(Exception e ){
         System.out.println("exceptionnnnnnn :-"+e);
     }
       System.out.println("statussssssssssss :-"+status);
       return status;
   
   }
   /*public static int showData (String MNG_ID){
     int  status =0;
     try{
         Connection con = DATABASE_CONNECTION.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `remove_employee` WHERE EMP_ID =?");
            ps.setString(1, MNG_ID);
           
              status = ps.executeUpdate();
            ps.close();
            con.close();
     }catch(Exception e ){
         System.out.println("exceptionnnnnnn :-"+e);
     }
       System.out.println("statussssssssssss :-"+status);
       return status;
   
   }*/
}
