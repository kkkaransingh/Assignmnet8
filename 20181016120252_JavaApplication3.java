/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 1795037
 */
import java.util.Scanner;
import java.util.Random;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,a,j;
 Random randomobj =new Random();     
   
    System.out.print("how many numbers ? =" );
    Scanner keyboard =new Scanner(System.in);
     a=keyboard.nextInt();
   
    for(i=0;i<=a; i++)
    {
        j=randomobj.nextInt(1000);
         System.out.println("my random num is " +j);
    
  
       if(j%2==0)
       {
           System.out.println("number is even "+j );
           
       }
       else{
           System.out.println("odd" +j);
       }
   }
}
}