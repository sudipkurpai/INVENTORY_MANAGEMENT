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
    
      public static int updateprofile_m ( String DOB, String ADDRESS,String GENDER,String mng_id){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("UPDATE register set DOB =?,ADDRESS =?,GENDER =? where MNG_ID = ?");
                   
                   ps.setString(1, DOB);
                   ps.setString(2, ADDRESS);
                   ps.setString(3, GENDER);
                   ps.setString(4, mng_id);
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



