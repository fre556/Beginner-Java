/**
 * @(#)fivegradescheck.java
 *
 *take in 5 grades, get passes and fails use a for loop
 *check for non digits
 * @author 
 * @version 1.00 2012/1/9
 */

import java.util.Scanner;
public class fivegradescheck {

    public static void main(String args[]) {
    	Scanner input=new Scanner (System.in);
    	
    	String strade="";
    	int grade,i, passes=0,fails=0;
    	
    	for (i=1;i<6;i++) {
    		System.out.print ("Enter grade :");
    		strade = input.next();
    		
    		while (!strade.matches("\\d+")) {
    			System.out.print ("Error numbers only");
    			
    			System.out.print("Enter Grades: ");
    			strade = input.next();
    			
    		}//end while
    	}//end for
    	
    	grade = Integer.parseInt(strade);
    	 
    	 if (passes>50) {
    	 	System.out.print ("The number of passes is " + passes);
    	 		passes++;
    	 }
    	 if (fails<50) {
    	 	System.out.print ("The number of fails is " + fails);
    	 	fails++;
    	 }
    	
    	
    
    }//end main
    
    
}//end class