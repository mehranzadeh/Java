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
public class binaryCharArray2Decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] binary = {'1','0','1','0'};
        double num=0;
        
        for (int i=0;i<binary.length;i++){
            num= num +(Math.pow(2,i)* Character.getNumericValue(binary[binary.length-i-1]));
        }
        System.out.println(num);
    
    }
    
  
}
