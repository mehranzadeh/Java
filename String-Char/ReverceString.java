/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson;

/**
 *
 * @author mehran
 */
public class ReverceString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="book";
        char[] temp= new char[s.length()];
            
        for (int i=0;i< s.length();i++){
           temp[i]= s.charAt(s.length()-i-1);
        }
        s= new String (temp);   
        System.out.println(s);
       
    }
    
  
}
