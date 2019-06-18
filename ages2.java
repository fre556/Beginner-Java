/**
 * @(#)ages2.java
 *write a program to use a for loop to take in 5 ages
 *get the oldest
 *
 * @homeowork
 * @version 1.00 2011/10/5
 */

import java.util.Scanner;
public class ages2 {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare variables
    	int i, age, highest=0;  //set highest to 0

    	for (i=1; i<=5; i++) {
    		//prompt user for age
    		System.out.print("Enter age; ");
    		age=input.nextInt();
    		//check if age >highest
    		if(age >highest){
    		highest = age;
    		}//end if
    	}//end loop

    	System.out.println ("The highest age is " + highest );

    }//end main methos


}//end class