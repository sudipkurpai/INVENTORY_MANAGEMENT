/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_management;
import java.util.*;
/**
 *
 * @author ganesh pradhan
 */
public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
      int a,b;
        Scanner sc = new Scanner(System.in);

      System.out.println("Sum of x+y = " + z);
      
      int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
            
         
      System.out.println("the value of b is"+n);
      
      
      
        System.out.println("Enter a Number:");
        a=sc.nextInt();
        System.out.println("Value Of A = " + a);
       // System.out.println("Value Of B = " + b);
        b=a;
        System.out.println("Value Of A = " + a);
        System.out.println("Value Of B = " + b);
    }
}
