/**
 * @(#)errorchecking2.java
 *take in 5 ages and get the average age
 *check for non digits
 *
 * @author 
 * @version 1.00 2011/10/24
 */

import java.util.Scanner;
public class errorchecking2 {

    public static void main (String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	//declare variables
    	int age=0, total=0, average, i;
    	String strage;
    	
    	// for while loop
    	for (i=1;i<=5;i++) {
    			System.out.print ("Enter age " + i + ":");
    	
    			strage = input.next();
    			
    			while (!strage.matches("\\d+")){
    				System.out.println ("Error numbers only");
    				System.out.print ("Enter age: ");
    				strage = input.next();
    				//change strage to an int
    				age = Integer.parseInt(strage);
    			}
    			total= total + age;
    	
    	}//end for loop
    			
    			average=total/5;
    			System.out.println ("your average is" + average);
    }//end main method
    
    
}