/**
 * @(#)login.java
 *
 *ask a person for the user name and password
 *print welco9me if they print username and password correctly
 * @author 
 * @version 1.00 2011/12/5
 */

import java.util.Scanner;
public class login {

    public static void main(String args[]) {
    	Scanner input=new Scanner (System.in);
    	
    	String password = "";
    	String username = "";
    	int counter = 3;
    	
    	System.out.print ("Enter username: ");
    	username = input.next();
    		
    	System.out.print ("Enter Password: ");
    	password = input.next();
    			
    	password = password.toLowerCase();
    	//decrement
    	counter--;
    		
    	
    	while (!username.matches ("derekcaulfield")) {
    		System.out.println ("Error, please reenter username: ");
    		//take the username 
    		System.out.print ("Enter user name");
    		username = input.next();
    				
    		if (counter==0) {
    			System.out.println("incorrect username please type again");
    					
    		}//end if
    	}//end while loop
    	
    	while (!password.matches ("deadly")) {
    		System.out.println ("Error. please re-enter password");
    		//take the username
    		System.out.println ("Enter password");
    		password = input.next();
    		System.out.print ("\n");
    		if (counter==0) {
    			System.out.println("incorrect password please type again");
    					
    		}//end if 
    	}//end while
    		
    	System.out.print ("welcome");
    
	}//end main
}//end class

/*output
 *Error, please reenter username: 
 *Enter user name
 *derekcaulfield
 *Error. please re-enter password
 *Enter password
 *deadly
 *welcome
 *Process completed.
 *
 *
 *
 *
 *
 *
 */