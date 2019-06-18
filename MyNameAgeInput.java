/**
 * @(#)MyNameAgeInput.java
 *
 *Take in a name  and an age and print a persons name and ages
 * @Derek 
 * @version 1.00 2011/9/19
 */

import java.util.Scanner;
public class MyNameAgeInput {

    public static void main (String args []) {
    	Scanner input = new Scanner (System.in);
    	
    //declare varaibles
    int age;  
    	System.out.print ("enter age :");
    	age = input.nextInt();
    	System. out.println ("\nMy name is derek");
    	System. out.println ("\nMy age is " + age);
    	System. out.println ("\nWhopper");
    	 
    
    }//end main
    
    
}//end class