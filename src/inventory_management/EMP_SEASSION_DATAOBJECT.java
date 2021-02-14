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
 * @author Sudip Maiti
 */
public class EMP_SEASSION_DATAOBJECT {
    public static int Emp_data_insert (String EMP_NAME, String EMP_ID, String EMAIL, 
            String PHONE, String LOGIN_TIME, String LOGOUT_TIME, String LOGIN_DATE, String LOGOUT_DATE){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO emp_session (EMP_NAME,EMP_ID,EMAIL,PHONE,"
                           + "LOGIN_TIME,LOGOUT_TIME,LOGIN_DATE,LOGOUT_DATE) VALUES (?,?,?,?,?,?,?,?)");
                   ps.setString(1, EMP_NAME);
                   ps.setString(2, EMP_ID);
                   ps.setString(3, EMAIL);
                   ps.setString(4, PHONE);
                   ps.setString(5, LOGIN_TIME);
                   ps.setString(6, LOGOUT_TIME);
                   ps.setString(7, LOGIN_DATE);
                   ps.setString(8, LOGOUT_DATE);
                                      
                   status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
    }
}
