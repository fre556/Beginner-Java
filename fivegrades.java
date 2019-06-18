/**
 * @(#)fivegrades.java
 *take in 5 grades and get the total of the grades. Get the average.
 *print the total and the average 
 *
 * derek
 * @version 1.00 2011/9/28
 */

import java.util.Scanner;
public class fivegrades {

    	public static void main(String args[]) {
    		Scanner input = new Scanner (System.in);
    		
    		//declare variables
    		int grade1, grade2, grade3, grade4, grade5, total=0, average;
    		
    		//prompt user for grade 1
    		System.out.print ("\nEnter Grade 1:");
    		grade1=input.nextInt();
    		System.out.print ("\nEnter Grade 2:");
    		grade2=input.nextInt();
    		System.out.print ("\nEnter Grade 3:");
    		grade3=input.nextInt();
    		System.out.print ("\nEnter Grade 4:");
    		grade4=input.nextInt();
    		System.out.print ("\nEnter Grade 5:");
    		grade5=input.nextInt();
    				
    		//add the grade to total
    		total = total + grade1 + grade2 + grade3 + grade4 + grade5 ; 
    		System.out.println ("\nyour total is " + total);
    		//average
    		average = total / 5;
    		System.out.println ("\nYour average is " + average);
    	
    
    }//end main method
    
    
}// end class