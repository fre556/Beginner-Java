/**
 * @(#)AgeArray.java
 *take in  ages
 *print the ages that are older than the average
 * @author
 * @version 1.00 2011/11/28
 */

import java.util.Scanner;
public class AgeArray {

    public static void main(String args[]) {
    	Scanner input = new Scanner (System.in);

    	int ages[] = new int[5];
    	int i, average, total=0,flag=0;

    	 for (i=0;i<ages.length;i++) {
    	 	System.out.print ("Enter age " + (i+1) + ":" );
	    	ages[i]=input.nextInt();
		    }//end for loop
	    	total=total + ages[i];
			average=total/5;
			System.out.println("\nAges above average are:\n");
			for (i=0;i<ages.length;i++) {
			if (ages[i]>average) {
				System.out.print ("\n");
				System.out.println (ages[i] + " is greater then the average");
			}//end if

			}//end for loop
			System.out.println("\nAges above 30 are:\n");
			for (i=0;age[i]>30;i+) {
			if(age[i]>30) {
		    //flag







}//end main method
}//end class
    }
	}
