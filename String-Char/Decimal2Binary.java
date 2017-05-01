/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson;
import java.lang.Math;
/**
 *
 * @author mehran
 */
public class Decimal2Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num=15;
      String s="";
      int remain=0;
      
      while (num>=2){
          remain = Double.valueOf(num %2).intValue(); 
          s= s + Integer.valueOf(remain).toString();
          num = Double.valueOf(num /2).intValue(); 
      }  
          s=Integer.valueOf(num).toString()+ s;     
          System.out.println(s);
    }
   
  }
