/**
 * @(#)arraygrades.java
 *
 *take in 5 grades and store them in an array
 *get the highets lowest and average
 * @author 
 * @version 1.00 2011/11/23
 */

import java.util.Scanner;
public class arraygrades {

    public static void main(String args[]) {
    	Scanner input = new Scanner (System.in);
    		
    		//variables
    		int grades []= new int [5];
    		int i,total =0,highest =0, lowest=100,average;
	    		
	    		for (i=	0; i<grades.length;i++) {
    			System.out.print ("enter grade " + (i+1) + ":");
    			grades[i] = input.nextInt();
    			total += grades[i];
    			
    			if (grades[i]>highest) {
    			highest=grades[i];
    			}
    			if (grades[i]< lowest) {
    				lowest=grades[i];
    			}//end if statement
    			}//end for
    			average=total/5;
    			System.out.println"\nAverage of all ages is " + average);
    			System.out.println ("\nHighest of all ages is" + highest);
    			System.out.println ("\nlowest grade is " + lowest);
    }//end main method
        
}//end class