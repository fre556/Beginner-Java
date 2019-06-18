/**
 * @(#)hillowarray.java
 *
 *five names as part of method, print highets bane (not age)
 * @author
 * @version 1.00 2011/12/14
 */

import java.util.Scanner;
public class hillowarray {

    public static void main(String args[]) {
    	Scanner input=new Scanner (System.in);
    	String names []= {"bob", "bill", "ben", "fred", "ted"};
    	int ages[] = {21,22,19,18,24};

    	int i, highsub=0 , highest=0,lowsub=0,lowest=200;

    	for (i=0;i<ages.length;i++) {
    		if (ages[i]>highest) {
    			highest=ages[i];
    			highsub=i;
    		}//end if
    		} //end for


    	for (i=0;i<ages.length;i++) {
    		if (ages[i]<lowest) {
    			lowest=ages[i];
    			lowsub=i;
    		}//end if
    	}//end for

    	System.out.println ("The oldest person is " + names[highsub]);
    	System.out.println ("The youngest persob is " + names[lowsub]);


    }//end main


}//ens class