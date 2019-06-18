/**
 * @(#)Arrays.java
 *
 *
 * @author 
 * @version 1.00 2011/11/23
 */

import java.util.Scanner;
public class Arrays {

    public static void main(String args[]) {
    	Scanner input= new Scanner (System.in);
    	//variables
    	int ages []= new int [5];
    	int i,total =0;
    	
    	//show default values in array
	    	System.out.println ("i\t\tage");
	    	for (i=	0; i<ages.length;i++) {
	    		System.out.println (i+ "\t\t" + ages [i]);
	    		}//end for loop
    		
    		for (i=	0; i<ages.length;i++) {
    			System.out.print ("enter age " + (i+1) + ":");
    			ages[i] = input.nextInt();
    			total += ages[i];
    			}//end for
    		System.out.println ("\nTotal of all ages is " + total);
    			
    		
    	
    }//end main method
    
    
}//end class