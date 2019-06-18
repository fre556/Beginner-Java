/**
 * @(#)password.java
 *take a password from the user and do not let the userrun a program without the password
 *or they decide to quit the program
 * @author
 * @version 1.00 2011/11/30
 */

import java.util. Scanner;
public class password {

    public static void main(String args[]) {
    	Scanner input = new Scanner (System.in);
    	String password = "";
    	int counter = 3;

    	//take password from user
    	System.out.print ("Enter password: ");
    	password=input.next();
    	//change all to lower case
    	password = password.toLowerCase();
    	//check if password matches
    	//decrement
    	counter--;

    	while (!password.matches ("password123") ){
    	System.out.println ("Error, please re-enter password");
    	//take the password from the user
    	System.out.print ("Enter password: ");
    	password=input.next();
    	password = password.toLowerCase();
    	//decrement
    	counter--;
    	if (counter ==0) {
    		System.out.println ("Incorrect,no more guesses");
    		//end program
    		System.exit(0);
    		}//end if

    	}//end while

    	System.out.println ("welcome");
    }//end main method


}//end class