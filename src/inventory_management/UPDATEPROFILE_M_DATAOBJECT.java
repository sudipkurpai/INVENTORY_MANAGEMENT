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
public class UPDATEPROFILE_M_DATAOBJECT {
    
      public static int updateprofile_m (String FIRST_NAME, String LAST_NAME, String EMAIL, 
            String MOBILE_NO, String PASSWORD, String CONFIRM_PASSWORD,String DOB, String ADDRESS, String GENDER){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("UPDATE register set FIRST_NAME =? ,LAST_NAME =? ,EMAIL =?,MOBILE_NO =? ,"
                           + "PASSWORD =?,CONFIRM_PASSWORD =? ,String DOB =?,ADDRESS =?,GENDER =? ");
                   ps.setString(1, FIRST_NAME);
                   ps.setString(2, LAST_NAME);
                   ps.setString(3, EMAIL);
                   ps.setString(4, MOBILE_NO);
                   ps.setString(5, PASSWORD);
                   ps.setString(6, CONFIRM_PASSWORD);
                   ps.setString(7, DOB);
                   ps.setString(8, ADDRESS);
                   ps.setString(9, GENDER);
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
   
    
}



