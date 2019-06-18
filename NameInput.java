/**
 * @(#)NameInput.java
 *
 *take a name from the user and print hello and the name
 * @author Graham Jordan
 * @version 1.00 2011/9/14
 */

import java.util.Scanner;
public class NameInput {

	//need this when taking inputs from the user

    public static void main (String args[]) {
    	
    	//needed when taking inputs from user
    	Scanner input = new Scanner (System.in);
    	
    	//declare variables
    	String name;
    	
    	//prompt user for name
    	System.out.print("Enter name : ");
    	
    	//take in the name
    	name = input.next();
    	
    	System.out.print("hello " + name);
    	
    }//End main method
    
    
}//End class

/*type your name and press enter
 *Output
 *Enter name : Graham Jordan
hello Graham
*/ 
