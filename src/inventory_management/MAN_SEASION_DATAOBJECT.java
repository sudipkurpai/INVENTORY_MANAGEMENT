/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Sudip Maiti
 */

public class MAN_SEASION_DATAOBJECT {
     public static int man_isert_session (String MANAGER_NAME, String MAN_ID, String MAN_PHONE, 
            String MAN_EMAIL, String LAST_LOGIN_TIME, String LAST_LOGOUT_TIME, String LAST_LOGIN_DATE, 
            String LAST_LOGOUT_DATE){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO manager_session (MANAGER_NAME,MAN_ID,MAN_PHONE,MAN_EMAIL,"
                           + "LAST_LOGIN_TIME,LAST_LOGOUT_TIME,LAST_LOGIN_DATE,LAST_LOGOUT_DATE) VALUES (?,?,?,?,?,?,?,?)");
                   ps.setString(1, MANAGER_NAME);
                   ps.setString(2, MAN_ID);
                   ps.setString(3, MAN_PHONE);
                   ps.setString(4, MAN_EMAIL);
                   ps.setString(5, LAST_LOGIN_TIME);
                   ps.setString(6, LAST_LOGOUT_TIME);
                   ps.setString(7, LAST_LOGIN_DATE);
                   ps.setString(8, LAST_LOGOUT_DATE);
                                      
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
     public static int man_update_session (String LAST_LOGOUT_TIME, String LAST_LOGOUT_DATE, 
             String LAST_LOGIN_TIME, String LAST_LOGIN_DATE){
        int status=0;
         System.out.println("0000000000000000000000");
              try{
                  System.out.println("11111");
                   Connection con=DATABASE_CONNECTION.getConnection(); 
                   System.out.println("22222222222");
                   String Sql = "UPDATE manager_session SET LAST_LOGOUT_TIME = ?, LAST_LOGOUT_DATE = ?"
                           + " WHERE LAST_LOGIN_TIME = ? AND LAST_LOGIN_DATE = ?";
                   PreparedStatement ps=con.prepareStatement(Sql);
//UPDATE manager_session SET LAST_LOGOUT_TIME = '85565' , LAST_LOGOUT_DATE='155' WHERE LAST_LOGIN_TIME ='09:26:03 PM' AND LAST_LOGIN_DATE ='13-02-2021';
                   ps.setString(1, LAST_LOGOUT_TIME);
                   ps.setString(2, LAST_LOGOUT_DATE);
                   ps.setString(3, LAST_LOGIN_TIME);
                   ps.setString(4, LAST_LOGIN_DATE);
                   System.out.println("333333333333");
                   status=ps.executeUpdate();
                   System.out.println("444444444444444");
                   con.close();
              }catch(SQLException e){
                  System.out.println(e);
              }
              System.out.println("UPDATE SESSION ----------------"+status);
              return status;

//INSERT INTO `register`(`FIRST_NAME`, `LAST_NAME`, `EMAIL`, `MOBILE_NO`, `PASSWORD`, `CONFIRM_PASSWORD`, `ADDRESS`, `GENDER`) 
    }
}
