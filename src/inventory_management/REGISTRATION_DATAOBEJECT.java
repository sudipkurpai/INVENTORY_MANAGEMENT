/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author Sudip Maiti
 */
public class REGISTRATION_DATAOBEJECT {
    public static int inventory_management_system (String FIRST_NAME, String LAST_NAME, String EMAIL, 
            String MOBILE_NO, String PASSWORD, String CONFIRM_PASSWORD, String ADDRESS, String GENDER){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO register(FIRST_NAME,LAST_NAME,EMAIL,MOBILE_NO,"
                           + "PASSWORD,CONFIRM_PASSWORD,ADDRESS,GENDER) VALUES (?,?,?,?,?,?,?,?)");
                   ps.setString(1, FIRST_NAME);
                   ps.setString(2, LAST_NAME);
                   ps.setString(3, EMAIL);
                   ps.setString(4, MOBILE_NO);
                   ps.setString(5, PASSWORD);
                   ps.setString(6, CONFIRM_PASSWORD);
                   ps.setString(7, ADDRESS);
                   ps.setString(8, GENDER);
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
            PreparedStatement ps=con.prepareStatement("select * from register where Email = ? and Password=?");
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
