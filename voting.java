/**
 * @(#)voting.java
 *take in 5 ages and check for non-digits
 *Tell the user how many are old enough to vote and how many are too young 
 *to vote
 *
 * @author 
 * @version 1.00 2011/10/24
 */

import java.util.Scanner;
public class voting {

    public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    	
    	int old=0, young=0,age=0, i ;
    	String strage;
    	
    	for (i=1;i<6;i++){
    		System.out.print ("Enter age " + i + ":");
    		strage = input.next();
    			
    			while (!strage.matches("\\d+")){
    				System.out.println ("Error numbers only");
    				System.out.print ("Enter age: " + i + ":");
    				strage = input.next();
    				//change strage to an int
    				age = Integer.parseInt(strage);
    			}
    	if (age > 18) {
    		old++;
    	}//end if statement
    	else{
    		young++;
    	}
    	}//end for loop
    	
    	System.out.println ("\nThe number that can vote " + old);
    	System.out.println ("\nThe number that can't vote " + young);  			
    	
    	}//end main method
    			
    		
    }//end class
   
    	
    
    
