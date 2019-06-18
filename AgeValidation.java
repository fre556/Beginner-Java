/**
 * @(#)AgeValidation.java
 *
 *take in 5 ages and store them in an array get the average age
 *check errors ans stuff:-)
 * @author 
 * @version 1.00 2011/11/30
 */

import java.util.Scanner;
public class AgeValidation {

    public static void main(String args[]) {
    Scanner input = new Scanner (System.in);
    	int ages []= new int [5];
    	int i,average, total=0;
    	String strage;
    	
    	System.out.println ("i\t\tage");
	    	for (i=	0; i<ages.length;i++) {
	    		System.out.println (i+ "\t\t" + ages [i]);
	    	}//end for loop
    		
    		for (i=	0; i<ages.length;i++) {
    			System.out.print ("enter age " + (i+1) + ":");
    			strage = input.next();
    			
    			while (!strage.matches("\\d+")){
    			System.out.println ("Error numbers only");
    			System.out.print ("Enter age: ");
    			strage = input.next();
    			//change strage to an int
    			}
    			ages[i] = Integer.parseInt(strage);
    			total = total + ages[i];
    		}//end for
    			
    			average = total/ages.length;
    		
    		System.out.print ("\n");
    		System.out.println ("The average is " + average );
    		System.out.print ("\n");
    		System.out.println ("Good job everybody :-)");
    }//end main method
    
    
}//end class