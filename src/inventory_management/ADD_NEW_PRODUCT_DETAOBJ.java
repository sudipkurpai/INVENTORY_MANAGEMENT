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
import javax.swing.JTextField;

/**
 *
 * @author Sudip Maiti
 */
public class ADD_NEW_PRODUCT_DETAOBJ {
    public static int add_new_product (String Manager_name, String Man_id, 
            String Date_Time,String Transaction_id, String Product_id, String Product_name, String Description, 
            String Standerd_cost,String Unit_price, String Mfg_date, String Exp_date, String Quantity,String Category, String Brand){
        int status=0;
              try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                   PreparedStatement ps=con.prepareStatement("INSERT INTO add_new_product (Manager_name, Man_id, Date_Time, Transaction_id , Product_id, Product_name, Description, Standerd_cost, Unit_price, Mfg_date, Exp_date, Quantity, Category, Brand) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, Manager_name);  
                   System.out.println("111111111"+Manager_name);
                   ps.setString(2, Man_id);
                  System.out.println("22222"+Man_id);
                   ps.setString(3, Date_Time);
                  // System.out.println("333333"+EMAIL);
                   ps.setString(4, Transaction_id);
                   System.out.println("4444444444"+ Transaction_id);
                   ps.setString(5, Product_id);
                   System.out.println("55555551"+Product_id);
                   ps.setString(6, Product_name);
                   System.out.println("6666666"+ Product_name);
                   ps.setString(7, Description);
                   System.out.println("77777777777"+Description);
                   ps.setString(8, Standerd_cost);
                   System.out.println("8888888888"+Standerd_cost);
                   ps.setString(9, Unit_price);
                   System.out.println("999999999"+Unit_price);
                   ps.setString(10, Mfg_date);
                   System.out.println("1010101010"+Mfg_date);
                   ps.setString(11, Exp_date);
                   System.out.println("1010101010"+Exp_date);
                   ps.setString(12, Quantity);
                   System.out.println("1010101010"+Quantity);
                   ps.setString(13, Category);
                   System.out.println("1010101010"+Category);
                   ps.setString(14, Brand);
                   System.out.println("1010101010"+Brand);
                  status=ps.executeUpdate();
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+status);
              return status;
}

public static boolean validate(String Product_id) throws SQLException
    {
        boolean status =false;
        try{
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from add_new_product where Product_id = ?");
            ps.setString(1, Product_id);
            
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
           }
        catch(Exception e){System.out.println(e);}
        return status;
    }
}