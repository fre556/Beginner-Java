/**
 * @(#)FiveGradesarray.java
 *highest , 5 grades , average, passes 
 *and fails,distictinction , `
 *
 * @author 
 * @version 1.00 2011/11/28
 */


import java.util.Scanner;
public class arraygrades {

    public static void main(String args[]) {
    	Scanner input = new Scanner (System.in);
    		
    		//variables
    		int grades []= new int [5];
    		int i,total =0,highest =0,average;
    		int passes, fails,merits,distictions;
	    		
	    		for (i=	0; i<grades.length;i++) {
    			System.out.print ("enter grade " + (i+1) + ":");
    			grades[i] = input.nextInt();
    			total=total + grade;
    			
    			if (grades[i]>highest) {
    			highest=grades[i];
    			}
	    		if (grades[i] > 49) {
	    		passes++;
	    		}
	    		else{
	    		fails++;
	    		}
    			}//end for
    			average=total/5;
    			System.out.println"\nAverage of all ages is " + average);
    			System.out.println ("\nHighest of all ages is" + highest);
    			System.out.println ("\nNumber of passes " + passes);
    			System.out.println ("\nNumber of fails " + fails);
    		
    }//end main method
        
}//end class