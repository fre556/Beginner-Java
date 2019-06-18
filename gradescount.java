/**
 * @(#)gradescount.java
 *
 *
 * @derek 
 * @version 1.00 2011/10/10
 */

import java.util.Scanner;
public class gradescount {

    public static void main (String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	//declare variables
    	int grade=0;
    	int i;
    	int passes=0; // uses variables as your counter
    	
    	//loop to take in grades
    	 for (i=1;i<=5;i++){
    	 	System.out.print ("\nEnter grade: " + i + ":");
    	 	grade=input.nextInt();
    	 //check if grade is pass
    	 if (grade>49){
    	 	passes++; // add 1 to passes
    	 }// end if
    	}//end for loop
    	
    	//tell the user how many passes there was
    	System.out.println ("\nThe number of passes were :-) " + passes );
    }//end main method
    
    
}//end clas