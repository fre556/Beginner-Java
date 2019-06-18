/**
 * @(#)GradeTest.java
 *
 *Take a gradefrom the user and if it is greater then 49it is a pass , otherwise it is a fail,
 *tell the user if the passed or failed
 * @Derek
 * @version 1.00 2011/9/26
 */

import java.util.Scanner;
public class GradeTest {
    public static void main (String args []) {
    //for user to enter data
    Scanner input = new Scanner (System.in);
    
    //declare variables
    int grade;
    //entergarde
     System.out.print ("Enter Grade:");
     grade = input.nextInt ();
     
   //check grades
   if (grade >=50){
   	System.out.println ("you passed");
   }
   else{
   	if (grade<=49)
   		System.out.println ("you failed");
   }
    }//end main method
    
    
}//end class