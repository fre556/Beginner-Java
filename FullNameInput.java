/**
 * @(#)FullNameInput.java
 *
 *this program will print the person inputting's full name
 * @author Graham Jordan
 * @version 1.00 2011/9/14
 */


import java.util.Scanner;

public class FullNameInput {

    public static void main (String args[]) {
    	
    	//needed when entering variables
    	Scanner input = new Scanner (System.in);
    	
    	//declaring variables
    	String name;
    	String surname;
    	
    	//print user prompt
    	System.out.print ("Enter name : ");
    	
    	//assigning user input to variable
    	name = input.next();
    	
    	//print user prompt for surname
    	System.out.print ("Enter Surname : ");
    	
    	//assigning user input as surname
    	surname = input.next();
    	
    	//prints hello plus user name and surname
    	System.out.print("hello " + name);
    	System.out.print(" " + surname);
    	
    	
     }//End main method
    
    
}//End Class

/*
 *Output
 *Enter name : graham
Enter Surname : Jordan
hello graham Jordan
*/

